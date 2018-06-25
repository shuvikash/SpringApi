package co.interleap.api;

import javax.persistence.*;

@Entity
@Table(name = "coursecollection")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "coursename")
    private String courseName;

    @Column(name = "description")
    private String description;

    @Column(name = "level")
    private int level;

    @Column(name = "length")
    private String length;
    public Course() {

    }
    public Course(int id, String courseName, String description, int level, String length) {
        this.id = id;
        this.courseName=courseName;
        this.description=description;
        this.level=level;
        this.length=length;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", courseName=" + courseName + ", description=" + description + ", level=" + level + ", length=" + length + "]";
    }
}
