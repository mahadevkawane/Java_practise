import java.util.Scanner;
public class condition {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if(age<18)
        {
            System.out.println("You cannot drive!");

        }
        else if(age>=18)
        {
            System.out.println("You can drive!");
        }
        else{
            System.out.println("Please Enter correct age");
        }

        
    }
    
}
