package L.violation;

import jdk.jshell.spi.ExecutionControl;

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

    @Override
    public String fazerCafe() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("EDEN: desculpe-me! Só sei fazer água. \n" +
                "Aceita uma água doce?");
    }

    public String fazerAguaDoce() {
        return "EDEN: aqui está a água doce: " + agua + "+" + this.acucar;
    }

}