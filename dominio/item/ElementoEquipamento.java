package dominio.item;

import dominio.Item;
import dominio.Personagem;

public class ElementoEquipamento extends ElementoItem {
	private Equipamento categoria;
	ElementoEquipamento() {
		
	}
	
	public Item getItem() {
		return this.categoria;
	}
	
	public void setItem(Item item) {
		categoria = (Equipamento) item;
	}
	
	public boolean usar(Personagem pessoa) {
		switch(categoria.getTipoEquipamento()) {
		case Escudo:
			pessoa.setEquipamentoDefesa(this);
			break;
		default:
			pessoa.setEquipamentoAtaque(this);
		}
		return true;
	}
	
	public static ElementoEquipamento specialize(ElementoItem item) {
		return (ElementoEquipamento) item;
	}
}
