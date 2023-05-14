package University;

import java.util.Collection;

public class Student extends Person{

    private TypeOfStudent typeOfStudent;
    private Course course;

    public Student(String name, Gender gender, String faculty, TypeOfStudent typeOfStudent, Course course) {
        super(name, gender, faculty);
        this.typeOfStudent = typeOfStudent;
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public TypeOfStudent getTypeOfStudent() {
        return typeOfStudent;
    }


    //  120-1-4 Реализуйте в классе Student из соответствующей задачи 110-го курса статический метод,
    //  заполняющий заданную коллекцию типа Collection<Student> данными о некоторых студентах
    //  (например, данными, приведёнными в примере в задаче 110-го курса).

    public static void fillInCollection(Collection<? super Student> collection, Person[] persons){
        for(Person person : persons){
            if(person instanceof Student)
                collection.add((Student)person);}
    }

    public void setTypeOfStudent(TypeOfStudent typeOfStudent) {
        this.typeOfStudent = typeOfStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "typeOfStudent=" + typeOfStudent +
                ", course=" + course +
                '}';
    }

    public enum TypeOfStudent{
        BACHELOR, MASTER, ASPIRANT
    }

    public enum Course{
        I, II, III
    }
}
