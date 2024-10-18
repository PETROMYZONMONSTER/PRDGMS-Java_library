import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private int id;
    private List<Emprestimo> historicoEmprestimos;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.historicoEmprestimos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public List<Emprestimo> getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        historicoEmprestimos.add(emprestimo);
    }

    public void acessarSistema() {
        System.out.println(nome + " acessou o sistema como Usuário.");
    }
}
