package D.violation;

public class App {

    public static void main(String[] args) {
        RoboChefFacade roboChefFacade = new RoboChefFacade();

        String pizza = "P_I_Z_Z_A";
        roboChefFacade.cortarPizza(pizza);

        System.out.println("----------------------------------------");

        String pizzaDoce = "P-I-Z-Z-A-D-O-C-E";
        roboChefFacade.cortarPizza(pizzaDoce);
    }

}
