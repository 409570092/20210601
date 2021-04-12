package hsiuying.Reporter;

public class Tester {
    public static void main(String[] args) {
        Reporter repoter = new Reporter(){
            public void print(){
                System.out.println("Ding Dong");
            }
        };
        Reporter reporter1 = new Reporter(){
            @Override
            public void print(){
                System.out.println("HeHeHe");
            }
        };
    }
}
