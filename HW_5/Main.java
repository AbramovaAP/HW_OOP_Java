package HW_5;

import HW_5.controller.Controller;
import HW_5.model.Student;
import HW_5.model.StudentGroup;
import HW_5.model.Teacher;

public class Main {
    public static void main(String[] args) {
        Controller controller =  new Controller();
        // Создаем учеников первой группы
        Student student1_group1 = controller.createStudent(new Student("Иван", "Иванов", 15, 1));
        Student student2_group1 = controller.createStudent(new Student("Ольга", "Петрова", 16, 2));
        Student student3_group1 = controller.createStudent(new Student("Алексей", "Сидоров", 14, 3));

        // Преподаватель первой группы
        Teacher teacher_group1 = controller.createTeacher(new Teacher("Наталья", "Иванова", 35, 1));

        // Создаем первую группу
        StudentGroup group1 = controller.createGroup(1, teacher_group1, student1_group1, student2_group1, student3_group1);

        // Создаем учеников второй группы
        Student student1_group2 = controller.createStudent(new Student("Екатерина", "Михайлова", 16, 4));
        Student student2_group2 = controller.createStudent(new Student("Павел", "Николаев", 17, 5));
        Student student3_group2 = controller.createStudent(new Student("Мария", "Сергеева", 15, 6));

        // Преподаватель второй группы
        Teacher teacher_group2 = controller.createTeacher(new Teacher("Андрей", "Петров", 40, 2));

        // Создаем вторую группу
        StudentGroup group2 = controller.createGroup(2, teacher_group2, student1_group2, student2_group2, student3_group2);

        // Выводим информацию о группах
        System.out.println(group1.toString());
        System.out.println(group2.toString());

    }
}