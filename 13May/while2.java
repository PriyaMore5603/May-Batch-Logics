import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Number:");
        int n = sc.nextInt();

        int i = 1;

        while(i<=n)
        {
            System.out.println("i: "+i);
            i++;
        }
    }
    
}
