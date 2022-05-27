package O.refactoring;

public class App {

    public static void main(String[] args) {
        System.out.println("\n\n\n");
        System.out.println("EXECUTANDO O EXEMPLO: REFATORACAO - ABERTO FECHADO \n");
        
        RoboCozinheiro roboCozinheiro = new RoboCozinheiro("Cozinheiro", "faca", "bolo");
        RoboPintor roboPintor = new RoboPintor("Pintor", "pincel", "parede");

        roboCozinheiro.executar();
        roboPintor.executar();

        System.out.println("\n\n\n");
    }
}
