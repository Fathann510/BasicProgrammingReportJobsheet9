import java.util.Scanner;

public class ScoreArray12{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] finalScores = new int[10];

        for (int i = 0; i < finalScores.length; i++) {
            System.out.print("Enter the score for student #" + (i + 1) + ": ");
            finalScores[i] = input.nextInt();
        }
        int number = 1;
        for (int score : finalScores) {
            String status = (score > 70) ? "PASS" : "FAIL";
            System.out.println("Student #" + number + ": " + score + " (" + status + ")");
            number++;
        }
        input.close();
    }
}