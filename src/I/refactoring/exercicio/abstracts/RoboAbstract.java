package I.refactoring.exercicio.abstracts;

public abstract class RoboAbstract {

    private String nome;

    public RoboAbstract(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
