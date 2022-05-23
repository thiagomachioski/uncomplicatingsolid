package L.violation;

/**
 * LSP Violation
 * Violação do Princípio da Substituição de Liskov
 */
public class RoboEden extends RoboSam {

    private String agua;

    public RoboEden(String agua, String acucar) {
        super(null, acucar);

        this.agua = agua;
    }

    @Override
    public String fazerCafe() {
        try {
            throw new Exception("Aceita uma água doce?");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return fazerAguaDoce();
    }

    public String fazerAguaDoce() {
        return "aqui está a água doce: " + agua + "+" + this.acucar;
    }

}