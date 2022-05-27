package I.refactoring;

import I.refactoring.exercicio.base.impl.RoboEden;
import I.refactoring.exercicio.base.impl.RoboSam;

public class App {

    public static void main(String[] args) {
        System.out.println("\n\n\n");
        System.out.println("EXECUTANDO O EXEMPLO: REFATORACAO - SEGREGACAO DE INTERFACES \n");
        RoboSam roboSam = new RoboSam("SAM");
        RoboEden roboEden = new RoboEden("Eden");

        roboSam.girarEmTorno();
        roboSam.rotacionarBracos();
        roboSam.balancarAntenas();

        System.out.println("--------------------------------------");

        roboEden.girarEmTorno();
        roboEden.rotacionarBracos();
        // roboEden.balancarAntenas(); - agora quem não tem antena não é obrigado a implementar o método balançar antenas
        System.out.println("\n\n\n");
    }

}
