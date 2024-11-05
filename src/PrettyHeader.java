import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user for a message to center
        System.out.print("Enter the message for the header: ");
        String message = in.nextLine();

        // Call the prettyHeader method from SafeInput
        SafeInput.prettyHeader(message);
    }
}
