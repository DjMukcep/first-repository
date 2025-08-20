package roman.exercise;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author djmukcep
 */
public class Exercise {

    public static void main(String[] args) {
        System.out.println("test Exercise");
        HashMap<String,String> statesCapitals = new HashMap<>();
        statesCapitals.put("Канада","Оттава");
        statesCapitals.put("Ирак","Багдад");
        statesCapitals.put("Австрия","Вена");
        System.out.println(statesCapitals);
        System.out.println("Столица Австрии - " + statesCapitals.get("Австрия"));
    }
}
