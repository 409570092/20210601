package hsiuying.BetterBox;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int[]nums = new int[5];
        nums[0] = 3;

        ArrayList list = new ArrayList();
        list.add("Hank");
        list.add(123);
        list.add(true);

        Box1 box1 = new Box1();



        //Heterogeneous
        String name = (String)list.get(0);
        String kk = (String) list.get(1);


//        nums[3] = "Hank";
//        nums[2] = true;

    }
}
