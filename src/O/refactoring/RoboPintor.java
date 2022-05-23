package O.refactoring;

/**
 * OCP refactoring
 * Refatoração da classe para seguir o Princípio Aberto-Fechado
 */
public class RoboPintor extends RoboAbstract {

    private String pincel;
    private String parede;

    public RoboPintor(String nome, String pincel, String parede) {
        this.nome = nome;
        this.pincel = pincel;
        this.parede = parede;
    }

    @Override
    public void executar() {
        System.out.println(this.nome + " vai PINTAR");
        /** implementação */
    }

}
