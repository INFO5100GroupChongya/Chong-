package tools;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lhm
 */

public class ConstantDict {
    public static final Map<Integer, String> planeHourMap = new HashMap<Integer, String>(){
        {
            put(0, "Night");
            put(1, "Night");
            put(2, "Night");
            put(3, "Night");
            put(4, "Night");
            put(5, "Night");
            put(6, "Moring");
            put(7, "Moring");
            put(8, "Moring");
            put(9, "Moring");
            put(10, "Moring");
            put(11, "Moring");
            put(12, "Afternoon");
            put(13, "Afternoon");
            put(14, "Afternoon");
            put(15, "Afternoon");
            put(16, "Afternoon");
            put(17, "Afternoon");
            put(18, "Night");
            put(19, "Night");
            put(20, "Night");
            put(21, "Night");
            put(21, "Night");
            put(22, "Night");
            put(23, "Night");
        }
    };
    
    public static final Map<String, String> countryMap = new HashMap<String, String>(){
        {
            put("Beijing", "CHN");
            put("Guangzhou", "CHN");
        }  
    };
}
