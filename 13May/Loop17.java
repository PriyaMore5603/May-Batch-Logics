import java.util.Scanner;

public class Loop17 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);


        System.out.print("Enter Your Character:");
        char ch = sc.next().charAt(0);

        System.out.print("Enter your Number:");
        int n = sc.nextInt();

         int start = (int) ch;
         int end = start + n;

        while(start <= end)
        {
        System.out.println((char)start);
        start++;
        }
    }
}
