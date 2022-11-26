package Task1;

import java.util.Random;

public class Teacher {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void evaluate(Student student){
        int max=5;
        int min=2;
        int diff=max-min;
        int grade;
        Random rand=new Random();
        grade= rand.nextInt(diff-1)+min;

        System.out.println("Teacher "+this.getName()+" assessed the student "+student.getName()+" by subject "+this.getSubject()+" on grade "+grade);

    }
}
