import java.util.Scanner;
public class practise53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter n value:");
        // int n=sc.nextInt();
        // for(int i=1;i<=10;i++)
        // {
        //     // System.out.println(n*i);
        //     System.out.printf("%d*%d=%d\n",n,i,n*i);
        // }

        // for reverse order
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        for(int i=10;i>=1;i--)
        {
            // System.out.println(n*i);
            System.out.printf("%d*%d=%d\n",n,i,n*i);
        }
    }
    
}
