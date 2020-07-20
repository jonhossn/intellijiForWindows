package string;

public class String1 {

    // how to search for string value

    public static void main(String[] args) {

        String str =" welcome to java -interview- question.com";
        String searchString = "welcome";
        String searchString1="Hello";
        System.out.println(str.contains(searchString));
        System.out.println(str.contains(searchString1));
    }
}
