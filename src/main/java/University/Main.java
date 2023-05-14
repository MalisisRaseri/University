package University;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Teacher("Serge Johansson", Person.Gender.MALE, "Computer science", Teacher.Degree.PhD, "Programming paradigms");
        Person person2 = new Teacher("Sandra Turner", Person.Gender.FEMALE, "Jurisprudence", Teacher.Degree.DOCTOR, "Domestic arbitration");
        Person person3 = new Student("Leo Wolkinson", Person.Gender.MALE, "Computer science", Student.TypeOfStudent.BACHELOR, Student.Course.III);
        Person person4 = new Student("Anna Cunningham", Person.Gender.FEMALE, "World economy", Student.TypeOfStudent.BACHELOR, Student.Course.I);
        Person person5 = new Student("Jill Lundqvist", Person.Gender.FEMALE, "Jurisprudence", Student.TypeOfStudent.MASTER, Student.Course.I);
        Person person6 = new Aspirant("Ronald Correa", Person.Gender.MALE, "Computer science", "Design of a functional programming language");


        Person[] people = {person1, person2, person3, person4, person5, person6};

        //задачи 120-1-3 и 120-1-4

        Collection<Person> persons = new ArrayList<>(Arrays.asList(people));

        Person.printAll(persons);


        Collection<Teacher> teachers = new ArrayList<>();
        teachers.add((Teacher) person1);
        teachers.add((Teacher) person2);
        Person.printAll(teachers);

        Collection<Student> students = new ArrayList<>();
        Student.fillInCollection(students, people);
        Person.printAll(students);
    }
}


