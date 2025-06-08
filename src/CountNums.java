import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = input.nextInt();
        System.out.print("Enter your match number : ");
        int m = input.nextInt();


        int count = 0;

        while (n > 0){
            int rem = n % 10;
            if(rem == m){
                 count++;
            }
            n = n/10; // n /= 10

        }

        System.out.print("matching digits in number : " + count);

    }
}
