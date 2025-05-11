package com.MAPandHASHMAP;

import java.util.HashMap;

public class MapSyntax {
    public static void main(String[] args) {

        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("Sibi",1);
        empIds.put("siva",2);
        empIds.put("sumi",3);

        System.out.println(empIds);

        System.out.println(empIds.get("Sibi"));

        System.out.println(empIds.containsKey("siva"));

        System.out.println(empIds.containsValue(6));

        empIds.put("Sibi",6);

        System.out.println(empIds);

        empIds.replace("Sibi",4);
        System.out.println(empIds);

        empIds.putIfAbsent("Steve",5);
        System.out.println(empIds);

        empIds.remove("Steve");
        System.out.println(empIds);



    }
}
