import java.util.Scanner;

public class Butterfly{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n-1;
        for(int i=n;i>=1;i--){
            for(int j=0;j<=n-i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<i*2-1;j++){
                System.out.print("  ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=x;i++){
            for(int j=0;j<=x-i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<=i*2-1;j++){
                System.out.print("  ");
            }
            for(int j=x;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
