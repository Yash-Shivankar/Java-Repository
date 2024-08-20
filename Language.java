public class Language {
    String name;
    Language(){
        System.out.println("Constructor method called");
    }

    public Language(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Language name: "+name);
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Language cpp = new Language();
        Language java = new Language("Java");

        cpp.setName("C++");
        java.getName();
        cpp.getName();
    }
}
