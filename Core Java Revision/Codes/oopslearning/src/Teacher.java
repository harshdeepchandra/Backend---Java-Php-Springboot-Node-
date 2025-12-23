import custom.Student;

public class Teacher {
    private Long id;
    private String name;
    private String subject;
    private Double experience;

    public String getTeacherDetails() {
        String details = "Id: " + id + ", Name: " + name + ", Subject: " + subject + ", Experience: " + experience;
        return details;
    }

    void random() {
        Student st1 = new Student();
        st1.id = 1l;
    }

}
