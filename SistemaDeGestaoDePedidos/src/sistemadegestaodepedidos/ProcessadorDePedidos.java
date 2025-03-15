package sistemadegestaodepedidos;

public class ProcessadorDePedidos {

    private PedidoRepository pedidoRepository;
    private Notificador notificador;

    public ProcessadorDePedidos(PedidoRepository pedidoRepository, Notificador notificador) {
        this.pedidoRepository = pedidoRepository;
        this.notificador = notificador;
    }

    public void processarPedido(Pedido pedido) {
        double valorFinal = pedido.calcularValorFinal();
        pedido.processarPagamento();
        pedidoRepository.salvarPedido(pedido);
        notificador.enviarNotificacao("Pedido processado com valor final: R$ " + valorFinal);
    }
}
