import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // List - Interface
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(9);
        numbers.add(1);
        numbers.add(2);
        numbers.add(0);

        // find a pair with the given sum in list
        // Number 10

        List<Integer> result = new ArrayList<>();
        int total = 10;

        for (int i = 0; i < numbers.size(); i++) {
            Integer firstNumber = numbers.get(i);
            for (int j = 0; j < numbers.size(); j++) {
                if (i != j) {
                    Integer secondNumber = numbers.get(j);
                    Boolean isNumbersExist = result.contains(firstNumber);
                    Boolean isSumEquals10 = (firstNumber + secondNumber) == total;
                    if (isSumEquals10 && !isNumbersExist) {
                        result.add(firstNumber);
                        result.add(secondNumber);
                        System.out.println(
                                firstNumber + " dan " + secondNumber + " = " + (firstNumber + secondNumber));
                    }
                }
            }
        }
    }
}
