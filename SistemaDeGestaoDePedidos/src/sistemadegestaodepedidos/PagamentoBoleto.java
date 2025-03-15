package sistemadegestaodepedidos;

public class PagamentoBoleto implements MeioDePagamento {

    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via Boleto Bancário.");
    }
}
