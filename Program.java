package Task_1;

import Task_1.Controller.StudentController;
import Task_1.Model.Student;
import Task_1.Model.UniversityPerson;
import Task_1.Model.User;


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

        UniversityPerson universityPerson = new Student(5, "rt", "frf", "rfrfr");
        universityPerson.showPerson();
        System.out.println("-----------------------------");
        User user = new User(new Student(6,"Grisha", "N.", "J."));
        user.showPerson();
        System.out.println("-----------------------------");



    }
}
