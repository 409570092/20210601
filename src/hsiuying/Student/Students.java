package hsiuying.Student;

public class Students extends Stu {
    int thesis;
    public Students(String id, String name,
                           int english, int math,
                           int thesis) {
        super(id, name, english, math);
        this.thesis = thesis;
    }

    public void mail() {

    }
}
