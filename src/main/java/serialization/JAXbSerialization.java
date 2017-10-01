package serialization;

import entity.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXbSerialization {
    public static void main(String[] args) {
//        User user = new User();
//        user.setLogin("login");
//        user.setId(UUID.randomUUID());
//
//        HashMap<Language, LanguageLevel> hashMap = new HashMap<>();
//        Language language = new Language();
//        language.setId(UUID.randomUUID());
//        language.setLanguage_name("English");
//        hashMap.put(language, LanguageLevel.INTERMEDIATE);
//        user.setLanguages(hashMap);
//        jaxbSerialize(user, User.class);


        User userInput = jaxbDeSerializeGeneric("1506863673662entity.User.xml", User.class);
        System.out.println(userInput);
    }

    public static void jaxbSerialize(Object object, Class<?> classObject) {
        try {
            File file = new File(System.currentTimeMillis() + classObject.getName() + ".xml");
            JAXBContext context = JAXBContext.newInstance(classObject);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(object, file);
            marshaller.marshal(object, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static <T> T jaxbDeSerializeGeneric(String filePath, Class<T> classObject) {
        try {
            File file = new File(filePath);
            JAXBContext context = JAXBContext.newInstance(classObject);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return classObject.cast(unmarshaller.unmarshal(file));
//            return (T) unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object jaxbDeSerialize(String filePath, Class<?> classObject) {
        try {
            File file = new File(filePath);
            JAXBContext context = JAXBContext.newInstance(classObject);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
