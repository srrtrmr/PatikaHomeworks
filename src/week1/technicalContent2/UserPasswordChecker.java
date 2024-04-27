package week1.technicalContent2;

import java.util.Scanner;

public class UserPasswordChecker
{
    public static void main(String[] args)
    {
        final String DEFAULT_USER_NAME = "patika";
        final String DEFAULT_PASSWORD = "java123";

        String username, password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter user name: ");
        username = inp.nextLine();
        System.out.print("Enter password: ");
        password = inp.nextLine();

        if (username.equals(DEFAULT_USER_NAME) && password.equals(DEFAULT_PASSWORD))
        {
            System.out.println("Signed in successfully");
        }
        else
        {
            System.out.println("Incorrect user name or password");
            System.out.println("Reset password? (1:Yes | 2:No)");
            String choice = inp.nextLine();

            if (choice.equals("1"))
            {
                System.out.println("Enter new password: ");
                String newPassword = inp.nextLine();

                if (newPassword.equals(password))
                {
                    System.out.println("New password is same with previous one. Please try again!");
                }
                else
                {
                    System.out.println("New password is accepted.");
                }
            }
        }
    }
}
