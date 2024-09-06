public class Main {
    public static void main(String[] args) {
       
        System.out.println("--------------- EQUAÇÃO DO SEGUNDO GRAU ---------------");
        SegundoGrau equacao = new SegundoGrau(1, 3, -4);
        boolean temSolucao = equacao.calcular();
        if (temSolucao) {
            System.out.println("Raiz 1: " + equacao.getX1());
            System.out.println("Raiz 2: " + equacao.getX2());
        } else {
            System.out.println("A equação não possui soluções reais.");
        }
        System.out.println("-------------------------------------------------------\n");

       
        System.out.println("--------------- DESVIO PADRÃO ---------------");
        int[] numeros = {1, 2, 3, 4, 5};
        DesvioPadrao desvioPadrao = new DesvioPadrao(numeros);
        double desvio = desvioPadrao.calcularDesvioPadrao();
        System.out.println("Desvio padrão: " + desvio);
        System.out.println("--------------------------------------------\n");

      
        System.out.println("--------------- JUROS COMPOSTOS ---------------");
        JurosCompostos juros = new JurosCompostos(1000, 0.05, 5, 12);
        double montante = juros.calcularMontante();
        System.out.println("Montante final: " + montante);
        System.out.println("Juros compostos: " + juros.calcularJuros());
        System.out.println("----------------------------------------------\n");
    }
}
