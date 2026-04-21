package ejercicio1;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private String url;
    private static final Object lock = new Object();
    private DatabaseConnection(){
        this.url = "Conectandose a la base de datos...";
    }

    public static DatabaseConnection getInstance() {
       if (instance == null){
           synchronized (DatabaseConnection.class){
               if (instance == null) {
                   instance = new DatabaseConnection();
               }
           }
       }
       return instance;
    }
    public void ejecutarConsulta(String sql){
        System.out.println(sql + "| Instancia: " + this.hashCode());
    }
}
