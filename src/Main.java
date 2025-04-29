import lista_alunos.Aluno;
import lista_alunos.ListaAlunos;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Jorge", 202010055, 8.9);
        Aluno aluno2 = new Aluno("Pedro", 202010056, 9.5);
        Aluno aluno3 = new Aluno("Matheus", 202010057, 9.9);
        Aluno aluno4 = new Aluno("Jorge", 202010056, 8.9);
        Aluno aluno5 = new Aluno("Jorge", 202010057, 8.9);
        Aluno aluno6 = new Aluno("Jorge", 202010058, 8.9);
        Aluno aluno7 = new Aluno("Jorge", 202010059, 8.9);
        Aluno aluno8 = new Aluno("Pedro Alcântara", 202011260, 8.0);

        ListaAlunos listaAlunos = new ListaAlunos(aluno, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8);
        listaAlunos.adicionarAluno("Garibaldo Sésamo", 202226969, 10.0);
        listaAlunos.removerAluno("Jorge");
        System.out.println("############################# - Alunos em ordem alfabética - #############################");
        listaAlunos.ExibirAlunosPorNome();
        System.out.println("############################# - Alunos em ordem de notas - #############################");
        listaAlunos.ExibirAlunosPorNota();
    }
}
