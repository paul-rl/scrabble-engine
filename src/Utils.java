import java.util.HashMap;
import java.util.Map;

public class Utils {
    // Create letter-to-value HashMap
    private static final Map<Character, Integer> letterValues;
    
    static {
        Map<Character, Integer> tempMap = new HashMap<Character, Integer>();
        tempMap.put(Constants.VALID_LETTERS[0], 1);
        tempMap.put(Constants.VALID_LETTERS[1], 3);
        tempMap.put(Constants.VALID_LETTERS[2], 3);
        tempMap.put(Constants.VALID_LETTERS[3], 2);
        tempMap.put(Constants.VALID_LETTERS[4], 1);
        tempMap.put(Constants.VALID_LETTERS[5], 4);
        tempMap.put(Constants.VALID_LETTERS[6], 2);
        tempMap.put(Constants.VALID_LETTERS[7], 4);
        tempMap.put(Constants.VALID_LETTERS[8], 1);
        tempMap.put(Constants.VALID_LETTERS[9], 8);
        tempMap.put(Constants.VALID_LETTERS[10], 5);
        tempMap.put(Constants.VALID_LETTERS[11], 1);
        tempMap.put(Constants.VALID_LETTERS[12], 3);
        tempMap.put(Constants.VALID_LETTERS[13], 1);
        tempMap.put(Constants.VALID_LETTERS[14], 1);
        tempMap.put(Constants.VALID_LETTERS[15], 3);
        tempMap.put(Constants.VALID_LETTERS[16], 10);
        tempMap.put(Constants.VALID_LETTERS[17], 1);
        tempMap.put(Constants.VALID_LETTERS[18], 1);
        tempMap.put(Constants.VALID_LETTERS[19], 1);
        tempMap.put(Constants.VALID_LETTERS[20], 1);
        tempMap.put(Constants.VALID_LETTERS[21], 4);
        tempMap.put(Constants.VALID_LETTERS[22], 4);
        tempMap.put(Constants.VALID_LETTERS[23], 8);
        tempMap.put(Constants.VALID_LETTERS[24], 4);
        tempMap.put(Constants.VALID_LETTERS[25], 10);
        tempMap.put(Constants.VALID_LETTERS[26], 0);

        letterValues = tempMap;
    }
    
    private static final Map<Character, Integer> letterFreqs;
    static {
        Map<Character, Integer> tempMap = new HashMap<Character, Integer>();
        tempMap.put(Constants.VALID_LETTERS[0], 9);
        tempMap.put(Constants.VALID_LETTERS[1], 2);
        tempMap.put(Constants.VALID_LETTERS[2], 2);
        tempMap.put(Constants.VALID_LETTERS[3], 4);
        tempMap.put(Constants.VALID_LETTERS[4], 12);
        tempMap.put(Constants.VALID_LETTERS[5], 2);
        tempMap.put(Constants.VALID_LETTERS[6], 3);
        tempMap.put(Constants.VALID_LETTERS[7], 2);
        tempMap.put(Constants.VALID_LETTERS[8], 9);
        tempMap.put(Constants.VALID_LETTERS[9], 1);
        tempMap.put(Constants.VALID_LETTERS[10], 1);
        tempMap.put(Constants.VALID_LETTERS[11], 4);
        tempMap.put(Constants.VALID_LETTERS[12], 2);
        tempMap.put(Constants.VALID_LETTERS[13], 6);
        tempMap.put(Constants.VALID_LETTERS[14], 8);
        tempMap.put(Constants.VALID_LETTERS[15], 2);
        tempMap.put(Constants.VALID_LETTERS[16], 1);
        tempMap.put(Constants.VALID_LETTERS[17], 6);
        tempMap.put(Constants.VALID_LETTERS[18], 4);
        tempMap.put(Constants.VALID_LETTERS[19], 6);
        tempMap.put(Constants.VALID_LETTERS[20], 4);
        tempMap.put(Constants.VALID_LETTERS[21], 2);
        tempMap.put(Constants.VALID_LETTERS[22], 2);
        tempMap.put(Constants.VALID_LETTERS[23], 1);
        tempMap.put(Constants.VALID_LETTERS[24], 2);
        tempMap.put(Constants.VALID_LETTERS[25], 1);
        tempMap.put(Constants.VALID_LETTERS[26], 2);

        letterFreqs = tempMap;
    }

    public static int getValue(char letter){
        return letterValues.get(letter);
    }

    public static int getFrequency(char letter){
        return letterFreqs.get(letter);
    }
}
