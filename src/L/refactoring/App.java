package L.refactoring;

public class App {
    
    public static void main(String[] args) {
        System.out.println("\n\n\n");
        System.out.println("EXECUTANDO O EXEMPLO: REFATORACAO - SUBSTITUICAO DE LISKOV \n");

        RoboSam roboSam = new RoboSam("cafe", "acucar");
        RoboEden roboEden = new RoboEden("agua", "acucar", "cafe", "leite");

        pegarCafe(roboSam);
        System.out.println("-------------------------------------------------------------");
        pegarCafe(roboEden);

        System.out.println("\n\n\n");
    }

    private static void pegarCafe(RoboSam robo) {
        System.out.println(robo.fazerCafe());
    }

}
