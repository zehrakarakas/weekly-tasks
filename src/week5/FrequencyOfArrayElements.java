package week5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        System.out.println(frequencyArray(new String[]{"Apple","Banana", "apple", "Cherry", "Apple"}));

    }
    public static Map<String, Integer> frequencyArray(String[] list){

        Map<String, Integer> map = new HashMap<>(); //LinkedHashMap<>()

        for (String each : list) {  // O(n)-->time complexity
           if(map.containsKey(each)){
               map.put(each,map.get(each)+1);
                }else{
               map.put(each,1);

            }

        }
        return map;

    }
}
