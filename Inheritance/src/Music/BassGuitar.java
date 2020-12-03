package Music;

public class BassGuitar extends StringeInstrument {
    public BassGuitar(int a){
        super(a,"Dumm-dumm-dumm");
    }

    public BassGuitar(){
        super(4,"Dumm-dumm-dumm");
    }

    @Override
    public void play() {
        System.out.println("Bass Guitar, " + getNumberOfStrings()+"-stringed instrument that goes "+sound());
    }
}
