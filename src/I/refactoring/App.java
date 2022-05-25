package I.refactoring;

import I.refactoring.exercicio.impl.RoboEden;
import I.refactoring.exercicio.impl.RoboSam;

public class App {

    public static void main(String[] args) {
        RoboSam roboSam = new RoboSam("SAM");
        RoboEden roboEden = new RoboEden("Eden");

        roboSam.girarEmTorno();
        roboSam.rotacionarBracos();
        roboSam.balancarAntenas();

        System.out.println("--------------------------------------");

        roboEden.girarEmTorno();
        roboEden.rotacionarBracos();
        // roboEden.balancarAntenas(); - agora quem não tem antena não é obrigado a implementar o método balançar antenas
    }

}
