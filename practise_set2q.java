import java.util.Scanner;
public class practise_set2q {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("::The Program to calculate percentage::");
    System.out.println("Enter marks m1");
    float M1=sc.nextFloat();
    System.out.println("Enter marks m2");
    float M2=sc.nextFloat();
    System.out.println("Enter marks m3");
    float M3=sc.nextFloat();
    System.out.println("Enter marks m4");
    float M4=sc.nextFloat();
    Float avg=(M1+M2+M3+M4)/4;
    System.out.println(avg + " is your percentage");
}    
}
