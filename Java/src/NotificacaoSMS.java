public class NotificacaoSMS implements Notificavel {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
