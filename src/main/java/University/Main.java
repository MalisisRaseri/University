package University;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Serge Johansson", Person.Gender.MALE, "Computer science", Teacher.Degree.PhD, "Programming paradigms");
        Teacher teacher2 = new Teacher("Sandra Turner", Person.Gender.FEMALE, "Jurisprudence", Teacher.Degree.DOCTOR, "Domestic arbitration");
        Student student1 = new Student("Leo Wolkinson", Person.Gender.MALE, "Computer science", Student.TypeOfStudent.BACHELOR, Student.Course.III);
        Student student2 = new Student("Anna Cunningham", Person.Gender.FEMALE, "World economy", Student.TypeOfStudent.BACHELOR, Student.Course.I);
        Student student3 = new Student("Jill Lundqvist", Person.Gender.FEMALE, "Jurisprudence", Student.TypeOfStudent.MASTER, Student.Course.I);
        Aspirant aspirant1 = new Aspirant("Ronald Correa", Person.Gender.MALE, "Computer science", "Design of a functional programming language");


        student2.print();
        teacher1.print();
        aspirant1.print();


        Person[] people = {teacher1, teacher2, student1, student2, student3, aspirant1};

        Person.printAll(people);





    }

}
