import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your char : ");
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);
        if(ch >='A' && ch<='Z'){
            System.out.println("UpperCase");
        } else if (ch >= 'a' && ch <='z') {
            System.out.println("LowerCase");
        }else {
            System.out.println("Invalid char");
        }
        {
            
        }
    }
}
