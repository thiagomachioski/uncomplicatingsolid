package L.violation;

public class App {

    public static void main(String[] args) {
        RoboSam roboSam = new RoboSam("cafe", "acucar");
        RoboEden roboFilhoDeSam = new RoboEden("agua", "acucar");

        pegarCafe(roboSam);
        pegarCafe(roboFilhoDeSam);
    }

    private static void pegarCafe(RoboSam robo) {
        System.out.println(robo.fazerCafe());
    }

}