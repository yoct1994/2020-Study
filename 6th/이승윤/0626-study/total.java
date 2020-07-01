import java.util.Scanner;

public class total {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        for(int i=a;i>=1;i--){
            if(a%i==0) sum+=i;
        }
        System.out.println(sum);


    }
}
