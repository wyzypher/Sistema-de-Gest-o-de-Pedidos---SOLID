package sistemadegestaodepedidos;

public class Pedido {

    private double valor;
    private DescontoStrategy descontoStrategy;
    private MeioDePagamento meioDePagamento;

    public Pedido(double valor, DescontoStrategy descontoStrategy, MeioDePagamento meioDePagamento) {
        this.valor = valor;
        this.descontoStrategy = descontoStrategy;
        this.meioDePagamento = meioDePagamento;
    }

    public double calcularValorFinal() {
        return descontoStrategy.aplicarDesconto(valor);
    }

    public void processarPagamento() {
        meioDePagamento.processarPagamento(calcularValorFinal());
    }
}
