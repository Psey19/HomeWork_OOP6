package Task_1.View;

import Task_1.Model.User;

import java.util.List;

interface ListView<T extends User> {
    void sendListOnConsole(List<T> users);

}
