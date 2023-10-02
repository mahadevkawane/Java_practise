import java.util.Scanner;
public class practise42 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m1,m2,m3;
        System.out.println("Enter m1 marks:");
        m1=sc.nextInt();
        System.out.println("Enter m2 marks:");
        m2=sc.nextInt();
        System.out.println("Enter m3 marks:");
        m3=sc.nextInt();
        float avg=(m1+m2+m3)/3f;
        if(avg>=45 && m1>33 && m2>33 && m3>33)
        {
            System.out.println("Passs::");
        }
        else
        {
            System.out.println("Fail::");
        }
    }
    
}
