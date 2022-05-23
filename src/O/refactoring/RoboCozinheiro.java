package O.refactoring;

/**
 * OCP refactoring
 * Refatoração da classe para seguir o Princípio Aberto-Fechado
 */
public class RoboCozinheiro extends RoboAbstract {

    private String faca;
    private String bolo;
    
    public RoboCozinheiro(String nome, String faca, String bolo) {
        this.nome = nome;
        this.faca = faca;
        this.bolo = bolo;
    }

    @Override
    public void executar() {
        System.out.println(this.nome + " vai CORTAR");
        /** implementação */
    }
    
}
