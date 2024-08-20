public class StaticBlock {
    // public static void main(String[] args) {
    //     System.out.println("Main method is executed");
    // }
    // static{
    //     System.out.println("Static block is executed before main method");
    // }

    public static void main(String[] args) {
        System.out.println("You are using Windows NT operating system");
    }
    static{
        String os = System.getenv("OS");
        if(os.equals("Windows_NT") != true){
            System.exit(1);
        }
    }
}


