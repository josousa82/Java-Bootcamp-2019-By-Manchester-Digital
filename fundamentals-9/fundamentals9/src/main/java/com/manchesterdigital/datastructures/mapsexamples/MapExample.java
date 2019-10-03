package com.manchesterdigital.datastructures.mapsexamples;

import com.manchesterdigital.objects.solidprinciples.dependecyinversionprinciple.KeyboardTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapExample {


    public static void main(String[] args) {

        // Not a good practice, not interchangeable
        Map<String, String> countries = new HashMap<String, String>();
        countries.put("enGB","England");
        countries.put("esEs","Spain");
        countries.put("ptPt","Portugal");

        // Good Practice
       //HashMap<String, String> names = new HashMap<String, String>();
       // names.put("John", "John");

        String key = "ptPt";

        String portugal = countries.get(key);

        System.out.println("Portugal " + portugal);

        countries.put(key, " Duncan ");

        System.out.printf("Value of Portugal is now = %s\n",  countries.get(key));

        Map<Integer, String> names = new HashMap<>();
        names.put(1, "John");
        names.put(2, "Andrew");

        // Removes item by key
        String removeName = names.remove(2);
        System.out.printf("removeName %s \n", removeName);

        String removeNameOnSameIdx = names.remove(2);

        System.out.printf("removeNameOnSameIdx %s \n", removeNameOnSameIdx);

        // empties the map:
        names.clear();

        System.out.printf("number of itens in map = %d", names.size());

        names.put(1, "April");
        names.put(2, "Sonia");
        names.put(3, "Schmek");


        for (Map.Entry<Integer, String> me : names.entrySet() ) System.out.printf("\nKey = %d  and value = %s",
                                                                                  me.getKey(), me.getValue());

        for(Integer mapKey: names.keySet()) System.out.println("\nmapKey = " + mapKey);

        for(String val: names.values()) System.out.println("\nValue = " + val);

        if(names.containsKey(1)) System.out.println("\nThere is ID 1");

        System.out.println("\nFound value? " + names.containsKey(1258214));

    }

}
