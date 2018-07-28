package com.crossoverjie.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author liji
 */
public class Foreach {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>(16);
        map.put("1", "2");
        map.put("3", "4");
        map.put("5", "6");

        // 遍历map
        map.forEach(
                (k, v) -> {
            System.out.println(k + v);
        });

        List<String> list = new ArrayList<String>();
        list.add("6");
        list.add("7");
        list.add("8");

        //遍历List
        list.forEach(item -> {
            System.out.println(item);
        });

    }

}