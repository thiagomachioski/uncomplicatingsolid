package L.refactoring;

public class App {
    
    public static void main(String[] args) {
        RoboSam roboSam = new RoboSam("cafe", "acucar");
        RoboEden roboFilhoDeSam = new RoboEden("agua", "acucar", "cafe", "leite");

        pegarCafe(roboSam);
        pegarCafe(roboFilhoDeSam);
    }

    private static void pegarCafe(RoboSam robo) {
        System.out.println(robo.fazerCafe());
    }

}
