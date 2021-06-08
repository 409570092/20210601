package hsiuying.First;

import java.util.Scanner;

public class Tester {

    private static Object List;
    private static Object M1;
    private static Object M2;
    private static Object M3;
    private static Object M4;
    private static Object M5;

    public static void main(String[] args){

        int num;
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        num = Integer.parseInt(s);
        System.out.println("請輸入0");
        while (num == 0){
            System.out.println(List);
        }

        System.out.println("請輸入電影代碼");

        if(num == 1){
            System.out.println(M1);
        }else if(num == 2){
            System.out.println(M2);
        }else if(num == 3){
            System.out.println(M3);
        }else if(num == 4){
            System.out.println(M4);
        }else if(num == 5){
            System.out.println(M5);
        }

        System.out.println("請輸入年紀");
        int money;
        Scanner scanner1 = new Scanner(System.in);
        String m = scanner.next();
        money = Integer.parseInt(m);
        if (money<18){
            System.out.println("學生價:230元");
        }else {
            System.out.println("成人:260元");
        }
    }
}