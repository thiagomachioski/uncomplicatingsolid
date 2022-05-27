package L.violation;

import jdk.jshell.spi.ExecutionControl;

import java.util.Arrays;

/**
 * LSP Violation
 * Violação do Princípio da Substituição de Liskov
 */
public class RoboEden extends RoboSam {

    private final String agua;

    public RoboEden(String agua, String acucar) {
        super(null, acucar);
        this.agua = agua;
    }

    public String fazerAguaDoce() {
        return "EDEN: aqui está a água doce: " + misturarIngredientes(agua, acucar);
    }

}