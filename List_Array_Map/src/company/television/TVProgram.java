package company.television;

import java.util.Objects;

public class TVProgram {
    private final String title;
    private final String channel;

    public TVProgram(String channel, String title) {
        this.title = title;
        this.channel = channel;
    }

    public String getTitle() {
        return title;
    }

    public String getChannel() {
        return channel;
    }

    @Override
    public String toString() {
        return "TVProgram{" +
                "title='" + this.title + '\'' +
                ", channel='" + this.channel + '\'' +
                '}';
    }
}
