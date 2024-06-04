package Task_1.Controller;

import Task_1.Model.Student;
import Task_1.Model.StudentGroup;
import Task_1.Model.User;
import Task_1.Service.StudentGroupService;
import Task_1.Controller.UserController;
import Task_1.View.StudentView;
import Task_1.View.ViewUser;

import java.util.ArrayList;

public class StudentController implements UserController<Student> {

    private StudentGroup students = new StudentGroup(new ArrayList<>());
    private StudentGroupService service = new StudentGroupService(students);
    private StudentView studentView = new StudentView();
    private ViewUser viewUser;



    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        if(!students.getStudentList().isEmpty())
            maxId = students.getStudentList().get(students.getStudentList().size() - 1).getId() + 1;
        Student student = new Student(maxId, firstName, secondName, lastName);
        students.addStudent(student);
    }

    public Student getStudent(int studentId){
        return students.getStudentList().get(studentId);
    }

    public void printStudentList(){
        studentView.sendListOnConsole(students.getStudentList());
    }
    public void printSortedStudentList(){
        studentView.sendListOnConsole(service.getSortedStudentGroupFSL());
    }
    public void printStudent(Student student){
        viewUser = new ViewUser(student);
        viewUser.printUser();
    }
}

