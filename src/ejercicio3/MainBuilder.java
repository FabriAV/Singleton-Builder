package ejercicio3;

public class MainBuilder {
    public static void main(String[] args) {
        Director director = new Director();

        ReportePDF contable = director.construirReporteContable(new ReportePDF.Builder("Reporte Contable"));
        ReportePDF gerencia = director.construirReporteGerencia(new ReportePDF.Builder("Reporte Gerencia"));
        ReportePDF legal = director.construirReporteLegal(new ReportePDF.Builder("Reporte Legal"));

        System.out.println(contable);
        System.out.println(gerencia);
        System.out.println(legal);
    }
}