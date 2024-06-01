package HW_5.controller;

import HW_5.model.Student;
import HW_5.model.StudentGroup;
import HW_5.model.Teacher;
import HW_5.model.User;
import HW_5.service.GroupService;
import HW_5.service.UserService;
import HW_5.view.StudentView;

import java.util.List;

public class Controller {
    private UserService userService;
    private GroupService groupService;
    private StudentView studentView;

    public Controller() {
        this.userService = new UserService();
        this.groupService = new GroupService();
        this.studentView = new StudentView();
    }

    public Student createStudent(Student student) {
        return (Student) userService.create(student);
    }

    public Teacher createTeacher(Teacher teacher) {
        return (Teacher) userService.create(teacher);
    }

    public StudentGroup createGroup(Integer num, Teacher teacher, Student... students) {
        return groupService.CreateGroup(num, teacher, students);
    }

    public void printStudents(Student student) {
        studentView.printStudent(student);
    }

    public List<User> returnStudents() {
        return userService.read();
    }
}
