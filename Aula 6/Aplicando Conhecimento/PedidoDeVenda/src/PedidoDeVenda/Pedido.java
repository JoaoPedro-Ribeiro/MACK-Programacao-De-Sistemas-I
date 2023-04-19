package PedidoDeVenda;

public class Pedido {
  int numero;
  Produto item;
  int quantidade;
  double valor;

  Pedido (int numero, Produto item, int quantidade) {
    this.numero = numero;
    this.item = item;
    this.quantidade = quantidade;
  }

  public void calculaPedido(){
    this.valor = this.item.preco * this.quantidade;
  }

  public String toString(){
    return "Número do Pedido: " + this.numero + "\nCódigo do Produto: " + this.item.codigo + "\nDescrição: " + this.item.descricao + "\nPreço do Produto: " + this.item.preco + "\nQuantidade: " + this.quantidade + "\nValor total do pedido: " + this.valor;
  }
}
