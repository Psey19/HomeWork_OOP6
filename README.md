# HomeWork_OOP6
Здравствуйте, сейчас попробую описать, какой рефакторинг был осуществлен и для каких целей.

Для реализации принципа DIP я создал класс ViewUser, который создаёт экземпляр User, имеет конструктор на основе него и единственный метод по печати User,
этот метод я буду использовать в Контроллере, печатая студента.

Для соблюдения принципа ISP я создал дополнительный интерфейс UserView, который наследуется от интерфейса ListView(бывший UserView),
расширяя его возможности. Таким образом класс StudentView имплементирует более узкий класс ListView, а UserView подойдет, например, 
классу Teacher для вывода дисциплины, которую он преподаёт.

Для соблюдения принципа LSP можно увидеть, что класс наследник Student никак не нарушает поведение родителя User, повторяет его и добавляет возможности.

Для соблюдения принципа OCP я в классе User создал метод getPerson, который выводит статус Юзер, а в классе наследнике Student реализовал тот же метод с расширением,
теперь это будет не просто Юзер, а Юзер - Студент.

Для соблюдения принципа SRP во всех классах представлена реализация только методов, которые и определяют сам класс и его функционал.

