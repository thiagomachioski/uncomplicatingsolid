package I.violation;

import I.violation.exercicios.RoboImpl;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("\n\n\n");
        System.out.println("EXECUTANDO O EXEMPLO: VIOLACAO - SEGREGACAO DE INTERFACES \n");

        RoboImpl roboSam = new RoboImpl("Sam", true);
        RoboImpl roboEden = new RoboImpl("Eden", false);

        roboSam.girarEmTorno();
        roboSam.rotacionarBracos();
        roboSam.balancarAntenas();

        System.out.println("-----------------------------------------------------------------");

        roboEden.girarEmTorno();
        roboEden.rotacionarBracos();
        roboEden.balancarAntenas();

        System.out.println("\n\n\n");
    }

}
