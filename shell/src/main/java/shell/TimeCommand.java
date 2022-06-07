import java.time.LocalDateTime ;
import java.time.format.DateTimeFormatter ;

public class TimeCommand implements Commands {
    public String name () {
        return "TIME" ;
    }

    public void exec () {
        LocalDateTime now = LocalDateTime.now() ;
        DateTimeFormatter df = DateTimeFormatter.ofPattern( "H:m:ss" ) ;

        System.out.println( "[ Текущее время: " + now.format( df ) + " ] " ) ;
    }
}