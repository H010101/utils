package test;

import java.util.*;

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
    }
}
