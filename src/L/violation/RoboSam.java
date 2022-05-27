package L.violation;

import jdk.jshell.spi.ExecutionControl;

public class RoboSam {

    private final String cafe;
    protected String acucar;

    public RoboSam(String cafe, String acucar) {
        this.cafe = cafe;
        this.acucar = acucar;
    }

    public String fazerCafe() throws ExecutionControl.NotImplementedException {
        return "SAM: Aqui está o café: " + cafe + "+" + acucar;
    }

}