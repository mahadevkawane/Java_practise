//  °F = (°C × 9/5) + 32
// °C = (°F − 32) x 5/9

import java.util.Scanner;
public class practise3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("::Progam to convert degree farenheit to degree celcius::");
        System.out.println("Enter temperature in celcius--> ");
        float c=sc.nextFloat();
        float f=((c*9/5)+32);
        System.out.println(c + " Temperature in farenheit is " + f);
    }
    
}
