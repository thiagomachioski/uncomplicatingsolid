package I.refactoring.exercicio;

public abstract class RoboAbstract {

    private final String nome;

    public RoboAbstract(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
