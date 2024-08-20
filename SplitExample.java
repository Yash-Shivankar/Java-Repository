public class SplitExample {
    public static void main(String[] args) {
        String s1 = "Java string split method by Yash";
        String[] words = s1.split("\\s");
        for(String w:words){
            System.out.println(w);
        }
    }
}
