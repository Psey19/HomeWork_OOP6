package Task_1.View;

import Task_1.View.ListView;
import Task_1.Model.Student;

import java.util.List;
//Здесь мы можем наблюдать принцип ISP,
//используем для данного класса интерфейс только с нужными методами для данного класса,
//вместо более насыщенного интерфейса UserView
public class StudentView implements ListView<Student> {


    @Override
    public void sendListOnConsole(List<Student> universityPersons) {
        for (Student student: universityPersons){
            System.out.println(student);
        }

    }
}



