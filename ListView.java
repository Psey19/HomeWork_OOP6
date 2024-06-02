package Task_1.View;

import Task_1.Model.UniversityPerson;

import java.util.List;

interface ListView<T extends UniversityPerson> {
    void sendListOnConsole(List<T> users);

}
