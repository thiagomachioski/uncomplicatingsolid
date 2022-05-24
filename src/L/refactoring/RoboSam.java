package L.refactoring;

public class RoboSam {
    
    protected String cafe;
    protected String acucar;

    public RoboSam(String cafe, String acucar) {
        this.cafe = cafe;
        this.acucar = acucar;
    }

    public String fazerCafe() {
        return "SAM: Aqui está o café: " + cafe + "+" + acucar;
    }

}
