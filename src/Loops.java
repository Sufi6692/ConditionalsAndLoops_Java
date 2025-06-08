import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {


        /*
        Syntax of for loops:

        for (initialisation; condition; increment/decrement){
            //body
        }
         */

        // Q : Print numbers from 1 to 5

//        for(int num = 1; num <= 5; num += 1){
//            System.out.println(num);
//        }

        //print number from to n
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Please Enter your number : ");
//        int n = in.nextInt();
//        for (int num = 1; num <= n; num++){
//            System.out.println(num+ " ");
//        }

        // while loops
        /*
        Syntax:
        while(Condition){
            //body
        }
         */

//        int num = 1;
//        while (num <= 5){
//            System.out.println(num);
//            num++;
//        }


        //do while loops

        /*
        Syntax :
        do{
            //body
        }while(Condition)

         */

        int n = 1;
        do{
            System.out.println("Hello World");
        }while (n != 1);
    }
}
