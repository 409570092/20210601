package hsiuying.Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("******飲料販賣機******");
        Type t = new Type();
        t.setObj("可樂100元",100,"奶茶50元",50,"果汁120元",120);
        System.out.print("請輸入投幣金額:");
        int n=s.nextInt();
        t.inPutMoney(n);
        System.out.print("\n請輸入購買品項");
        int n1 = s.nextInt();
        t.moneyCount(t.chooseObj(n1));
        t.outPutMoney();

    }
}
