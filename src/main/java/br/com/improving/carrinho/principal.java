package br.com.improving.carrinho;

import java.math.BigDecimal;

public class principal {

	public static void main(String[] args) {
		Produto p1 = new Produto(2L, "Produto 1");
		System.out.println(p1);

		Produto p2 = new Produto(3L, "Produto 2");
		System.out.println(p1);

		Item i1 = new Item(p1, BigDecimal.valueOf(10.00), 2);
		System.out.println(i1);

		CarrinhoCompras carrinho = new CarrinhoCompras();

		Item i2 = new Item();

		 carrinho.adicionarItem(p1, BigDecimal.valueOf(10.00), 3);

		 carrinho.adicionarItem(p2, BigDecimal.valueOf(14.00), 2);

		 carrinho.removerItem(1);

		System.out.println(carrinho.getValorTotal());

		System.out.println("-----------------------------------------------------------------");

		CarrinhoComprasFactory carrinhoFactory = new CarrinhoComprasFactory();

		carrinhoFactory.criar("Marcus");
		carrinhoFactory.criar("Marcus");

		System.out.println(carrinhoFactory.getValorTicketMedio());

	}
}
