public class JurosCompostos {
    private double capitalInicial;
    private double taxaJuros;
    private int tempo;
    private int frequencia;

    public JurosCompostos(double capitalInicial, double taxaJuros, int tempo, int frequencia) {
        this.capitalInicial = capitalInicial;
        this.taxaJuros = taxaJuros;
        this.tempo = tempo;
        this.frequencia = frequencia;
    }

    public double calcularMontante() {
        return capitalInicial * Math.pow(1 + (taxaJuros / frequencia), frequencia * tempo);
    }

    public double calcularJuros() {
        return calcularMontante() - capitalInicial;
    }
}
