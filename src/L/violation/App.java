package L.violation;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        System.out.println("\n\n\n");
        System.out.println("EXECUTANDO O EXEMPLO: VIOLACAO - SUBSTITUICAO DE LISKOV \n");
        RoboSam roboSam = new RoboSam("cafe", "acucar");
        RoboEden roboFilhoDeSam = new RoboEden("agua", "acucar");

        System.out.println("-------------------------------------------------------------");

        pegarCafe(roboSam);
        pegarCafe(roboFilhoDeSam);
        System.out.println("\n\n\n");
    }

    private static void pegarCafe(RoboSam robo) {
        try {
            System.out.println(robo.fazerCafe());
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage() + " " + ex.getClass());
        }
    }

}