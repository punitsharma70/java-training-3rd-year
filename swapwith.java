import java.util.Scanner;

public class swapwith {
    
   
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter value of a & b");
            
            int a=sc.nextInt();
            int b=sc.nextInt();
            
            int c=a;
            a=b;
            b=c;
            System.out.println(a);
            System.out.println(b);
        }
        
    }