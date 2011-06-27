package dominio;

import java.util.List;
import java.util.Set;

import dominio.item.ElementoItem;

public class Inventario {
	private Integer limite;
	private Set<List<ElementoItem>> itens;
	
	public Integer getLimite() {
		return limite;
	}
	
	public Set<List<ElementoItem>> getItens() {
		return itens;
	}
	
	public void setLimite(Integer limite) {
		this.limite = limite;
	}
	
	public void setItens(Set<List<ElementoItem>> itens) {
		this.itens = itens;
	}
}

