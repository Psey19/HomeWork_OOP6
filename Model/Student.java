package Task_1.Model;

public class Student extends User implements Comparable<Student>{
    private int studentId;



    public Student(int studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }


    public int getId() {
        return studentId;
    }

    @Override
    public void showPerson() {
        super.showPerson();
        System.out.print(" - Student");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId + " " +
                super.toString() +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (studentId > o.getId())
        return 1;
        if (studentId < o.getId())
            return -1;
        return 0;
    }
}
