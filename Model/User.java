package Task_1.Model;

public abstract class User { //Здесь соблюдается принцип SRP
    private String firstName;
    private String secondName;
    private String lastName;

    public User(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    //Этот метод позволяет продемонстрировать соблюдение принципа OCP,
    //поскольку его реализация осуществляется классом наследником и расширяет ее.
    public  void showPerson(){
        System.out.print("User");
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
