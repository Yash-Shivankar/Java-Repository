public class TestThrow {
    static void validate(int age){
        if (age < 18) {
            throw new ArithmeticException("Not valid");
        } else {
            System.out.println("Welcome to Yash");
        }
    }
    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code....");
    }
}
