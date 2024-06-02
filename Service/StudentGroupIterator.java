package Task_1.Service;

import Task_1.Model.Student;

import java.util.Iterator;
import java.util.List;

//выполнение OSP, поскольку мы здесь реализуем интерфейс Iterator
public class StudentGroupIterator implements Iterator<Student> {
    private List<Student> studentList;
    private int index = 0;

    public StudentGroupIterator(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public Student next() {
        if (hasNext())
            return studentList.get(index++);
        return null;
    }

    @Override
    public void remove() {
        if (hasNext())
            studentList.remove(index);
    }
}
