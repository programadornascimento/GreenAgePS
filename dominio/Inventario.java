package dominio;

import java.util.ArrayList;
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
	
	public boolean addItem(ElementoItem item) {
		boolean returnValue = false;
		List<ElementoItem> currentGroup;
		if(this.limite > this.itemCount()) {
			currentGroup = itemGroup(item.getItem());
			if(currentGroup == null) {
				currentGroup = new ArrayList<ElementoItem>();
				this.itens.add(currentGroup);
			}
			currentGroup.add(item);
			returnValue = true;
		}
		return returnValue;
	}
	
	public void removeItem(ElementoItem item) {
		List<ElementoItem> currentGroup;
		if(this.itemCount() > 0) {
			currentGroup = itemGroup(item.getItem());
			if(currentGroup != null) {
				currentGroup.remove(item);
				if(currentGroup.isEmpty()) {
					this.itens.remove(currentGroup);
				}
			}
		}
	}
	
	private List<ElementoItem> itemGroup(Item itemCategory) {
		List<ElementoItem> returnValue = null;
		for(List<ElementoItem> group : this.itens) {
			if(!group.isEmpty()) {
				if(group.get(0).getItem().equals(itemCategory)) {
					returnValue = group;
					break;
				}
			} else {
				this.itens.remove(group);
			}
		}
		return returnValue;
	}
	
	public Integer itemCount() {
		int size = 0;
		for(List<ElementoItem> group : this.itens) {
			size += group.size();
		}
		return size;
	}
	
	public Integer categoryCount(Item itemCategory) {
		List<ElementoItem> group = this.itemGroup(itemCategory);
		int size = 0;
		if(group != null) {
			size = group.size();
		}
		return size;
	}
}

