package D.refactoring.bracos.impl;

import D.refactoring.bracos.IBracoCortador;

public class BracoCortadorPizzaComFaca implements IBracoCortador {
    @Override
    public String cortar(String pizza) {
        String pizzaCortada = pizza.replaceAll("-", " ");
        return pizza + " -- cortada com braço de faca ->  " + pizzaCortada;
    }
}
