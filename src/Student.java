import java.time.LocalDate;

public class Student {
    private String name;
    private String surName;
    private char gender;
    private LocalDate dateofStart;
    private Educationcenter educationcenter;

    public Student(String name, String surName, char gender, LocalDate dateofStart, Educationcenter educationcenter) {
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.dateofStart = dateofStart;
        this.educationcenter = educationcenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDateofStart() {
        return dateofStart;
    }

    public void setDateofStart(LocalDate dateofStart) {
        this.dateofStart = dateofStart;
    }

    public Educationcenter getEducationcenter() {
        return educationcenter;
    }

    public void setEducationcenter(Educationcenter educationcenter) {
        this.educationcenter = educationcenter;
    }

    @Override
    public String toString() {
        return "\nStudent  " +
                "\nname= :" + name + '\'' +
                " \nsurName= :" + surName + '\'' +
                "\n gender :" + gender +
                "\n dateofStart :"  +getDateofStart()+
                "\n educationcenter :" + educationcenter
                ;
    }
}
