package Task_1.Model;

public abstract class UniversityPerson { //Здесь соблюдается принцип SRP
    private String firstName;
    private String secondName;
    private String lastName;

    public UniversityPerson(String firstName, String secondName, String lastName) {
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

    //Этот абстрактный метод позволяет продемонстрировать соблюдение принципа LSP,
    //поскольку его реализация осуществляется классом наследником.
    public abstract void showPerson();

    @Override
    public String toString() {
        return "UniversityPerson{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
