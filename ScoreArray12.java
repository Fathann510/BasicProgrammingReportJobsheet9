import java.util.Scanner;

public class ScoreArray12{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] finalScores = new int[10];

        for (int i = 0; i < finalScores.length; i++) {
            System.out.print("Enter the score for student #" + (i + 1) + ": ");
            finalScores[i] = input.nextInt();
        }
        for (int i = 0; i < finalScores.length; i++) {
            if (finalScores[i] > 70) {
                String status = "PASS";
                System.out.println("Student #" + (i + 1) + ": " + finalScores[i] + " (" + status + ")");
            }
        }
        input.close();
    }
}