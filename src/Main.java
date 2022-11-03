import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Bir sayı giriniz :");
        n = input.nextInt();
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= ((2*n)-1-(2*i)); k++) {
                System.out.print("*");
            }

            System.out.println(" ");

        }
    }
}