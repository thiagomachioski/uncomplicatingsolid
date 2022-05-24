package I.violation;

public class App {
    public static void main(String[] args) throws Exception {
        Robo roboSam = new Robo("Sam", true);
        Robo roboEden = new Robo("Eden", false);

        roboSam.girarEmTorno();
        roboSam.rotacionarBracos();
        roboSam.balancarAntenas();

        System.out.println("--------------------------------------");

        roboEden.girarEmTorno();
        roboEden.rotacionarBracos();
        roboEden.balancarAntenas();

    }
}
