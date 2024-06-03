package Task_1.Service;

import Task_1.Model.Student;
import Task_1.Model.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    public StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Student> getSortedStudentGroup(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }
    public List<Student> getSortedStudentGroupFSL() {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new UserComparator<Student>());
        return studentList;
    }
}
