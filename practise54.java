import java.util.Scanner;
public class practise54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        int i=1;
        System.out.println("Enter n value");
        int n=sc.nextInt();
        while(i<=n)
        {
            fact=fact*i;
            i++;
        }
        System.out.println(fact);
    }
    
}
