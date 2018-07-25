
import java.util.*;
public class terry_can_sugma {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String[] words = new String[]{"cookie", "cookie", "cookie", "cookie", "milk", "cookie", "milk"};

        String previous = "";
        for (int i = 0; i < words.length; i++) {
            if (previous.equalsIgnoreCase("cookie") && words[i].equalsIgnoreCase("cookie")) {
                System.out.println("NO");
                break;
            }
            previous = words[i];

        }
        System.out.println("YES");


    }
}