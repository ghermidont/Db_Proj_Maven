package entities;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    //generates the value for the id column of database table.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column (name = "firstname")
    private String firstname;

    @Column (name = "lastname")
    private String lastname;

    @Column (name = "year_of_birth")
    private Integer year_of_birth;

    @Column (name = "average_mark")
    private Float average_mark;

    public Student() {}

    public Student(String firstname, String lastname, Integer year_of_birth, Float average_mark) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.year_of_birth = year_of_birth;
        this.average_mark = average_mark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(Integer year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public Float getAverage_mark() {
        return average_mark;
    }

    public void setAverage_mark(Float average_mark) {
        this.average_mark = average_mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", year_of_birth=" + year_of_birth +
                ", average_mark=" + average_mark +
                '}';
    }
}
