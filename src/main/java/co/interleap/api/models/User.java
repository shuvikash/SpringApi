package co.interleap.api.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usercollection")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "username")
    private String userName;
    public User() {

    }
    public User(int id, String userName) {
        this.id = id;
        this.userName=userName;
    }
    @ManyToMany
    @JoinTable(name = "usercourse", joinColumns = @JoinColumn(name = "userid", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "courseid", referencedColumnName = "id"))
    private List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void seUserName(String userName) {
        this.userName = userName;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", userName=" + userName + "]";
    }
}
