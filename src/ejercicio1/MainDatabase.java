package ejercicio1;

public class MainDatabase {
    static void main(String[] args) {
        DatabaseConnection c1 = DatabaseConnection.getInstance();
        c1.ejecutarConsulta("SELECT * FROM carrito");
        DatabaseConnection c2 = DatabaseConnection.getInstance();
        c2.ejecutarConsulta("SELECT * FROM inventario");
        DatabaseConnection c3 = DatabaseConnection.getInstance();
        c3.ejecutarConsulta("SELECT * FROM reporte");
  }
}

