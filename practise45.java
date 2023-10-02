import java.util.Scanner;
import java.math.*;
public class practise45 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("----Tax calculator based on income----");
        System.out.println("Enter Your income-->");
        long income=sc.nextLong();
       
        if(income>=250000 && income<=500000)
        {
            float tax=(income*0.05f)+income;
            System.out.println("Your income is "+ income + " Total including tax is:" + tax);
        }
        else if(income>=500000 && income<=1000000)
        {
            float tax=(income*0.2f)+income;
            System.out.println("Your income is "+ income + " Total including tax is:" + tax);
        }
         else if(income>=100000 )
        {
            float tax=(income*0.30f)+income;
            System.out.println("Your income is "+ income + " Total including tax is:" + tax);
        }
        else
        {
            System.out.println("NO tax");
        }



    }
    
}
