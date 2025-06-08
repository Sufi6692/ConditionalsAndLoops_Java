import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number A : ");
        int a = in.nextInt();
        System.out.print("Enter number B : ");
        int b = in.nextInt();
        System.out.print("Enter number C : ");
        int c = in.nextInt();

        // Q : Find the largest of the 3 numbers
//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
//
//        System.out.println("Your MAX number is : " + max);

        int max =Math.max(c,Math.max(a,b));
        System.out.println("Your MAX number is : " + max);
    }
}
