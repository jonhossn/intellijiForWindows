package looploop;

public class ForLoopPracThree {
    public static void main(String[] args) {
        int height=5;
        int count=1;
        for ( int i =1; i<height+1;i++){
            for(int j=0;j<i;j++){
                System.out.println(count+" ");
                count++;
            }
        }
    }
}
