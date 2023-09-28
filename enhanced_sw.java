
import java.util.Scanner;
public class enhanced_sw {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("This an switch case demonstration program::");
        System.out.println("Enter your marks:");
        int marks=sc.nextInt();
        switch(marks)
        {
            case 90->System.out.println("Pass");
            case 45->System.out.println("First class");
            case 21->{
                System.out.println("Ur fail");
                System.out.println("Try next time");
            }
        }
    }
}
