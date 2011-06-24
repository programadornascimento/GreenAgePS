package dominio.item;

import dominio.Personagem;

public class ElementoItemConsumivel extends ElementoItem {
	private ItemConsumivel categoria;
	
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
}
