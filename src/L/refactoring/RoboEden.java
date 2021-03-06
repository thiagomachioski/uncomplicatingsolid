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
        String capuccino = misturarIngredientes(cafe, leite);

        return "EDEN: Aqui está um capuccino: " + capuccino;
    }

    public String fazerAguaDoce() {
        return "EDEN: Aqui está a água doce: " + misturarIngredientes(agua, agua);
    }
    
}
