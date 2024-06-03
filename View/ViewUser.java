package Task_1.View;

import Task_1.Model.User;
//Демонстрация DIP
public class ViewUser {
    User user;

    public ViewUser(User user) {
        this.user = user;
    }
    public void printUser(){
        System.out.println(user.toString());
    }
}
