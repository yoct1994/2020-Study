import java.util.Scanner;

public class undefined {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int ch;
        int num1, num2;
        ch = a.nextInt();

        switch(ch){
            case 1:
                num1 = a.nextInt();
                num2 = a.nextInt();
                System.out.println(num1 + num2);
                break;
            case 2:
                num1 = a.nextInt();
                num2 = a.nextInt();
                System.out.println(num1 - num2);
                break;
            case 3:
                num1 = a.nextInt();
                num2 = a.nextInt();
                System.out.println(num1 * num2);
                break;
            case 4:
                num1 = a.nextInt();
                num2 = a.nextInt();
                System.out.println(num1 / num2);
                break;
        }

    }
}


