public class NotificacaoEmail implements Notificavel {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }
}
