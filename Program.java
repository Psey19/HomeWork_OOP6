package Task_1;

import Task_1.Controller.StudentController;



public class Program {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        controller.create("Roman", "E.", "P.");
        controller.create("Semen", "D.", "M.");
        controller.create("Kostya", "P.", "N.");
        controller.create("Misha", "E.", "P.");
        controller.printStudentList();
        System.out.println("-----------------------------");
        controller.printSortedStudentList();
        System.out.println("-----------------------------");
        controller.printStudent(controller.getStudent(3));





    }
}
