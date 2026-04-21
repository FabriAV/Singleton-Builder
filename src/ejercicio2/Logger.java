package ejercicio2;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Logger {
    private static Logger instance;
    private List<String> historial;
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private Logger(){
        this.historial = new ArrayList<>();
    }

    public static Logger getInstance() {
        if (instance == null){
            synchronized (Logger.class){
                if (instance == null) instance = new Logger();
            }
        }
        return instance;
    }

    public void registrar(String nivel, String mensaje){
        historial.add("[" + nivel + "] " + LocalDateTime.now().format(formato)+ " - " + mensaje);
    }

    public void imprimirHistorial(){
        for (String entrada : historial) System.out.println(entrada);
    }
}
