public class StudentController {
    private final Student student;
    private final StudentView view;

    public StudentController(Student student, StudentView view) {
        this.student = student;
        this.view = view;
    }

    public void setStudentName(String name) {
        student.name = name;
    }
    public String getStudentName() {
        return student.name;
    }
    public void setStudentId(int id) {
        student.id = id;
    }
    public int getStudentId() {
        return student.id;
    }
    public void setStudentGrade(double grade) {
        student.grade = grade;
    }
    public double getStudentGrade() {
        return student.grade;
    }
    public void updateView() {
        view.displayStudentDetails(student.name, student.id, student.grade);
    }
}
