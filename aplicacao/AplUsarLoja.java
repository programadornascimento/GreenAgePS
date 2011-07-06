package aplicacao;

import java.util.List;

import dominio.Item;
import dominio.Personagem;
import dominio.item.ElementoItem;
import dominio.npc.Loja;

public class AplUsarLoja {
	public boolean comprarItem(Personagem p, Loja l, Item i) {
		return false;
	}
	
	public boolean venderItem(Personagem p, Loja l, ElementoItem ei) {
		return false;
	}
	
	public List<ElementoItem> listarEstoque(Loja l) {
		return null;
	}
}
