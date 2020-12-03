package InteligentLifeforms;

public class LazyTherapist implements LifeForm {
    @Override
    public void answer(String string) {
        if (string.charAt(string.length() - 1) == '?') {
            switch ((int) (Math.random() * 4 + 1)) {
                case 1 -> System.out.println("Biztos ön ebben?");
                case 2 -> System.out.println("Miért gondolja ezt?");
                case 3 -> System.out.println("El tudja képzelni ennek az ellenkezőjét is?");
                case 4 -> System.out.println("Nem tudom. Talán így van. Ön mit gondol erről?");

            }
        } else if (string.charAt(string.length() - 1) == '!') {
            switch ((int) (Math.random() * 3 + 1)) {
                case 1 -> System.out.println("Most dühös lett?");
                case 2 -> System.out.println("Mit érez miközben ezt mondja?");
                case 3 -> System.out.println("Feszült lett attól, amiről beszélünk?");
            }

        } else {
            switch ((int) (Math.random() * 4 + 1)) {
                case 1 -> System.out.println("Kérem, folytassa");
                case 2 -> System.out.println("Biztos ebben?");
                case 3 -> System.out.println("Csakugyan?");
                case 4 -> System.out.println("Hmm. Ez érdekes. Kérem fejtse ki bővebben!?");
            }


        }
    }
}
