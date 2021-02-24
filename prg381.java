
import java.util.Scanner;

public class prg381 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        String name = input.nextLine();
        System.out.printf("Hello %s, it is nice to meet you!", name);
        input.close();
    }
}