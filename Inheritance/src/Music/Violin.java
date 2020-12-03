package Music;

public class Violin extends StringeInstrument {
    public Violin(int a){
        super(a,"Screech");
    }

    public Violin(){
        super(4, "Screech");
    }

    @Override
    public void play() {
        System.out.println("Violin, " + getNumberOfStrings()+"-stringed instrument that goes "+sound());
    }
}
