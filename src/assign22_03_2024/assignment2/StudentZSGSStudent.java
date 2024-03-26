package assign22_03_2024.assignment2;
class Student{
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    String name;
    int id;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
class ZSGSStudent extends Student {
    private String schoolName;

    public ZSGSStudent(String name, int id, String schoolName) {
        super(name, id);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "ZSGSStudent{" +
                "Name='" + name + '\'' +
                "id ='" + id + '\'' +
                "schoolName='" + schoolName + '\'' +
                '}';
    }
}

public class StudentZSGSStudent {
    public static void main(String[] args) {
        ZSGSStudent zsgsStudent = new ZSGSStudent("tamil",12,"zoho");
        System.out.println(zsgsStudent);
    }
}
