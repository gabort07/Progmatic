package Music;

class ElectricGuitar extends StringeInstrument{
    public ElectricGuitar(int a){
        super(a, "Twang");
    }

    public ElectricGuitar() {
        super(6, "Twang");
    }



    @Override
    public void play() {
        System.out.println("Electric Guitar, " + getNumberOfStrings()+"-stringed instrument that goes "+sound());
    }
}
