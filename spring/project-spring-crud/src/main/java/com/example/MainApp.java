package com.example;

import com.example.config.AppConfig;
import com.example.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserController controller = context.getBean(UserController.class);

        boolean running = true;

        while (running) {
            System.out.println("""
                a) 1 for add user.
                b) 2 for list users.
                c) 3 for exit.
                """);
            System.out.print("Enter your choice: ");
            String choice = scanner.next().trim();
            switch (choice) {
                case "1":
                    System.out.print("Enter user name: ");
                    String user = scanner.next().trim();
                    controller.createUser(user);
                    System.out.println();
                    break;
                case "2":
                    controller.listUsers();
                    System.out.println();
                    break;
                case "3":
                    running = false;
                    break;
                default:
                    System.out.println("Please enter a valid input...");
            }
        }

    }
}
