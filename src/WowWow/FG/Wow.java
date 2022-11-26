package WowWow.FG;

public class Wow {
    public static void main(String[] args) {
        Student stud = new Student("Arnhold","TEB-301");
        Teacher teach = new Teacher("Alexandra Ivanovna","Physics");

        System.out.println(stud.getGroupName());
        System.out.println(teach.getSubjectName());

        stud.printInfo();
        teach.printInfo();

    }
}
