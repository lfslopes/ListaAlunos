package lista_alunos;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ListaAlunos {
    private Set<Aluno> alunos;

    public ListaAlunos() {
        this.alunos = new TreeSet<>();
    }
    public ListaAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }
    public ListaAlunos(Aluno...aluno) {
        this.alunos = new TreeSet<>();
        this.alunos.addAll(Arrays.asList(aluno));
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        this.alunos.add(new Aluno(nome, matricula, media));
    }
    public void removerAluno(String nome) {
        this.alunos.removeIf(aluno -> aluno.getNome().equals(nome));
    }
    public void ExibirAlunosPorNome() {
        this.alunos.forEach(System.out::println);
    }
    public void ExibirAlunosPorNota() {
        this.alunos.
                stream().
                sorted((aluno1, aluno2) -> Double.compare(aluno1.getMedia(), aluno2.getMedia())).
                forEach(System.out::println);
    }
    public void exibirAlunos() {
        this.alunos.forEach(System.out::println);
    }
}
