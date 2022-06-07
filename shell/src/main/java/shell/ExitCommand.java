public class ExitCommand implements Commands {
    public String name () {
        return "EXIT" ;
    }

    public void exec () {
        System.out.println( "[ Выход ]" ) ;
        System.exit( 0 ) ;
    }
}