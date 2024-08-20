public class Methods {
    Methods(){
        System.out.println("Constructor method is called when an object of it;s class is created");
    }
    public static void main(String[] args) {
        staticMethod();
        Methods object = new Methods();
        object.nonStaticMethod();
    }
    static void staticMethod(){
        System.out.println("Static method can be called without creating object");
    }
    void nonStaticMethod(){
        System.out.println("Non static method must be called by creating an object");
    }
}
