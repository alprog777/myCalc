import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner entry = new Scanner(System.in);
            String entryStr = entry.nextLine();
            if (entryStr.equals("exit")) return;
            int result = InputProcessing.calc(entryStr);
            System.out.println(result);

        }

    }


}
