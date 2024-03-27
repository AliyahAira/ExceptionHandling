import java.util.*;

public class LogInYourPassword {
    private static final String VALID_PASSWORD = "password";
    private static final int MAX_TRIES = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loginAttempts = 0;

        while (loginAttempts < MAX_TRIES) {
            try {
                System.out.print("Enter your password: ");
                String password = scanner.nextLine();
                validatePassword(password);
                System.out.println("SUCCESSFULLY LOGIN!");
                break;
            } catch (InoperativePassException e) {
                System.out.println(e.getMessage());
                loginAttempts++;
            } catch (MaximumPassEntryExceedsException e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        if (loginAttempts == MAX_TRIES) {
            System.out.println("Maximum login tries exceeded!");
        }

        scanner.close();
    }

    private static void validatePassword(String password) throws InoperativePassException, MaximumPassEntryExceedsException {
        if (!password.equals(VALID_PASSWORD)) {
            throw new InoperativePassException("Invalid password!");
        }
    }
}
