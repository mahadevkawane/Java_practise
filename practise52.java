// import java.util.Scanner;
public class practise52 {
    public static void main(String[] args) {

        // sum of even numbers
        int sum=0;
        int num=4;
        for(int i=0;i<num;i++)
        {
            sum=sum+(2*i);
        }
        System.out.println(sum);

        //sum of odd numbers
        int sum2=0;
        int num2=4;
        for(int j=0;j<num2;j++)
        {
            sum2=sum2+(2*j+1);
        }
        System.out.println(sum2);
    }
    
}
