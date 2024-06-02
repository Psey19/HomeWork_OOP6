# HomeWork_OOP6
Здравствуйте, сейчас попробую описать, какой рефакторинг был осуществлен и для каких целей.

Для реализации принципа DIP я создал класс User, в котором я осуществляю вызов UniversityPerson(раньше он был User),
теперь UniversityPerson становится посредником(абстрактным классом), от которого уже будет наследоваться класс Student,
также туда можно было бы добавить в наследники Teacher, Rector и т.д.

Для соблюдения принципа ISP я создал дополнительный интерфейс UniversityPersonView, который наследуется от интерфейса ListView(бывший UserView),
расширяя его возможности. Таким образом класс StudentView имплементирует более узкий класс ListView, а UniversityPersonView подойдет, например, 
классу Teacher для вывода дисциплины, которую он преподаёт.

Для соблюдения принципа LSP я добавил в абстрактный базовый класс UniversityPerson абстрактный метод showPerson, который выведит должность человека
из университета (студент или учитель) и реализовал его в классе наследнике Student, также в классе Student полностью описывает сущность UniversityPerson
и расширяет описание, таким образом класс наследник без последствий заменяет класс родителя.

Для соблюдения принципа OCP во многих классах осуществлена имплементация различных интерфейсов, методы которых они реализуют

Для соблюдения принципа SRP во всех классах представлена реализация только методов, которые и определяют сам класс и его функционал.
Под вопросом только класс StudentController, здесь есть и создание студента и вывод на печать списка студентов, я не стал разделять это на разные классы, 
поскольку я так понял из лекций и семинаров, что класс контроллер для того и нужен, чтобы объединять в себе различные методы по работе с экземплярами класса,
и более удобной работе с ними в main.
