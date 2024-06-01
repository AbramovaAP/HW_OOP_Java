public class Main {

    public static void main(String[] args) {

        TeacherController teacherController = new TeacherController();

        teacherController.createTeacher("John", 30, "Math");
        teacherController.createTeacher("Alice", 25, "English");
     
        teacherController.showAllTeachers();

        teacherController.editTeacher(1, "Bob", 27, "Physics");
      
        teacherController.showAllTeachers();
 
    } 
    

}