package dominio.item;

import dominio.Item;

public class ItemNaoConsumivel extends Item {
	public ItemNaoConsumivel(String nome, String descricao, Integer valor) {
		super(nome, descricao, valor, 3);
		super.register(this);
	}
		
	public ElementoItem criar() {
		//Script para criar elemento de item não-consumível
		return null;
	}
}

