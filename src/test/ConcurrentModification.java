package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Title: ConcurrentModification
 * @Description:
 * @Company: hwqing
 * @Create time: 2023/10/8 14:36
 * @Author: hwqing
 * @Version 1.0
 */
public class ConcurrentModification {
    public static void main(String[] args) {
        List<Map<String, Object>> startUsers = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("1", "aa");
        startUsers.add(map);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("2", "bb");
        startUsers.add(map2);
        List<Map<String, Object>> users = new CopyOnWriteArrayList();
        users.addAll(startUsers);
//		startUsers.clear();
        for (Map<String, Object> map3 : users) {
            if (map3.containsKey("1")) {
                startUsers.remove(0);
            }
        }
    }
}
