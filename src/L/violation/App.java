package L.violation;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        System.out.println("\n\n\n");
        System.out.println("EXECUTANDO O EXEMPLO: VIOLACAO - SUBSTITUICAO DE LISKOV \n");
        RoboSam roboSam = new RoboSam("cafe", "acucar");
        RoboEden roboEden = new RoboEden("agua", "acucar");

        pegarCafe(roboSam);
        System.out.println("-------------------------------------------------------------");
        pegarCafe(roboEden);

        System.out.println("\n\n\n");
    }

    private static void pegarCafe(RoboSam robo) {
        System.out.println(robo.fazerCafe());
    }

}