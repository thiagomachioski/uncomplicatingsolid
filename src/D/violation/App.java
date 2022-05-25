package D.violation;

import D.violation.pizzaria_do_robo.RoboChefService;

public class App {

    public static void main(String[] args) {
        RoboChefService roboChefService = new RoboChefService();

        String pizza = "P_I_Z_Z_A";
        roboChefService.cortarPizza(pizza);

        String pizzaDoce = "P-I-Z-Z-A-D-O-C-E";
        roboChefService.cortarPizza(pizzaDoce);
    }

}
