import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Excercise {
  public static void soal1() {
    /*
     * 1. Given an array of numbers, multiply by it self, and filter those whos
     * number is higher than 10
     * [1,2,3,4,5,6,7,8,9]
     * Answer: [16, 25, 36, 49, 64, 81]
     */

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    List<Integer> resultNumbers = numbers.stream().map(num -> num * num).filter(num -> num > 10).toList();
    System.out.println(resultNumbers);

  }

  public static void soal2() {
    /*
     * 2. Given an array of strings, lower all characters
     * ["Anas", "SheiLA", "SULAS", "Ficri", "adIT", "dARIAN", "ReDhA"]
     * Answer: ["anas", "sheila", "sulas", "ficri", "adit", "darian", "redha"]
     */

    List<String> names = Arrays.asList("Anas", "SheiLA", "SULAS", "Ficri", "adIT", "dARIAN", "ReDhA");
    List<String> resultNames = names.stream().map(String::toLowerCase).toList();
    System.out.println(resultNames);
  }

  public static void soal3() {
    /**
     * 3. Given an array of strings, add x on each side of the string
     * ["a", "i", "u", "e", "o"]
     * Answer: ["xax", "xix", "xux", "xex", "xox"]
     */
    List<String> text = Arrays.asList("a", "i", "u", "e", "o");
    // List<String> changeText = text.stream().map(t -> "x" + t + "x").toList();
    List<String> changeText = text.stream().map(t -> String.format("x%sx", t)).toList();
    System.out.println(changeText);
  }

  public static void soal4() {
    /*
     * 4. Given an array of scores, return true if each scores is equal or greater
     * than the one before.
     * Answer:
     * [1, 3, 4] -> true
     * [1, 3, 2] -> false
     * [1, 1, 4] -> true
     */

    List<Integer> scors = Arrays.asList(1, 1, 4);
    Boolean result = false;
    for (int i = 0; i < scors.size() - 1; i++) {
      if (scors.get(i + 1) >= scors.get(i)) {
        result = true;
      } else {
        result = false;
        break;
      }
    }

    System.out.println(scors + " -> " + result);
  }

  public static void soal5() {
    /*
     * 5. Replace any vowels(huruf vokal) in the sentence with exclamation mark
     * ("!")
     * "Hi, my name is Paksi" -> "H!, my name !s Paks!"
     */

    List<String> vowel = Arrays.asList("i");
    String text = "Hi, my name is Paksi";
    List<String> arrayText = Arrays.asList(text.split(""));
    // List<String> result = new ArrayList<>();

    // for (int i = 0; i < text.length(); i++) {
    // if (vowel.contains(text.charAt(i))) {
    // result.add("!");
    // } else {
    // result.add(String.valueOf(text.charAt(i)));
    // }
    // }

    // List<String> result = arrayText.stream().map(txt ->
    // vowel.contains(txt.toLowerCase()) ? "!" : txt).toList();
    // System.out.println(text + " -> " + String.join("", result));

    text = text.replaceAll("[aiueo]", "!");
    System.out.println(text);
  }

  public static void soal6() {
    /*
     * 6. Given an array of strings, returns a Map<String, Boolean> where each
     * different strings is a key and its value is true if that string appears 2 or
     * more in the array
     * ["a", "b", "a", "c", "b"] -> {"a": true, "b" : true, "c": false}
     *
     * ["c", "b", "a"] -> {"c": false, "b": false, "a": false}
     * 
     * ["c", "c", "c", "c"] -> {"c": true}
     */
    List<String> strings = Arrays.asList("a", "b", "a", "c", "b");
    List<String> temp = new ArrayList<>();
    Map<String, Boolean> result = new HashMap<>();

    for (String string : strings) {
      if (temp.contains(string)) {
        result.put(string, true);
      } else {
        temp.add(string);
        result.put(string, false);
      }
    }
    System.out.println(result);
  }

  public static void soal7() {
    /*
     * 7. Given an array of non-empty strings, returns a Map<String, String> where
     * each string add its first character as a key with its last character as the
     * value
     * ["code", "bug"] -> {"c": "e", "b": "g"}
     * 
     * ["man", "moon", "main"] -> {"m": "n"}
     * 
     * ["man", "moon", "good", "night"] -> {"g": "d", "m": "n", "n": "t"}
     */
    List<String> strings = Arrays.asList("code", "bug");
    Map<String, String> results = new HashMap<>();
    for (String string : strings) {
      String firstChar = String.valueOf(string.charAt(0));
      String lastChar = String.valueOf(string.charAt(string.length() - 1));
      results.put(firstChar, lastChar);
    }
    System.out.println(results);

  }

  public static void soal8() {
    /*
     * 8. Modify and return the given map as follows: if the key "a" has a value,
     * set the key "b" to have that value, and set the key "a" to have the value ""
     * {"a": "candy", "b": "dirt"} -> {"a": "", "b": "candy"}
     * 
     * {"a": "candy"} -> {"a": "", "b": "candy"}
     * 
     * {"a": "candy", "b": "carrot", "c": "meh"} -> {"a": "", "b": "candy",
     * "c":"meh"}
     */
    Map<String, String> string = new HashMap<>();
    string.put("a", "candy");
    string.put("b", string.get("a"));
    string.replace("a", "");
    string.put("c", "meh");

    System.out.println(string);

  }

  public static void soal9() {
    /*
     * 9. Modify and return the given map as follows: if the key "a" has a value,
     * set the key "b" to have that same value
     * 
     * {"a": "aaa", "b": "bbb", "c": "ccc"} -> {"a": "aaa", "b": "aaa", "c": "ccc"}
     * 
     * {"b": "xyz", "c": "ccc"} -> {"b": "xyz"}
     * 
     * {"a": "aaa", "c": "meh", "d": "hi"} -> {"a": "aaa", "b": "aaa", "d": "hi"}
     */
    Map<String, String> string = new HashMap<>();
    string.put("a", "aaa");
    string.put("b", "xyz");
    string.put("c", "ccc");

    if (string.get("c") != null) {
      string.remove("c");
    }
    if (string.get("a") != null) {
      string.replace("b", string.get("a"));
    }

    System.out.println(string);

  }

  public static void soal10() {
    /*
     * 10. We want to make a row of sticks that is x cm long. Given there are two
     * types of sticks, small stick (1 cm) and big stick (5 cm). Return true if
     * possible with the given sticks to achieve the x long or else false
     * 
     * Given:
     * 3 small sticks
     * 1 big stick
     * 8 cm
     * 
     * Answer: true
     * 
     * Given:
     * 
     * 3 small sticks
     * 1 big stick
     * 9 cm
     * 
     * Answer: false
     * 
     * Given:
     * 
     * 3 small sticks
     * 2 big stick
     * 10 cm
     * 
     * Answer: true
     */

    Integer small = 3;
    Integer big = 2;
    Integer target = 10;

    if (((small * 1) + (big * 5)) >= target) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }
  }
}
