package Task_1.Controller;

import Task_1.Model.Student;
import Task_1.Model.StudentGroup;
import Task_1.Service.StudentGroupService;
import Task_1.Controller.UniversityPersonController;
import Task_1.View.StudentView;

import java.util.ArrayList;

public class StudentController implements UniversityPersonController<Student> {
    //Здесь наглядно продемонстрирован принцип OSP,
//Данный класс реализует методы интерфейса UserController и расширяет его возможности новыми методами


    private StudentGroup students = new StudentGroup(new ArrayList<>());
    private StudentGroupService service = new StudentGroupService(students);
    private StudentView studentView = new StudentView();


    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        if(!students.getStudentList().isEmpty())
            maxId = students.getStudentList().get(students.getStudentList().size() - 1).getId() + 1;
        Student student = new Student(maxId, firstName, secondName, lastName);
        students.addStudent(student);
    }

    public void printStudentList(){
        studentView.sendListOnConsole(students.getStudentList());
    }
    public void printSortedStudentList(){
        studentView.sendListOnConsole(service.getSortedStudentGroupFSL());
    }
}
