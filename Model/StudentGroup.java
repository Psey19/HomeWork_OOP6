package Task_1.Model;

import Task_1.Service.StudentGroupIterator;

import java.util.Iterator;
import java.util.List;


public class StudentGroup implements Iterable<Student>{
    //выполнение OSP, поскольку мы здесь реализуем интерфейс Iterable
    private List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
     public void addStudent(Student student){
       studentList.add(student);
     }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "studentList=" + studentList +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(studentList);
    }
}
