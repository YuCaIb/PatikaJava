package src;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username, password, newPassword;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        username = sc.nextLine();
        System.out.print("Enter password: ");
        password = sc.nextLine();

        if (username.equals("patika") && password.equals("java")) {
            System.out.println("You are logged in!");
        } else {
            System.out.println("Wrong username or password! If you like to change your password press 1");
            temp = sc.nextInt();
            sc.nextLine();

            if (temp == 1) {
                System.out.print("Enter new password it should be different than the old one: ");
                newPassword = sc.nextLine();

                if (!newPassword.equals("java")) {
                    System.out.println("Password has been changed.");
                    System.out.print("Try logging in again.\nEnter username: ");
                    username = sc.nextLine();
                    System.out.print("Enter password: ");
                    password = sc.nextLine();

                    if (username.equals("patika") && password.equals(newPassword)) {
                        System.out.println("You are logged in!");
                    } else {
                        System.out.println("Login failed!");
                    }
                } else {
                    System.out.println("New password cannot be the same as the old one!");
                }
            }
        }
    }
}
