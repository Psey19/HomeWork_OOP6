package Task_1.Controller;

import Task_1.Model.UniversityPerson;

interface UniversityPersonController <T extends UniversityPerson>{
    void create(String firstName, String SecondName, String LastName);
}
