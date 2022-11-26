package WowWow.FG;

public class Student extends Human{
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student(String name,String groupName) {
        super(name);
        this.groupName=groupName;
    }

    public void printInfo(){
        System.out.println("Этого человека зовут"+ super.getName());
        System.out.println("Этого студента зовут"+ getName());
    }
}
