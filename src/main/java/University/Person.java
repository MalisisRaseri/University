package University;
import java.util.Collection;

public class Person {

    private String name;
    private Gender gender;
    private String faculty;

    public Person(String name, Gender gender, String faculty) {
        this.name = name;
        this.gender = gender;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", faculty='" + getFaculty() + '\'' +
                '}';
    }

    public enum Gender {
        MALE, FEMALE
    }

    ///120-1-3  Реализуйте в классе Person из соответствующей задачи 110-го курса статический метод,
    // печатающий данные обо всех персонах, содержащихся в заданном наборе, реализующим
    //Iterable<Person>.
    public static void printAll(Collection<? extends Person> collection){
        collection.forEach(Person::print);
    }

    //110-2-1
    public void print(){

        if(Person.this instanceof University.Teacher) {
            /*
                     Для всех должна печататься фраза «This is {name}. {He/she} {verb} at {department}», где:
                     • {name}— фамилия и имя;
                     • {He/she} — местоимение в зависимости от пола;
                     • {verb} — глагол:
                     • «teaches» для преподавателей;
                     • «studies» для всех студентов.
                     • {department} — название факультета.
                     */
            String genderTeacher = (this.getGender() == Person.Gender.MALE) ? "He" : "She";
            System.out.println(
                    "This is " +
                            this.getName() + ". " +
                            genderTeacher + " teaches at " +
                            this.getFaculty() + "."
            );
            /* для преподавателей: «{He/she} has {degree} degree in {specialty}.», где:
                     • {degree} — учёная степень;
                     • {specialty} — название специальности.
                     */
            System.out.println(
                        genderTeacher + " has " + ((Teacher) Person.this).getDegree() + " degree in " + ((Teacher) Person.this).getQualification() + " ."
                    );
        }
        if(Person.this instanceof University.Student) {
            String genderStudent = (this.getGender() == Person.Gender.MALE) ? "He" : "She";

                     /*
                     Для всех должна печататься фраза «This is {name}. {He/she} {verb} at {department}», где:
                     • {name}— фамилия и имя;
                     • {He/she} — местоимение в зависимости от пола;
                     • {verb} — глагол:
                     • «teaches» для преподавателей;
                     • «studies» для всех студентов.
                     • {department} — название факультета.
                     */
                    System.out.println(
                            "This is " + this.getName() + ". " +
                                    genderStudent + " studies at " + this.getFaculty() + "."
                    );
                    /*
                     • для студентов: «{He/she} is {N}‘th year {stage} student.», где:
                     • {N} — номер курса;
                     • {stage} — ступень обучения.
                     */
                   System.out.println(
                            genderStudent + " is " + ((Student) Person.this).getCourse() + "th year " + ((Student) Person.this).getTypeOfStudent() + " student."
                    );
        }
        if(Person.this instanceof University.Aspirant){
            String genderAspirant = (this.getGender() == Person.Gender.MALE) ? "He" : "She";
            String genderHisHerAspirant = (this.getGender() == Person.Gender.MALE) ? "His" : "Her";
                     /*
                     Для всех должна печататься фраза «This is {name}. {He/she} {verb} at {department}», где:
                     • {name}— фамилия и имя;
                     • {He/she} — местоимение в зависимости от пола;
                     • {verb} — глагол:
                     • «teaches» для преподавателей;
                     • «studies» для всех студентов.
                     • {department} — название факультета.
                     */
                    System.out.println(
                            "This is " + this.getName() + ". " +
                                    genderAspirant + " studies at " + this.getFaculty() + ".");
                    /*
                    • для аспирантов: «{His/her} thesis title is “{thesis-title}”», где:
                    • {thesis-title} — тема диссертации.
                     */
                   System.out.println(
                            genderHisHerAspirant + " thesis title is "+ "\"" +((Aspirant) Person.this).getThesisName() + "\"."
                    );
        }
    }

//    public static void printAll(Person[] people){
//        for(Person p : people){
//            String className = p.getClass().getName();
//            switch (className) {
//                case "University.Teacher":
//                    Teacher t = (Teacher) p;
//                    String genderTeacher = (p.getGender() == Person.Gender.MALE) ? "M" : "F";
//                    System.out.println(
//                            "Name: " +
//                                    t.getName() + " Gender: " +
//                                    genderTeacher + " Faculty: " +
//                                    t.getFaculty() + " Degree: " + t.getDegree() + " Qualification: " + t.getQualification());
//                    break;
//                case "University.Student":
//                    Student s = (Student) p;
//                    String genderStudent = (p.getGender() == Person.Gender.MALE) ? "M" : "F";
//                    System.out.println(
//                            "Name: " + s.getName() + " Gender: " +
//                                    genderStudent + " Faculty: " + s.getFaculty() + " Degree: " + s.getTypeOfStudent() + " Course: " + s.getCourse());
//                    break;
//                case "University.Aspirant":
//                    Aspirant a = (Aspirant) p;
//                    String genderAspirant = (p.getGender() == Person.Gender.MALE) ? "M" : "F";
//                    System.out.println(
//                            "Name: " + a.getName() + " Gender: " +
//                                    genderAspirant + " Faculty: " + a.getFaculty() + " Thesis title: " + a.getThesisName());
//                    break;
//            }
//        }
//    }

}










