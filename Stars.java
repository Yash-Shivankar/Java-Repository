public class Stars {
    public static void main(String[] args) {
        int row, numberofStars;
        for(row = 1; row <=10 ;row++){
            for(numberofStars = 1; numberofStars <= row; numberofStars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
