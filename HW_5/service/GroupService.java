package HW_5.service;

import HW_5.model.Student;
import HW_5.model.StudentGroup;
import HW_5.model.Teacher;

import java.util.ArrayList;

public class GroupService {
    public StudentGroup CreateGroup(Integer num, Teacher teacher, Student... students){
        ArrayList<Student> listStudent = new ArrayList<>();
        for (Student student: students){
            listStudent.add(student);
        }
        return new StudentGroup(num, teacher, listStudent);
    }
}
