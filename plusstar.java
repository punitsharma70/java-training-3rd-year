import java.util.Scanner;

public class plusstar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                if (i == n / 2) {
                    System.out.print("*");
                }

                System.out.print(" ");
            }
            System.out.println("*");
        }
        sc.close();
    }
}
