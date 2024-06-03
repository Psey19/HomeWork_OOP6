package Task_1.Controller;

import Task_1.Model.User;

interface UserController <T extends User>{
    void create(String firstName, String SecondName, String LastName);
}
