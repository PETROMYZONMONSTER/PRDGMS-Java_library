public class Funcionario extends Usuario {

    public Funcionario(String nome, int id) {
        super(nome, id);
    }

    // Exemplo de permissão adicional
    public void adicionarLivro(Livro livro) {
        System.out.println("Livro '" + livro.getTitulo() + "' adicionado por " + getNome());
    }

    @Override
    public void acessarSistema() {
        System.out.println(getNome() + " acessou o sistema como Funcionário com permissões adicionais.");
    }
}
