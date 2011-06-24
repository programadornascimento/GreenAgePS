package personagem.item;

import personagem.Personagem;

public class ElementoEquipamento extends ElementoItem {
	private Equipamento categoria;
	
	public Item getItem() {
		return this.categoria;
	}
	
	public void setItem(Item item) {
		categoria = (Equipamento) item;
	}
	
	public boolean usar(Personagem pessoa) {
		//Script para usar equipamento
		return true;
	}
}
