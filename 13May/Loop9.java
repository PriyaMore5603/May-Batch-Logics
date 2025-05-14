import java.util.Scanner;

public class Loop9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Start:");
        int i = sc.nextInt();

        System.out.println("Enter Your end:");
        int n = sc.nextInt();
        int sum=0;

        while(i<=n)
        {
            sum += i;
            i++;
        }
        System.out.println("Sum: "+sum);
    }
    
}
