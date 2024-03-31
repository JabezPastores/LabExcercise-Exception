/*
 * Adriel Florante 2BSCS-1
 */

import java.util.Scanner;

public class LogInSystems {
    public static void main(String[] args) {
        passwordChecker passwordCheck = new passwordChecker();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your password:");
        while (true) {
            try {
                passwordCheck.login(input.nextLine());
            } catch (maxAttemptMessage e) {
                System.out.println(e.getMessage());
                System.exit(0);
            } catch (incorrectPasswordMessage e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
