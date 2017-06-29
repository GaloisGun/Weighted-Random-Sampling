package main;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSampler {
    private List<Element> elements;
    private Random random = new Random();
    private int totalPro = 0;

    public RandomSampler(List<Element> elements) {
        this.elements = elements;
        for (Element element : elements) {
            totalPro += element.probability;
        }
    }

    public Element getRandom() {
        int index = random.nextInt(totalPro);
        int sum = 0;
        int i = 0;
        while (sum < index) {
            sum += elements.get(i++).probability;
        }
        return elements.get(Math.max(0, i-1));
    }


}
