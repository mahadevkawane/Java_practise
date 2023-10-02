import java.util.Scanner;
public class practise47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter url"); 
        String url=sc.nextLine();
        if(url.endsWith(".com"))
        {
            System.out.println("Commercial website:");
        }
        else if(url.endsWith(".edu"))
        {
            System.out.println("Education website:");
        }
        else if(url.endsWith(".ind"))
        {
            System.out.println("Indian website:");
        }
      
    }
    
}
