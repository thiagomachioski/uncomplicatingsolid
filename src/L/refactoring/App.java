package L.refactoring;

public class App {
    
    public static void main(String[] args) {
        System.out.println("\n\n\n");
        System.out.println("EXECUTANDO O EXEMPLO: VIOLACAO - SUBSTITUICAO DE LISKOV \n");
        RoboSam roboSam = new RoboSam("cafe", "acucar");
        RoboEden roboFilhoDeSam = new RoboEden("agua", "acucar", "cafe", "leite");

        System.out.println("-------------------------------------------------------------");

        pegarCafe(roboSam);
        pegarCafe(roboFilhoDeSam);
        System.out.println("\n\n\n");
    }

    private static void pegarCafe(RoboSam robo) {
        System.out.println(robo.fazerCafe());
    }

}
