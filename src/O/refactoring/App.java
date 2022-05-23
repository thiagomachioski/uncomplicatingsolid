package O.refactoring;

public class App {

    public static void main(String[] args) {
        
        RoboCozinheiro roboCozinheiro = new RoboCozinheiro("Cozinheiro", "faca", "bolo");
        RoboPintor roboPintor = new RoboPintor("Pintor", "pincel", "parede");

        roboCozinheiro.executar();
        roboPintor.executar();

    }

}
