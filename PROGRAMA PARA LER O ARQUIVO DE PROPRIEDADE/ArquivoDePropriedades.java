import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
*
* @author Demetrius de oliveira
* dimmy2086@gmail.com
*
*/
public class ArquivoDePropriedades {

   
    public static Properties getProp() throws IOException
    {
        Properties props = new Properties();
        //When put to run on the terminal, the message Access denied to file.
        FileInputStream file = new FileInputStream("C:/Users/dimmy/Documents/GitHub/TicTacToe/TicTacToejava");
        props.load(file);
        return props;
       
    }
   
    public static void main(String args[]) throws IOException
    {
        System.out.println("**********Teste usando arquivo de propriedades**********");
        Properties prop = getProp();
        System.out.println("Nome = "+prop.getProperty("prop.nome"));
        System.out.println("Diretorio = "+prop.getProperty("prop.dir"));
    }
}