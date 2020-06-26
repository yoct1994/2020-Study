import java.util.Scanner;

public class Undefined_Class {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num1, num2;
        System.out.println("원하시는 연산을 입력하세요.\n 1 : +\n 2 : -\n 3 : /\n 4 : *");
        int ch = a.nextInt();

        switch (ch) {
            case 1:
                System.out.println("연산할 두 정수를 입력하세요");
                num1 = a.nextInt();
                num2 = a.nextInt();
                System.out.println("연산 결과 : ");
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println("연산할 두 정수를 입력하세요");
                num1 = a.nextInt();
                num2 = a.nextInt();
                System.out.println("연산 결과 : ");
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println("연산할 두 정수를 입력하세요");
                num1 = a.nextInt();
                num2 = a.nextInt();
                System.out.println("연산 결과 : ");
                System.out.println(num1 / num2);
                break;
            case 4:
                System.out.println("연산할 두 정수를 입력하세요");
                num1 = a.nextInt();
                num2 = a.nextInt();
                System.out.println("연산 결과 : ");
                System.out.println(num1 * num2);
                break;
        }
    }
}