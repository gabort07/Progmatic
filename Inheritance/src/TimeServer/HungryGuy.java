package TimeServer;

import java.time.LocalTime;

public class HungryGuy implements TimeAware {
    @Override
    public void message(LocalTime time) {
        if(time.isAfter(LocalTime.of(6,0))&& time.isBefore(LocalTime.of(9,0))){
            System.out.println("Juhhuuu reggeli");
        }else if(time.isAfter(LocalTime.of(11,0))&& time.isBefore(LocalTime.of(13,0))){
            System.out.println("Juhhuuu ebéd");
        }else if(time.isAfter(LocalTime.of(18,0))&& time.isBefore(LocalTime.of(20,0))){
            System.out.println("Juhhuuu vacsora");
        } else {
            System.out.println("Juj de éhes vagyok");
        }
    }
}
