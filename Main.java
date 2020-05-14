import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner entry = new Scanner(System.in);
            String entryStr = entry.nextLine();
            if (entryStr.equals("exit")) return;
            int result = InputProcessing.calc(entryStr);
            if (result == -101) InputProcessing.myExeption();
            System.out.println(result);

        }

    }


}
