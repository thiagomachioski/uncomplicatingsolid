package L.violation;

public class RoboSam {

    private final String cafe;
    protected String acucar;

    public RoboSam(String cafe, String acucar) {
        this.cafe = cafe;
        this.acucar = acucar;
    }

    public String fazerCafe() {
        return "SAM: Aqui está o café: " + misturarIngredientes(cafe, acucar);
    }

    protected String misturarIngredientes(String ingrediente1, String ingrediente2) {
        return ingrediente1.toUpperCase() + ingrediente2.toUpperCase();
    }
}