package Day6;

public class Assertion {
    public static void main(String[] args) {
        int age=15;

        assert age>=18: "Age is less than 18 , not eligible to vote!";

        System.out.println("Age is valid. You can vote!");
    }
}
