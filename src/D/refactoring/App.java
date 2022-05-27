package D.refactoring;

import D.refactoring.bracos.impl.BracoCortadorPizzaComFaca;
import D.refactoring.bracos.impl.BracoCortadorPizzaComSerra;
import D.refactoring.service.RoboChefService;
import D.refactoring.config.AppBase;

public class App extends AppBase {

    public App() { super("REFATORACAO - PRINCIPIO DA INVERSAO DE DEPENDENCIA"); }

    public static void main(String[] args) { new App(); }

    @Override
    public void exemplo() {
        RoboChefService roboChefDePizzaService = new RoboChefService(new BracoCortadorPizzaComSerra());
        String pizza = "P_I_Z_Z_A";
        roboChefDePizzaService.cortarPizza(pizza);

        System.out.println("------------------------------------------------------------------------");

        RoboChefService roboChefDePizzaDoceService = new RoboChefService(new BracoCortadorPizzaComFaca());
        String pizzaDoce = "P-I-Z-Z-A-D-O-C-E";
        roboChefDePizzaDoceService.cortarPizza(pizzaDoce);
    }

}
