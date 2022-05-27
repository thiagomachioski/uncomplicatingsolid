package D.refactoring.config.impl;

import D.refactoring.bracos.impl.BracoCortadorPizzaComFaca;
import D.refactoring.bracos.impl.BracoCortadorPizzaComSerra;
import D.refactoring.config.ExemploBase;
import D.refactoring.service.RoboChefService;

public class DIPExemploImpl extends ExemploBase {

    public DIPExemploImpl() {
        super("REFATORACAO - PRINCIPIO DA INVERSAO DE DEPENDENCIA");
    }

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
