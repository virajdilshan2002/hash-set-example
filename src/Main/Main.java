package Main;

import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet h1 = new HashSet();

        System.out.println(h1.isEmpty());   // true

        h1.add(60);
        h1.add(40);
        h1.add(80);
        h1.add(80);
        h1.add(30);
        h1.add(10);

        // HashSet stores unique elements and store randomly
        System.out.println(h1);       // [10, 40, 30, 80, 60]

        h1.remove(10);                       // removes 10
        System.out.println(h1.contains(10));   // false
        System.out.println(h1);               // [40, 30, 80, 60]
        System.out.println(h1.size());       // 4

        h1.clear();                // removes all elements
        System.out.println(h1);   // []
    }
}
