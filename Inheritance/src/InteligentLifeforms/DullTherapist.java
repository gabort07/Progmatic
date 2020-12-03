package InteligentLifeforms;

public class DullTherapist implements LifeForm{
    @Override
    public void answer(String string) {
        switch ((int) (Math.random() * 4 + 1)) {
            case 1 -> System.out.println("Kérem, folytassa");
            case 2 -> System.out.println("Biztos ebben?");
            case 3 -> System.out.println("Csakugyan?");
            case 4 -> System.out.println("Nem tudom. Talán így van. Ön mit gondol erről?");
        }

    }
}
