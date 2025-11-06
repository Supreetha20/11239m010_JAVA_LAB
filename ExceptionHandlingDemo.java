import java.util.Scanner;

class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {

    static void validateMarks(int marks) throws InvalidMarkException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarkException("Marks must be between 0 and 100.");
        }
        System.out.println("Valid marks entered: " + marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student marks: ");
            int marks = sc.nextInt();

            validateMarks(marks);

        } catch (InvalidMarkException e) {
            System.out.println("Caught Exception: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("General Exception: " + e);

        } finally {
            System.out.println("Execution completed. Closing resources.");
            sc.close();
        }
    }
}
