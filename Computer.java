public class Computer {
    Computer(){
        System.out.println("Constructor of Computer class.");
    }
    void computer_method(){
        System.out.println("Power gone! Shut down.");
    }
    public static void main(String[] args) {
        Computer my = new Computer();
        Laptop your = new Laptop();

        my.computer_method();
        your.Laptop_mehod();
    }
}

class Laptop{
    Laptop(){
        System.out.println("Constructor of Laptop class");
    }
    void Laptop_mehod(){
        System.out.println("99% Battery available");
    }
}
