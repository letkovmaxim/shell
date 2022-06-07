public class PwdCommand implements Commands {
    public String name () {
        return "PWD" ;
    }

    public void exec () {
        System.out.println( "[ Текущий рабочий каталог: \"" + System.getProperty( "user.dir" ) + "\" ] " ) ;
    }
}