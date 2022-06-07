import java.time.LocalDateTime ;
import java.time.format.DateTimeFormatter ;

public class DateCommand implements Commands {
    public String name () {
        return "DATE" ;
    }

    public void exec () {
        LocalDateTime now = LocalDateTime.now() ;
        DateTimeFormatter df = DateTimeFormatter.ofPattern( "d/M/y" ) ;

        System.out.println( "[ Текущая дата: " + now.format( df ) + " ] " ) ;
    }
}