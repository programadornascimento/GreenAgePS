package aplicacao;

import java.util.List;

import dominio.Personagem;
import dominio.item.ElementoEquipamento;
import dominio.item.ElementoItem;
import dominio.item.ElementoItemConsumivel;
import dominio.item.ElementoItemNaoConsumivel;

public class AplManusearPersonagem {
	public List<ElementoItem> listarInventario(Personagem p) {
		return null;
	}
	
	public boolean usarItem(Personagem p, ElementoItemNaoConsumivel i) {
		return false;
	}
	
	public boolean usarItem(Personagem p, ElementoItemConsumivel i) {
		return true;
	}
	
	public boolean usarItem(Personagem p, ElementoEquipamento i) {
		return true;
	}
}
