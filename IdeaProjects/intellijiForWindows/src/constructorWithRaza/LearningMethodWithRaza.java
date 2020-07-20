package constructorWithRaza;

public class LearningMethodWithRaza
{
    public void todaysName()
    {
        System.out.println(" today is "+ " Sunday");
    }

public int doSum()
{
    int a=2;
    int b=4;
    int sum= a+b;
    System.out.println("Sum is"+ sum);
    return sum;
}



    public static void main(String[] args) {
        LearningMethodWithRaza obj = new LearningMethodWithRaza();
        obj.todaysName();
        obj.doSum();

    }
}
