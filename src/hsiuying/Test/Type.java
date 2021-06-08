package hsiuying.Test;

public class Type {
    private int money;
    private int[] moneyObj;
    public void inPutMoney(int n){
        money = n;
    }
    public void outPutMoney(){
        Coin c = new Coin();
        c.setMoney(this.money);
        c.getMoney();
    }
    public void setObj(String s,int s1 , String ss,int ss1 , String sss,int sss1){
        int[] moneyObj1 = {s1,ss1,sss1};
        moneyObj = moneyObj1;
        System.out.print("品項   1:"+s+"   ");
        System.out.print("2:"+ss+"   ");
        System.out.print("3:"+sss+"\n\n");
    }
    public void moneyCount(int n){
        int a = money;
        if((a-n)>=0){
            money-=n;
        }else{
            System.out.println("投入金額不足");
        }

    }
    public int chooseObj(int n){
        if(n==1)
            return moneyObj[0];
        else if(n==2)
            return moneyObj[1];
        else if(n==3)
            return moneyObj[2];
        else
            System.out.println("輸入錯誤");
        return 0;
    }
}
