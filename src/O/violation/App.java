package O.violation;

public class App {

    public static void main(String[] args) {
        System.out.println("\n\n\n");
        System.out.println("EXECUTANDO O EXEMPLO: VIOLACAO - ABERTO FECHADO \n");

        RoboCozinheiro roboCozinheiro = new RoboCozinheiro("Cozinheiro", "faca", "bolo", null, null);
        roboCozinheiro.executar(RoboCozinheiro.Acao.CORTAR);

        System.out.println("-----------------------------------------------------------------------");

        roboCozinheiro = new RoboCozinheiro("Pintor", null, null, "pincel", "parede");
        roboCozinheiro.executar(RoboCozinheiro.Acao.PINTAR);

        System.out.println("\n\n\n");
    }

}
