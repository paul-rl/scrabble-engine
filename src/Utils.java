import java.util.HashMap;
import java.util.Map;

public class Utils {
    // Create letter-to-value HashMap
    private static final Map<Character, Integer> letterValues;
    static {
        Map<Character, Integer> tempMap = new HashMap<Character, Integer>();
        tempMap.put('a', 1);
        tempMap.put('b', 3);
        tempMap.put('c', 3);
        tempMap.put('d', 2);
        tempMap.put('e', 1);
        tempMap.put('f', 4);
        tempMap.put('g', 2);
        tempMap.put('h', 4);
        tempMap.put('i', 1);
        tempMap.put('j', 8);
        tempMap.put('k', 5);
        tempMap.put('l', 1);
        tempMap.put('m', 3);
        tempMap.put('n', 1);
        tempMap.put('o', 1);
        tempMap.put('p', 3);
        tempMap.put('q', 10);
        tempMap.put('r', 1);
        tempMap.put('s', 1);
        tempMap.put('t', 1);
        tempMap.put('u', 1);
        tempMap.put('v', 4);
        tempMap.put('w', 4);
        tempMap.put('x', 8);
        tempMap.put('y', 4);
        tempMap.put('z', 10);
        tempMap.put('_', 0);

        letterValues = tempMap;
    }
    
    public int getValue(char letter){
        return letterValues.get(letter);
    }
}
