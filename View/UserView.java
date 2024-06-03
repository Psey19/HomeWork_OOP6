package Task_1.View;

import Task_1.Model.User;

import java.util.List;
//Здесь наглядно продемонстрирован принцип OSP,
//Данный интерфейс реализует методы интерфейса ListView и расширяет его возможности новым методом
interface UserView<T extends User> extends ListView<T> {
    @Override
    default void sendListOnConsole(List<T> users) {

    }
    public void sendSubject(User user);
}
