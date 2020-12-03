package CircleDataStructure;

import java.util.Iterator;

public class TryCircle {
        public static void main(String[] args) {
            Circle<String> circle = new Circle<>();
            circle.add("Hétfõ");
            circle.add("Szerda");
            circle.add("Csütörtök");
            circle.add("Péntek");
            circle.add("Szombat");
            circle.add("Vasárnap");
            circle.addAfter("Hétfõ", "Kedd");

            Iterator<String> iterator = circle.iterator();
            for (int i = 0; i < 100 && iterator.hasNext(); i++) {
                System.out.println(iterator.next());
            }
        }

    }
