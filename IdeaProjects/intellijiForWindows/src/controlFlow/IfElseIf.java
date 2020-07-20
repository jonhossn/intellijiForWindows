package controlFlow;

public class IfElseIf {
    public static void main(String[] args) {
        double score=90;
        if(score>90)
        {
            System.out.println("Greade 'A' ");
        } else if( score>=70)
        {
            System.out.println("Greade 'B' ");
        }else if( score>=60)
        {
            System.out.println("Greade 'B' ");
        } else
            System.out.println("FALED");
    }
}
