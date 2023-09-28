import java.util.Scanner;
public class java_string_methods {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
       
       
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println( name  + " age is "+ age );

         System.out.println(name.length());
         System.out.println("Name in lower case " + name.toLowerCase());
         System.out.println("Name in uppercase  " + name.toUpperCase());
         System.out.println(name.substring(8));
         System.out.println(name.startsWith("m"));
         System.out.println(name.endsWith("ne"));
         String rep=name.replace("k","Kawane");
         System.out.println(rep);

    }    
}
