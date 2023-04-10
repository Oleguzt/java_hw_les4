
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class task1 {


    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("command or string: ");
            String user_input = scanner.nextLine();

            if (user_input.equals("print")) {
                Collections.reverse(lines);
                System.out.println(lines);
                Collections.reverse(lines);
            } else if (user_input.equals("revert")) {
                if (lines.size() > 0) {
                    lines.remove(lines.size() - 1);
                }
            } else if (user_input.equals("exit")) {
                break;
            } else {
                lines.add(user_input);
            }
        }
    }
}
