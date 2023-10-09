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

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if ((numbers.get(i) + numbers.get(j)) == 10) {
                    System.out.println(
                            numbers.get(i) + " dan " + numbers.get(j) + " = " + (numbers.get(i) + numbers.get(j)));
                }
            }
        }
    }
}
