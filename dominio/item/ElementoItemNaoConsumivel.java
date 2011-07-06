package dominio.item;

import dominio.Item;
import dominio.Personagem;

public class ElementoItemNaoConsumivel extends ElementoItem {
	private ItemNaoConsumivel categoria;
	ElementoItemNaoConsumivel() {
		
	}
	
	public Item getItem() {
		return this.categoria;
	}
	
	public void setItem(Item item) {
		categoria = (ItemNaoConsumivel) item;
	}
	
	public boolean usar(Personagem pessoa) {
		//Script para usar item não-consumível
		return false;
	}
	
	public static ElementoItemNaoConsumivel specialize(ElementoItem item) {
		return (ElementoItemNaoConsumivel) item;
	}
}
