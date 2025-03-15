package sistemadegestaodepedidos;

public class EmailNotificador implements Notificador {

    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}
