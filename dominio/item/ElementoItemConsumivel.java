package dominio.item;

import dominio.Item;
import dominio.Personagem;

public class ElementoItemConsumivel extends ElementoItem {
	private ItemConsumivel categoria;
	ElementoItemConsumivel() {
		
	}
	
	public Item getItem() {
		return this.categoria;
	}
	
	public void setItem(Item item) {
		categoria = (ItemConsumivel) item;
	}
	
	public boolean usar(Personagem pessoa) {
		//Script para usar item consumível
		return true;
	}
	
	public static ElementoItemConsumivel specialize(ElementoItem item) {
		return (ElementoItemConsumivel) item;
	}
}
