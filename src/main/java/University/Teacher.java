package University;

import java.util.Objects;

public class Teacher extends Person {

    private Degree degree;
    private String qualification;

     public Teacher(String name, Gender gender, String faculty, Degree degree, String qualification) {
         super(name, gender, faculty);
         this.degree = degree;
         this.qualification = qualification;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "degree=" + degree +
                ", qualification='" + qualification + '\'' +
                '}';
    }

    public enum Degree{
        CANDIDATE, DOCTOR, PhD;
    }

}
