package sistemadegestaodepedidos;

public class SistemaDeGestaoDePedidos {

    public static void main(String[] args) {
        DescontoStrategy desconto = new DescontoClienteVip();
        Notificador notificador = new EmailNotificador();
        PedidoRepository pedidoRepository = new PedidoRepository();
        MeioDePagamento meioDePagamento = new PagamentoPix();
        
        Pedido pedido = new Pedido(100.0, desconto, meioDePagamento);
        ProcessadorDePedidos processador = new ProcessadorDePedidos(pedidoRepository, notificador);
        
        processador.processarPedido(pedido);
    }
}
