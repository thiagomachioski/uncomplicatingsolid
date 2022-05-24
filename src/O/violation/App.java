package O.violation;

public class App {

    private enum Acao {
        CORTAR, PINTAR
    }

    public static void main(String[] args) {
        System.out.println("Robo Cozinheiro: ");
        RoboCozinheiro roboCozinheiro = new RoboCozinheiro("Cozinheiro", "faca", "bolo", null, null);
        executar(roboCozinheiro, Acao.CORTAR);

        System.out.println("Robo pintor: ");
        roboCozinheiro = new RoboCozinheiro("Pintor", null, null, "pincel", "parede");
        executar(roboCozinheiro, Acao.PINTAR);
    }

    private static void executar(RoboCozinheiro robo, Acao acao) {
        System.out.println(robo.getNome() + " vai " + acao.toString());
        if (acao.equals(Acao.CORTAR)) {
            robo.cortarBolo();
        } else if (acao.equals(Acao.PINTAR)) {
            robo.pintarParede();
        }
    }
}
