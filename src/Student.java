public class Student {
    private String name;
    private String gmail;

    public Student() {
    }

    public Student(String name, String gmail) {
        this.name = name;
        this.gmail = gmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gmail='" + gmail + '\'' +
                '}';
    }
}
