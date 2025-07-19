package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        // Создание таблицы
        userService.createUsersTable();

        // Добавление 4 пользователей
        userService.saveUser("Иван", "Иванов", (byte) 25);
        System.out.println("User с именем Иван добавлен в базу данных");

        userService.saveUser("Петр", "Петров", (byte) 30);
        System.out.println("User с именем Петр добавлен в базу данных");

        userService.saveUser("Сергей", "Сергеев", (byte) 28);
        System.out.println("User с именем Сергей добавлен в базу данных");

        userService.saveUser("Анна", "Аннова", (byte) 22);
        System.out.println("User с именем Анна добавлен в базу данных");

        // Получение всех пользователей и вывод в консоль
        userService.removeUserById(2);
        System.out.println(userService.getAllUsers());

        // Очистка таблицы
        userService.cleanUsersTable();

        // Удаление таблицы
        userService.dropUsersTable();
    }
}