package operator;

public class UnaryOperator {
    // post increment i++
    //pre increment ++i

    public static void main(String[] args) {
        int number=20;
        ++number;//1+number =21
        System.out.println(number);//21
        number++;// 21+++++++ 1- pore 22 hobe
        System.out.println(number++);// number+1 for future 21+1 for future//22
        System.out.println(number);//22
        --number;//21
        System.out.println(number);//21
        number--;// 21....21-------1 for future
        System.out.println(number);// -1 + number = 20
        number--;//(20 hold for the present line)20-----1<-=19--for next use
        number--;//19-------1
        number--;//18-------1
        --number;//16
        --number;//15
        System.out.println(number);//15
        ++number;//16
        number--; //16------1
        number--;//15----1
        ++number;//15
        ++number;//16

    }
}
