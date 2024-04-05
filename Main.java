package contacts;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contacts[] contacts = new Contacts[10];
        boolean done = false;
        while (!done) {
            System.out.println("Выберите действие:");
            System.out.println("[1] - Новый контакт");
            System.out.println("[2] - Редактировать контакт");
            System.out.println("[3] - Удалить контакт");
            System.out.println("[4] - Выход");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addContact(contacts);
                    break;
                case 2:
                    editContact(contacts, scanner);
                    break;
                case 3:
                    deleteContact(contacts, scanner);
                    break;
                case 4:
                    done = true;
            }
        }
    }
    private static void addContact(Contacts[] contacts) {
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Имя контакта не может быть пустым!");
        } else {
            for (int i = 0; i < contacts.length; i++) {
                if (contacts[i] == null) {
                    contacts[i] = new Contacts(name);
                    return;
                }
            }
            System.out.println("Все контакты заполнены");
        }
    }

    private static void editContact(Contacts[] contacts, Scanner scanner) {
        int index;
        System.out.print("Введите  контакт для редактирования: ");
        index = scanner.nextInt();

        if (index < 0 || index >= contacts.length) {
            System.out.println("Ошибка");
            return;
        }

        scanner.nextLine();
        System.out.print("Введите новое имя: ");
        String newName = scanner.nextLine();

        contacts[index].setName(newName);
    }


    private static void deleteContact(Contacts[] contacts, Scanner scanner) {
    }

}