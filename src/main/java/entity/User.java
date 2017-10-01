package entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@XmlRootElement
public class User {

    private UUID id;
    private String login;
    private transient String password;
    private String role;
    private String email;
    private int likeCount;
    private int dislikeCount;
    private HashMap<Language, LanguageLevel> languages;
    private List<String> hobbies;
    private boolean banStatus;


    public User() {
    }

    public UUID getId() {
        return id;
    }
    @XmlElement
    public void setId(UUID id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }
    @XmlElement
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }
    @XmlElement
    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }
    @XmlElement
    public void setEmail(String email) {
        this.email = email;
    }

    public int getLikeCount() {
        return likeCount;
    }
    @XmlElement
    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getDislikeCount() {
        return dislikeCount;
    }
    @XmlElement
    public void setDislikeCount(int dislikeCount) {
        this.dislikeCount = dislikeCount;
    }

    public HashMap<Language, LanguageLevel> getLanguages() {
        return languages;
    }
    @XmlElement
    public void setLanguages(HashMap<Language, LanguageLevel> languages) {
        this.languages = languages;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
    @XmlElement
    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public boolean isBanStatus() {
        return banStatus;
    }
    @XmlElement
    public void setBanStatus(boolean banStatus) {
        this.banStatus = banStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", email='" + email + '\'' +
                ", likeCount=" + likeCount +
                ", dislikeCount=" + dislikeCount +
                ", languages=" + languages +
                ", hobbies=" + hobbies +
                ", banStatus=" + banStatus +
                '}';
    }

    public static void main(String[] args) {

            int a[][] = {{1, 2}, {3}};
            int b[][] = (int[][]) a.clone();
            a[0] = new int[]{0};
            System.out.println(b[0][0]);

    }


}

class Parent {
    int x = 2;
    public void print() {
        System.out.println(x);
    }
}
class Child extends Parent {
    int x = 3;

    public void print() {
        System.out.println(x);
    }
    public static void main(String[] args) {
        new Child().print();
    }
}