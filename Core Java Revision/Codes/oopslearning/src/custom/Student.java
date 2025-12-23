package custom;

public class Student {
    public Long id;
    String name;

    void getStudentCourse() {
        Course course = new Course();
        course.id = 1L;
    }
}
