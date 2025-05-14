import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Start:");
        int i = sc.nextInt();

        System.out.println("Enter Your end:");
        int n = sc.nextInt();

        while(i<=n)
        {
            System.out.println("i: "+i);
            i+=50;
        }
    }
    
}
