package ejercicio2;

public class MainLogger {
    static void main(String[] args) {
        Logger ModuloLogin = Logger.getInstance();
        Logger ModuloTransferencia = Logger.getInstance();
        Logger ModuloRetiro = Logger.getInstance();
        ModuloLogin.registrar("INFO", "Usuario Fabricio logueado correctamente");
        ModuloTransferencia.registrar("INFO", "Transferencia de S/500 realizada a cuenta 12345");
        ModuloRetiro.registrar("WARNING", "Retiro de S/1000 supera el limite diario");
        ModuloLogin.imprimirHistorial();
    }
}
