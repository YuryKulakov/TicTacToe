package Arrays.Task3;

public class Artist {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

     String name;
     int age;

    public Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Artist|" + name +
                ", age=" + age +
                '|';
    }
}
