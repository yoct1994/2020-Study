import java.util.Scanner;


public class cal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String c=sc.next();
        int b=sc.nextInt();

           switch(c){
                case "+":
                    System.out.println(a+b); break;
                case "-":
                    System.out.println(a-b); break;
                case "*":
                    System.out.println(a*b); break;
                case "/":
                    System.out.println(a/b); break;
            }

        }
    }
