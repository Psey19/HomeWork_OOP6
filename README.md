# HomeWork_OOP6
Здравствуйте, сейчас попробую описать, какой рефакторинг был осуществлен и для каких целей.

Для реализации принципа DIP я создал класс User, в котором я осуществляю вызов UniversityPerson(раньше он был User),
теперь UniversityPerson становится посредником(абстрактным классом), от которого уже будет наследоваться класс Student,
также туда можно было бы добавить в наследники Teacher, Rector и т.д.

Для соблюдения принципа ISP я создал дополнительный интерфейс UniversityPersonView, который наследуется от интерфейса ListView(бывший UserView),
расширяя его возможности. Таким образом класс StudentView имплементирует более узкий класс ListView, а UniversityPersonView подойдет, например, 
классу Teacher для вывода дисциплины, которую он преподаёт.

Для соблюдения принципа LSP я 
