interface Info{
    static final String language = "Java";
    public void display();
}
public class Simple implements Info{
    public void display(){
        System.out.println(language +" is awesome");
    }
    public static void main(String[] args) {
        Simple obj = new Simple();
        obj.display();
    }
}
