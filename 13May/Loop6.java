import java.util.Scanner;

public class Loop6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Start:");
        int i = sc.nextInt();

        System.out.println("Enter Your end:");
        int n = sc.nextInt();

        while(i<=n)
        {
            if(i % 2 == 0)
                System.out.println("i:"+i);
            i++;
        }
    }
    
}
