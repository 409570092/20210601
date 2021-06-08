package hsiuying.Test;

public class Coin {
    private int one;
    private int five;
    private int ten;
    private int money;
    public void setMoney(int n){
        money = n;
        ten=(int)n/10;
        five = (int)(n-ten*10)/5;
        one = n-(ten*10+five*5);
    }
    public void getMoney(){
        System.out.println("退"+ten+"個10元硬幣");
        System.out.println("退"+five+"個5元硬幣");
        System.out.println("退"+one+"個1元硬幣");
        System.out.println("共退"+money+"元");
    }
}
