package University;

public class Aspirant extends Person {

    private String thesisName;


    public String getThesisName() {
        return thesisName;
    }

    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }


    public Aspirant(String name, Gender gender, String faculty, String thesisName) {
        super(name, gender, faculty);
        this.thesisName = thesisName;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "thesisName='" + getThesisName() + '\'' +
                '}';
    }

}
