import java.io.* ;

public class LsCommand implements Commands {
    public String name () {
        return "LS" ;
    }

    public void exec () {
        File directoryPath = new File( System.getProperty( "user.dir" ) ) ;
        String contents[] = directoryPath.list() ;

        System.out.print( "[ Содержимое текущего рабочего каталога: " ) ;
        for (int i = 0 ; i < contents.length - 1 ; i++ ) {
            System.out.print( "\"" + contents[ i ] + "\" " ) ;
        }
        System.out.println( "]" ) ;
    }
}