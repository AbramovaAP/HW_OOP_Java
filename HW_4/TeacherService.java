import java.util.ArrayList;

import java.util.List;



public class TeacherService {

    private List<Teacher> teachers;



    public TeacherService() {

        this.teachers = new ArrayList<>();

    }

 

    public void addTeacher(Teacher teacher) {

        teachers.add(teacher);

    }
 


    public void editTeacher(int index, Teacher teacher) {

        teachers.set(index, teacher);

    }



    public List<Teacher> getAllTeachers() {

        return teachers;

    }

}
