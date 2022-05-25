package D.refactoring.bracos.impl;

import D.refactoring.bracos.IBracoCortador;

public class BracoCortadorPizzaDoce implements IBracoCortador {

    @Override
    public String cortar(String pizza) {
        String pizzaCortada = pizza.replaceAll("-", " ");

        return pizza + " -- cortada ->  " + pizzaCortada;
    }

}
