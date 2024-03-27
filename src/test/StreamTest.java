package test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Title: StreamTest
 * @Description:
 * @Company:
 * @Create time: 2024/3/19 14:13
 * @Author: huangwq
 * @Version 1.0
 */
public class StreamTest {

    public static void main(String[] args) {
        List<String> testList = new ArrayList<>(Arrays.asList("2", "5", "8"));
        Set<String> testSet = new HashSet<>(Arrays.asList("1", "7"));
        System.out.println(testList.stream().anyMatch(testSet::contains));

        List mapList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Map map = new HashMap();
            map.put("object_id", i + "_aaa");
            mapList.add(map);
        }
        System.out.println(mapList.stream().map(map->((Map)map).get("object_id").toString().split("_")[0]).collect(Collectors.toList()));
    }
}
