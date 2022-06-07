import java.io.* ;

public class Main {

    public static void main ( String[] args ) {
        Commands[] cmds = { new TimeCommand(), new DateCommand(), new PwdCommand(), new LsCommand(), new ExitCommand() } ;
        Console cnsl = System.console() ;
        String input ;

        System.out.println( "\n[ Команды: TIME, DATE, PWD, LS, EXIT ]" ) ;
        System.out.println( "[ Введите команду ]" ) ;

        do {
            // Ввод команды
            input = cnsl.readLine( " >> " ) ;
            input = input.strip().toUpperCase() ;

            // Поиск команды в cmds
            for ( int i = 0 ; i < cmds.length ; i++ ) {

                if ( cmds[i].name().equals( input ) ) {
                    cmds[i].exec() ;
                    break ;
                }
                
                // Конец массива, break не сработал - неизвестная команда
                if ( i == cmds.length - 1 ) {
                    System.out.println( "[ Неизвестная команда ]" ) ;
                }
            } 
            

        } while ( true ) ;
    }
}