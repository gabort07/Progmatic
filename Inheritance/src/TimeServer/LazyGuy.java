package TimeServer;
import java.time.LocalTime;

public class LazyGuy implements TimeAware{
    @Override
    public void message(LocalTime time) {
        if(time.isAfter(LocalTime.of(20,0))&& time.isBefore(LocalTime.of(11,0))){
            System.out.println("hagyj aludni");
        }else {
            System.out.println("Köszz, hogy szoltál!");
        }
    }
}
