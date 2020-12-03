package CircleDataStructure;

import java.util.Iterator;

public class TryCircle {
        public static void main(String[] args) {
            Circle<String> circle = new Circle<>();
            circle.add("H�tf�");
            circle.add("Szerda");
            circle.add("Cs�t�rt�k");
            circle.add("P�ntek");
            circle.add("Szombat");
            circle.add("Vas�rnap");
            circle.addAfter("H�tf�", "Kedd");

            Iterator<String> iterator = circle.iterator();
            for (int i = 0; i < 100 && iterator.hasNext(); i++) {
                System.out.println(iterator.next());
            }
        }

    }
