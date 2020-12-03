package Music;

abstract class StringeInstrument extends Instrument {
    protected int numberOfStrings;
    String sound;

    public StringeInstrument(int numberOfStrings, String sound) {
        this.numberOfStrings = numberOfStrings;
        this.sound = sound;
    }

    public String sound() {
        return this.sound;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

}
