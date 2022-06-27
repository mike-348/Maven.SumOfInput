import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner((System.in));
        int n = 0;
        int sum = 0;
        int i;
        System.out.println("Enter an integer...");
        n = scan.nextInt();
        for (i = 0; i<=n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
