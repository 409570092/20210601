package hsiuying.box;

public abstract class box {
    int length;
    int width;
    int height;

    public boolean validate(int a, int b, int c) {
        return (a <= length && b <= width && c <= height);
    }
    public abstract String getName();
    public abstract int getPrice();
}