package Task_1.View;

import Task_1.Model.User;

import java.util.List;

interface UserView<T extends User> extends ListView<T> {
    @Override
    default void sendListOnConsole(List<T> users) {

    }
    public void sendSubject(User user);
}
