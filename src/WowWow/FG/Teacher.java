package WowWow.FG;

public class Teacher extends Human {

    private String subjectName;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName=subjectName;
    }

    public void printInfo(){
        System.out.println("Этого человека зовут"+ super.getName());
        System.out.println("Этого преподавателя зовут"+ getName());
    }
}
