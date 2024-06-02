package Task_1.Model;

//Здесь представлена реализация принципа DIP
public class User {
    UniversityPerson universityPerson;

    public User(UniversityPerson universityPerson) {
        this.universityPerson = universityPerson;
    }

    public void showPerson() {
        universityPerson.showPerson();
    }

    public UniversityPerson getUniversityPerson() {
        return universityPerson;
    }

    @Override
    public String toString() {
        return "User{" +
                "universityPerson=" + universityPerson +
                '}';
    }
}
