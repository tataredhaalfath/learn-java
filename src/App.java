import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\nMATERI LIST");
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

        System.out.println("\n\n\nLambda / Anonimous Function");
        // Lambda
        List<Integer> dataNumbers = Arrays.asList(3, 4, 5, 9, 1, 2);

        dataNumbers.stream().forEach(number -> System.out.println("Lambda " +
        number));
        // List<String> numbersInString = dataNumbers.stream().map(number ->
        // Integer.toString(number)).toList();
        List<String> filtered = dataNumbers.stream()
        .filter(number -> number > 4)
        .map(number -> Integer.toString(number))
        .toList();
        filtered.stream().forEach(num -> System.out.println(num + " . " +
        num.getClass().getSimpleName()));
        System.out.println(filtered);
        System.out.println(dataNumbers);

        System.out.println("");
        // combine 2 list
        List<Integer> firstNumbers = new ArrayList<>(Arrays.asList(3, 4, 5, 9, 1,
        2));
        List<Integer> secondNumbers = Arrays.asList(3, 4, 5, 9, 1, 2);

        firstNumbers.addAll(secondNumbers);
        System.out.println(firstNumbers);

        System.out.println("\n\nMATERI MAP");
        // MAP - Interface
        // key - value
        Map<String, List<String>> digitalTalentPool = new HashMap<>();

        List<String> backendTrainees = new ArrayList<>(
        Arrays.asList("redha", "ian", "ficri", "anas", "sulas", "sheila", "adit"));

        List<String> frontendTrainees = new ArrayList<>(Arrays.asList("patrick",
        "erin"));
        digitalTalentPool.put("BE", backendTrainees);
        digitalTalentPool.put("FE", frontendTrainees);

        for (Map.Entry<String, List<String>> trainee : digitalTalentPool.entrySet())
        {
        System.out.println(trainee.getKey());
        System.out.println(trainee.getValue());
        }

        if (digitalTalentPool.containsKey("BE")) {
        System.out.println("ada key BE");
        System.out.println(digitalTalentPool.size());
        }

        Excercise.soal1();
        Excercise.soal2();
        Excercise.soal3();
        Excercise.soal4();
        Excercise.soal5();

        Excercise.soal6();
        Excercise.soal7();
        Excercise.soal8();
        Excercise.soal9();
        Excercise.soal10();

    }
}
