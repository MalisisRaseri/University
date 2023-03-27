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

        Person[] people = {teacher1, teacher2, student1, student2, student3, aspirant1};

        for(Person p : people) {
            String className = p.getClass().getName();
            switch (className) {
                case "University.Teacher":
                    Teacher t = (Teacher) p;
                    String genderTeacher = (p.getGender() == Person.Gender.MALE) ? "He" : "She";
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
                            "This is " +
                                    t.getName() + ". " +
                                    genderTeacher + " teaches at " +
                                    t.getFaculty() + "."
                    );
                    /*
                   • для преподавателей: «{He/she} has {degree} degree in {specialty}.», где:
                     • {degree} — учёная степень;
                     • {specialty} — название специальности.
                     */
                    System.out.println(
                        genderTeacher + " has " + t.getDegree() + " degree in " + t.getQualification() + " ."
                    );
                    break;
                case "University.Student":
                    Student s = (Student) p;
                    String genderStudent = (p.getGender() == Person.Gender.MALE) ? "He" : "She";

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
                            "This is " + s.getName() + ". " +
                                    genderStudent + " studies at " + s.getFaculty() + "."
                    );
                    /*
                     • для студентов: «{He/she} is {N}‘th year {stage} student.», где:
                     • {N} — номер курса;
                     • {stage} — ступень обучения.
                     */
                    System.out.println(
                            genderStudent + " is " + s.getCourse() + "th year " + s.getTypeOfStudent() + " student."
                    );
                    break;
                case "University.Aspirant":
                    Aspirant a = (Aspirant) p;
                    String genderAspirant = (p.getGender() == Person.Gender.MALE) ? "He" : "She";
                    String genderHisHerAspirant = (p.getGender() == Person.Gender.MALE) ? "His" : "Her";
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
                            "This is " + a.getName() + ". " +
                                    genderAspirant + " studies at " + a.getFaculty() + ".");
                    /*
                    • для аспирантов: «{His/her} thesis title is “{thesis-title}”», где:
                    • {thesis-title} — тема диссертации.
                     */
                    System.out.println(
                            genderHisHerAspirant + " thesis title is "+ "\"" + a.getThesisName() + "\"."
                    );
                    break;
            }
        }
    }

}
