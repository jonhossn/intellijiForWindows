package testing;

public class LearnEnum {
    public static void main(String[] args) {
        System.out.println(Color.RED);
        Color.colorInfo();
        System.out.println(Priority.HIGH);
    }
    public enum Priority{
        HIGH,LOW,MEDIUM;
    }
}
