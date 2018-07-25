import java.util.Scanner;

public class cupcake {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int cupcakeNumber = input.nextInt();
        int number = cupcakeNumber/2+1;
        if (cupcakeNumber==2){
            System.out.println("2");
        } else{
            System.out.println(number);
        }




    }
}
