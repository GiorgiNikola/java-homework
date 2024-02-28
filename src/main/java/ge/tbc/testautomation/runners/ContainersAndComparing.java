package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;

import java.util.*;

public class ContainersAndComparing {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("555-542-231");
        list.add("555-887-987");
        list.add("555-161-143");
        list.add("555-189-6667");
        Iterator<String> iter = list.iterator();
        System.out.println("\nElements of list printed with iterator: ");
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        HashMap<String,String> map = new HashMap<>();
        map.put("Giorgi", list.get(0));
        map.put("Luka", list.get(1));
        map.put("Nikolozi", list.get(2));
        map.put("Dato", list.get(3));
        System.out.println("\nKeys whose values contain 8: ");
        map.forEach((key, value) -> {if (value.contains("8")) System.out.println(key + " - " + value);});

        TreeSet<Circle> circleSet = new TreeSet<>();
        System.out.println("\nTreeSet with circle objects: ");
        circleSet.add(new Circle(1));
        circleSet.add(new Circle(2));
        circleSet.add(new Circle(2));
        circleSet.add(new Circle(3));
        circleSet.add(new Circle(3));
        circleSet.add(new Circle(4));
        circleSet.add(new Circle(5));
        circleSet.add(new Circle(6));
        circleSet.add(new Circle(7));
        circleSet.add(new Circle(8));
        circleSet.forEach(System.out::println);

        HashSet<Circle> circleHashSet = new HashSet<>();
        circleHashSet.add(new Circle(1));
        circleHashSet.add(new Circle(2));
        circleHashSet.add(new Circle(2));
        circleHashSet.add(new Circle(3));
        circleHashSet.add(new Circle(3));
        circleHashSet.add(new Circle(4));
        circleHashSet.add(new Circle(5));
        circleHashSet.add(new Circle(6));
        circleHashSet.add(new Circle(7));
        circleHashSet.add(new Circle(8));
        System.out.println("\nHashSet with circle objects: ");
        circleHashSet.forEach(System.out::println);

        Comparator<Rectangle> comparator = Comparator.comparing(Rectangle::getPerimeter).reversed();

        List<Rectangle> rectangleList = new ArrayList<>();
        rectangleList.add(new Rectangle(10,2));
        rectangleList.add(new Rectangle(2,3));
        rectangleList.add(new Rectangle(3,4));
        rectangleList.add(new Rectangle(2,1));
        rectangleList.sort(comparator);
        System.out.println("\nRectangleList elements sorted in reversed order: ");
        rectangleList.forEach(System.out::println);
    }
}
