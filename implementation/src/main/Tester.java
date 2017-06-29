package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuyufei on 6/29/17.
 */
public class Tester {
    public static void main(String[] args) {
        List<Element> testList = new ArrayList<>();
        testList.add(new Element(1,"Bear"));
        testList.add(new Element(1, "dog"));
        testList.add(new Element(2, "Panguin"));

        RandomSampler randomSampler = new RandomSampler(testList);

        for (int i = 0; i < 10; i++) {
            System.out.println(randomSampler.getRandom().name);
        }
    }
}
