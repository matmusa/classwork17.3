import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        College college = new College("peakSosft", "Kyrgyzstan", LocalDate.of(2020, 12, 10));

        Student student = new Student("Matmusa", "Abduvohob uulu", 'M', LocalDate.of(2022, 11, 11), college);
        Student student1 = new Student("Zhakshylyk", "Zamirbekov", 'M', LocalDate.of(2020, 11, 12), new University("Manas", "Kyrgyzstan", LocalDate.of(1985, 12, 10)));
        Student student2 = new Student("Madina", "Akpaeva", 'W', LocalDate.of(2016, 11, 22), new University("Ala-Too", "Kyrgyzstan", LocalDate.of(2020, 12, 10)));
        Student student3 = new Student("Miryan", "Tashtanov ", 'M', LocalDate.of(2017, 11, 23), new School("Zhemchhunina", "Kyrgyzstan", LocalDate.of(2020, 12, 10)));
        Student student4 = new Student("Marat", "Samatov", 'M', LocalDate.of(2018, 11, 14), new University("Harvard", "USA", LocalDate.of(1980, 1, 27)));
        Student student5 = new Student("Ruslan", "Manas", 'M', LocalDate.of(2022, 11, 22), new College("peakSosft", "Kyrgyzstan", LocalDate.of(2020, 12, 10)));
        Student student6 = new Student("Bahtiyar", "Arapbai uulu", 'M', LocalDate.of(2009, 11, 11), new College("peakSosft", "Kyrgyzstan", LocalDate.of(2020, 12, 10)));
        Student student7 = new Student("Manas ", "Abdugani uulu", 'M', LocalDate.of(2002, 11, 19), new College("peakSosft", "Kyrgyzstan", LocalDate.of(2020, 12, 10)));
        Student student8 = new Student("Bob", "Charley", 'M', LocalDate.of(2022, 11, 10), new University("Cambrige", "USA", LocalDate.of(1967, 11, 11)));
        Student student9 = new Student("Calvin", "Presley", 'M', LocalDate.of(2011, 11, 18), new University("Standford", "USA", LocalDate.of(1955, 9, 14)));

        Student[] students = {student, student1, student2, student2, student3, student4, student5, student6, student7, student8, student9};

        oneMethod(students);
    }

    public static void oneMethod(Student[] students) {

        for (Student a : students
        ) {
            Period ped = Period.between(a.getDateofStart(), LocalDate.now());
            System.out.println(a.toString());
            System.out.println(ped);
        }
    }
}