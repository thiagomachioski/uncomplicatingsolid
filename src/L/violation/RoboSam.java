package L.violation;

public class RoboSam {

    private String cafe;
    protected String acucar;

    public RoboSam(String cafe, String acucar) {
        this.cafe = cafe;
        this.acucar = acucar;
    }

    public String fazerCafe() {
        return "Aqui está o café: " + cafe + "+" + acucar;
    }

}