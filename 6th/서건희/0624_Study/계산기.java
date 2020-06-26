import java.util.Scanner;

public class 계산기 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        while(true) {
            int b;
            System.out.println("++++++\n1-연산\n2-종료\n++++++");
            b = a.nextInt();
            if(b==2){
                break;
            }
            int num1 = a.nextInt();
            String op = a.next();
            int num2 = a.nextInt();
            System.out.println("원하는 연산을 하시오");
            switch (op) {
                case "+":
                    System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                    break;
                case "-":
                    System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                    break;
                case "/":
                    System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                    break;
                case "*":
                    System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                    break;
                default:
                    return;
            }
            System.out.println("연산 완료!");
        }
    }
}
