package sistemadegestaodepedidos;

public class DescontoClienteVip implements DescontoStrategy {

    public double aplicarDesconto(double valor) {
        return valor * 0.90; // 10% de desconto
    }
}
