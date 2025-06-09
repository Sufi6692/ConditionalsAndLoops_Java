import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Take input from user till user does not press X or x

        int ans = 0;
        while (true){
            //Take the operator as input
            System.out.print("Enter the operator : ");
            char op = input.next().trim().charAt(0);
            System.out.println();
            if (op == '+'|| op == '-'|| op =='*' || op =='/' || op == '%' ){
                //input two numbers
                System.out.print("Enter Number 1 : ");
                int num1 = input.nextInt();
                System.out.print("Enter Number 2 : ");
                int num2 = input.nextInt();
                System.out.println();
                if(op == '+'){
                    ans = num1+num2;
                }
                if(op == '-'){
                    ans = num1-num2;
                }
                if(op == '*'){
                    ans = num1*num2;
                }
                if(op == '/'){
                    if (num2 != 0)
                        ans = num1/num2;
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else {
                System.out.println("Invalid operation");
            }
            System.out.println("This you ans : "+ans);

        }

    }

}
