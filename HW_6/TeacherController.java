import java.util.List;

public class TeacherController {

    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController() {
        this.teacherService = new TeacherService();
        this.teacherView = new TeacherView();
    }

    public void createTeacher(String name, int age, String subject) {
        Teacher teacher = new Teacher(name, age, subject);
        teacherService.addTeacher(teacher);
    }

    public void editTeacher(int index, String name, int age, String subject) {
        Teacher teacher = new Teacher(name, age, subject);
        teacherService.editTeacher(index, teacher);
    }

    public void showAllTeachers() {
        List<Teacher> teachers = teacherService.getAllTeachers();
        teacherView.printTeachers(teachers);
    }

}