package sistemadegestaodepedidos;

public class DescontoClienteComum implements DescontoStrategy {

    public double aplicarDesconto(double valor) {
        return valor * 0.95; // 5% de desconto
    }
}
