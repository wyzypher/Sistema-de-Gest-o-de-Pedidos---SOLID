package sistemadegestaodepedidos;

public class SmsNotificador implements Notificador {

    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
