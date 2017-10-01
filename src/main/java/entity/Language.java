package entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.UUID;

@XmlRootElement
public class Language {
    private UUID id;
    private String language_name;

    public UUID getId() {
        return id;
    }

    @XmlElement
    public void setId(UUID id) {
        this.id = id;
    }

    public String getLanguage_name() {
        return language_name;
    }

    @XmlElement
    public void setLanguage_name(String language_name) {
        this.language_name = language_name;
    }
}
