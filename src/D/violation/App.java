package D.violation;

public class App {

    public static void main(String[] args) {
        System.out.println("\n\n\n");
        System.out.println("EXECUTANDO O EXEMPLO: VIOLACAO - INVERSAO DE DEPENDENCIA \n");

        RoboChefFacade roboChefFacade = new RoboChefFacade();
        String pizza = "P_I_Z_Z_A";
        roboChefFacade.cortarPizza(pizza);

        System.out.println("----------------------------------------");

        System.out.println("Agora como cortar a pizza com outro braco cortador? '_' ");
        System.out.println("\n\n\n");
    }

}
