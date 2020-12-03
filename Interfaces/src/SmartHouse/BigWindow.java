package SmartHouse;

public class BigWindow implements DoorsAndWindows {
    boolean opened = Math.random() > 0.5;

    @Override
    public void open() {
        this.opened = true;
    }

    @Override
    public void close() {
        this.opened = false;
    }

    @Override
    public String toString() {
        if (this.opened) {
            return "\u25A1" + "\u25A1";
        }
        return "\u25A0" + "\u25A0";

    }
}
