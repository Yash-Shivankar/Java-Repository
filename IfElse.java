import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int marksObtained, passingMarks;
        passingMarks = 40;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input marks scored by you:");
        marksObtained = sc.nextInt();
        if(marksObtained >= passingMarks){
            System.out.println("You passed the Exam");
        }else {
            System.out.println("Unfortunately You failed to pass the exam");
        }
    }
    
}
