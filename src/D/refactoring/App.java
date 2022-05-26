package D.refactoring;

import D.refactoring.bracos.impl.BracoCortadorPizzaComFaca;
import D.refactoring.bracos.impl.BracoCortadorPizzaComSerra;
import D.refactoring.service.RoboChefService;

public class App {
    public static void main(String[] args) {
        RoboChefService roboChefDePizzaService = new RoboChefService(new BracoCortadorPizzaComFaca());
        String pizza = "P_I_Z_Z_A";
        roboChefDePizzaService.cortarPizza(pizza);

        System.out.println("------------------------------------------------------------------------");

        RoboChefService roboChefDePizzaDoceService = new RoboChefService(new BracoCortadorPizzaComSerra());
        String pizzaDoce = "P-I-Z-Z-A-D-O-C-E";
        roboChefDePizzaDoceService.cortarPizza(pizzaDoce);
    }

}
