import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static Properties config = new Properties();
    private static String arquivo = "config.properties";
    public static void main(String[] args) {
        try {
            config.load(new FileInputStream(arquivo));
            System.out.println("Iniciando processo de leitura de configurações: ");
            System.out.println();
            System.out.println(config.getProperty("nome"));            
            System.out.println("Finalizando leitura!");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}