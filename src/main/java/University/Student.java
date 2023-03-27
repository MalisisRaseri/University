package University;

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
        BACHELOR, MASTER, ASPIRANT;
    }

    public enum Course{
        I, II, III;
    }
}
