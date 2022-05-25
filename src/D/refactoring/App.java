package D.refactoring;

import D.refactoring.bracos.impl.BracoCortadorPizza;
import D.refactoring.bracos.impl.BracoCortadorPizzaDoce;
import D.refactoring.service.RoboChefService;

public class App {

    public static void main(String[] args) {
        RoboChefService roboChefDePizzaService = new RoboChefService(new BracoCortadorPizza());

        String pizza = "P_I_Z_Z_A";
        roboChefDePizzaService.cortarPizza(pizza);

        System.out.println("----------------------------------------");

        RoboChefService roboChefDePizzaDoceService = new RoboChefService(new BracoCortadorPizzaDoce());

        String pizzaDoce = "P-I-Z-Z-A-D-O-C-E";
        roboChefDePizzaDoceService.cortarPizza(pizzaDoce);
    }

}
