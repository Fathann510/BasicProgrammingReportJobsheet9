import java.util.Arrays;

public class NumberArray12{
    public static void main(String[] args) {
        
        int[] numbers = new int[4];

        for(int i = 0; i < numbers.length; i++){
            System.out.println("numbers[" + i + "] = " + numbers[i]);

        }
        for(int number : numbers){
            System.out.println(number);
        }
        System.out.println(Arrays.toString(numbers));
    }
}