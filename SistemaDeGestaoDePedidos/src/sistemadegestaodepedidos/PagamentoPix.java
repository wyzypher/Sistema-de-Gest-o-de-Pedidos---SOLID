package sistemadegestaodepedidos;

public class PagamentoPix implements MeioDePagamento{

    public void processarPagamento (double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via Pix.");
    }
}
