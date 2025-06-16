public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.setStudentName("John Doe");
        controller.setStudentId(12345);
        controller.setStudentGrade(85.5);

        controller.updateView();
    }
}