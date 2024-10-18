public class SistemaBiblioteca {

    public static void main(String[] args) {
        // Cria os livros
        Livro livro1 = new Livro("Penis 1", "Felipe", "123456");
        Livro livro2 = new Livro("Penis 3", "Felipenis", "654321");

        // Cria usuario e funcionario
        Usuario usuario1 = new Usuario("Danillo", 1);
        Funcionario funcionario1 = new Funcionario("Ana", 2);

        // Funcionario bota livro
        funcionario1.adicionarLivro(livro1);

        // Usuario pegnaod um livro
        Emprestimo emprestimo1 = new Emprestimo(livro1, usuario1);
        usuario1.adicionarEmprestimo(emprestimo1);

        // Verifca acesso dpo sositema
        usuario1.acessarSistema();
        funcionario1.acessarSistema();

        // Devolve livro
        emprestimo1.devolverLivro();

        // Enviar notificacaol
        Notificavel notificacaoEmail = new NotificacaoEmail();
        notificacaoEmail.enviarNotificacao("Livro devolvido com sucesso!");

        Notificavel notificacaoSMS = new NotificacaoSMS();
        notificacaoSMS.enviarNotificacao("Seu empréstimo foi concluído.");
    }
}
