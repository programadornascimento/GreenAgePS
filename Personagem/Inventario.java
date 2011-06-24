package Personagem;

import java.util.List;
import java.util.Set;

public class Inventario {
	private Integer limite;
	private Set<List<Item>> itens;
	
	public Integer getLimite() {
		return limite;
	}
	
	public Set<List<Item>> getItens() {
		return itens;
	}
	
	public void setLimite(Integer limite) {
		this.limite = limite;
	}
	
	public void setItens(Set<List<Item>> itens) {
		this.itens = itens;
	}
}
