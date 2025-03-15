package sistemadegestaodepedidos;

public class PagamentoCartao implements MeioDePagamento{

    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via Cartão de Crédito.");
    }
}
