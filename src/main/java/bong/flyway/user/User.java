package bong.flyway.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String job;

    public User(String name, String job) {
        this.name = name;
        this.job = job;
    }
}
