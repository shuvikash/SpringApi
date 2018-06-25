package co.interleap.api.models;

import javax.persistence.*;

@Entity
@Table(name = "usercourse")
public class UserCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "userid")
    private int userid;

    @Column(name = "courseid")
    private int courseid;

    public UserCourse() {

    }
    public UserCourse(int id,int userid, int courseid) {
        this.id=id;
        this.userid = userid;
        this.courseid=courseid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    @Override
    public String toString() {
        return "UserCourse{" +
                "id=" + id +
                ", userid=" + userid +
                ", courseid=" + courseid +
                "}";
    }
}
