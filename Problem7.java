import java.util.Map;
import java.util.LinkedHashMap;

public class Problem7 {
    public static void main(String[] args) {
        String s = "MCMXCIV";

        int sum = 0;
        Map<Character, Integer> roman = new LinkedHashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                sum = sum - roman.get(s.charAt(i));// 900
                System.out.println("if " + sum);
            } else {
                sum = sum + roman.get(s.charAt(i));// 1000
                System.out.println("else " + sum);
            }
        }
        sum = sum + roman.get(s.charAt(s.length() - 1));

        for (Map.Entry e : roman.entrySet()) {
            System.out.print(e.getKey() + "   ");
            System.out.println(e.getValue());
        }
        System.out.println(sum);
    }
}
