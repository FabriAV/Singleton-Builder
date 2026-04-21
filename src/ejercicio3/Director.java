package ejercicio3;

public class Director{
        public ReportePDF construirReporteContable(ReportePDF.Builder b) {
            return b.conEncabezado().conTablaDatos().setAutor("Area Contable").build();
        }

        public ReportePDF construirReporteGerencia(ReportePDF.Builder b) {
            return b.conEncabezado().conResumenEjecutivo().setAutor("Gerencia").build();
        }

        public ReportePDF construirReporteLegal(ReportePDF.Builder b) {
            return b.conEncabezado().conFirmaDigital().conPieLegal().setAutor("Area Legal").build();
        }
}

