package L.refactoring;

/**
 * LSP Refactoring
 * Refatoração da classe para seguir o Princípio da Substituição de Liskov
 */
public class RoboEden extends RoboSam {

    private String agua;
    private String leite;

    public RoboEden(String agua, String acucar, String cafe, String leite) {
        super(cafe, acucar);

        this.agua = agua;
        this.leite = leite;
    }

    @Override
    public String fazerCafe() {
        String capuccino = this.cafe + "+" + this.leite + "+" + this.acucar;

        return "Aqui está um capuccino: " + capuccino;
    }

    public String fazerAguaDoce() {
        return "Aqui está a água doce: " + agua + "+" + this.acucar;
    }
    
}
