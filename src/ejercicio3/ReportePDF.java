package ejercicio3;

public class ReportePDF {
    private String titulo, autor;
    private boolean encabezado,tablaDatos,resumenEjecutivo,firmaDigital,pieLegal;

    private ReportePDF(Builder builder) {
        this.titulo = builder.titulo;
        this.autor = builder.autor;
        this.encabezado = builder.encabezado;
        this.tablaDatos = builder.tablaDatos;
        this.resumenEjecutivo = builder.resumenEjecutivo;
        this.firmaDigital = builder.firmaDigital;
        this.pieLegal = builder.pieLegal;
    }

    public static class Builder{
        private String titulo, autor;
        private boolean encabezado,tablaDatos,resumenEjecutivo,firmaDigital,pieLegal;

        public Builder(String titulo) {
            this.titulo = titulo;
        }

        public Builder conEncabezado() {
            this.encabezado = true;
            return this;
        }

        public Builder conTablaDatos() {
            this.tablaDatos = true;
            return this;
        }

        public Builder conResumenEjecutivo() {
            this.resumenEjecutivo = true;
            return this;
        }

        public Builder conFirmaDigital() {
            this.firmaDigital = true;
            return this;
        }

        public Builder conPieLegal() {
            this.pieLegal = true;
            return this;
        }

        public Builder setAutor(String autor) {
            this.autor = autor;
            return this;
        }

        public ReportePDF build() {
            return new ReportePDF(this);
        }
    }

    @Override
    public String toString() {
        return "ReportePDF{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", encabezado=" + encabezado +
                ", tablaDatos=" + tablaDatos +
                ", resumenEjecutivo=" + resumenEjecutivo +
                ", firmaDigital=" + firmaDigital +
                ", pieLegal=" + pieLegal +
                '}';
    }
}
