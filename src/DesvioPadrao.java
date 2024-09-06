public class DesvioPadrao {
    private int[] numeros;

    public DesvioPadrao(int[] numeros) {
        this.numeros = numeros;
    }

    private double calcularMedia() {
        double soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma / numeros.length;
    }

    public double calcularDesvioPadrao() {
        double media = calcularMedia();
        double somaQuadrados = 0;
        for (int num : numeros) {
            somaQuadrados += Math.pow(num - media, 2);
        }
        return Math.sqrt(somaQuadrados / numeros.length);
    }
}
