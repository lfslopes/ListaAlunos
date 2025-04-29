package lista_alunos;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private long matricula;
    private double media;

    public Aluno(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }
    public long getMatricula() {
        return matricula;
    }
    public double getMedia() {
        return media;
    }

    @Override
    public int compareTo(Aluno aluno) {
        if (this.getMatricula() == aluno.getMatricula())
            return Long.compare(getMatricula(), aluno.getMatricula());
        return this.getNome().compareTo(aluno.getNome());
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + ", matricula: " + matricula + ", media: " + media;
    }
}
