package O.violation;

public class App {

    private enum Acao {
        CORTAR, PINTAR
    }

    public static void main(String[] args) {

        RoboCozinheiro roboCozinheiro = new RoboCozinheiro("Cozinheiro", "faca", "bolo", null, null);

        executar(roboCozinheiro, Acao.CORTAR);

        RoboCozinheiro roboCozinheiroPintor = new RoboCozinheiro("Pintor", null, null, "pincel", "parede");

        executar(roboCozinheiroPintor, Acao.PINTAR);

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
