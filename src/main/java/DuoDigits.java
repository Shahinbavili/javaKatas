import java.util.Collections;
import java.util.HashSet;

public class DuoDigits {
    public static void main(String[] args) {
        String result = isDouDigit(11224);

        System.out.println(result);


    }

    private static String  isDouDigit(int number) {
        String s = String.valueOf(number);
        String [] SElements = s.split("");

        HashSet<String> hset = new HashSet<>();
        Collections.addAll(hset, SElements);

        if (hset.size() > 2){
            return "n";
        }
        return "y";
    }
}
