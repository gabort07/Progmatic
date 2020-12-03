package SmartHouse;

public class Door implements DoorsAndWindows {
    boolean opened;

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
            return "\u25AF";
        }
        return "\u25AE";
    }


}
