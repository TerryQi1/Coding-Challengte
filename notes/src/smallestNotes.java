import java.util.Scanner;

public class smallestNotes {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int ligma = input.nextInt();

        int rs100 = ligma/100;
        int rem100 = ligma%100;

        int rs50 = rem100/50;
        int rem50 = rem100%50;

        int rs10 = rem50/10;
        int rem10 = rem50%10;

        int rs5 = rem10/5;
        int rem5 = rem10%5;

        int rs2 = rem5/2;
        int rem2 = rem5%2;

        int rs1 = rem2/1;
        int rem1 = rem2%1;

        System.out.println(rs100 + rs50 + rs10+ rs5+ rs2);




    }
}
