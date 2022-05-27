package O.violation;

/**
 * OCP Violation
 * Violação do Princípio Aberto-Fechado
 */
public class RoboCozinheiro {
    private String nome;
    private String faca;
    private String bolo;
    private String pincel;
    private String parede;

    public RoboCozinheiro(String nome, String faca, String bolo, String pincel, String parede) {
        this.nome = nome;
        this.faca = faca;
        this.bolo = bolo;
        this.pincel = pincel;
        this.parede = parede;
    }

    private void cortarBolo() {
        System.out.println(this.nome + " cortou o " + bolo + " com a " + faca);
    }

    private void pintarParede() {
        System.out.println(this.nome + " pintou a " + parede + " com o " + pincel);
    }

    /**
     *
     * Método modificado!
     * @param acao - adicionado para suportar a acao PINTAR
     *
     */
    public void executar(Acao acao) {
        if (acao.equals(Acao.CORTAR)) {
            cortarBolo();
        } else if (acao.equals(Acao.PINTAR)) {
            pintarParede();
        }
    }

    public enum Acao {
        CORTAR, PINTAR
    }
}