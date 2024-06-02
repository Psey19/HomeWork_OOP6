package Task_1.View;

import Task_1.Model.UniversityPerson;

import java.util.List;
//Здесь наглядно продемонстрирован принцип OSP,
//Данный интерфейс реализует методы интерфейса ListView и расширяет его возможности новым методом
interface UniversityPersonView<T extends UniversityPerson> extends ListView<T> {
    @Override
    default void sendListOnConsole(List<T> universityPersons) {

    }
    public void sendSubject(UniversityPerson universityPerson);
}
