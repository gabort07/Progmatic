package company.Comparatorok;

import java.time.LocalDateTime;

public  class Swipes {
    private int userID;
    private int sentTo;
    private String type;
    private LocalDateTime time;


    public Swipes(int userID, int sentTo, String type, LocalDateTime time) {
        this.userID = userID;
        this.sentTo = sentTo;
        this.type = type;
        this.time = time;
    }

    public int getUserID() {
        return userID;
    }

    public int getSentTo() {
        return sentTo;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getTime() {
        return time;
    }
}