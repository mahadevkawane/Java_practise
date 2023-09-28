import java.util.Scanner;
public class sc {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("This an switch case demonstration program::");
        System.out.println("Enter your marks:");
        int marks=sc.nextInt();
        switch(marks)
        {
            case 90:
            {
                System.out.println("Distinction:👍");
                break;
            }
            case 75:
            {
                System.out.println("First class:😃");
                break;
            }
            case 45:
            {
                System.out.println("Pass👌");
                break;
            }
            case 21:{
                System.out.println("Fail😒");
                break;
            }
            // default:
            // System.out.println("please enter correct marks");
        }
    }
    
}
