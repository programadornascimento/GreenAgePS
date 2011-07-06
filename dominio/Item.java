package dominio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dominio.item.ElementoItem;

public abstract class Item extends Selecionavel {
	protected String nome;
	protected String descricao;
	protected Integer valor;
	private static Map<Integer, Item> all; //By ID
	
	protected Item(String nome, String descricao, Integer valor, Integer type) {
		super(type);
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public Integer getValor() {
		return valor;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	public abstract ElementoItem criar();
	
	///////////////////////////////
	//Métodos de coleção estática//
	///////////////////////////////
	
	public static List<Item> getAll() {
		tryAndCreate();
		List<Item> list = new ArrayList<Item>();
		Set<Integer> indexes = all.keySet();
		for(Integer index : indexes) {
			list.add(all.get(index));
		}
		return list;
	}
	
	public static boolean exists(Item obj) {
		tryAndCreate();
		return (all.containsKey(obj.id));
	}
	
	public static boolean exists(Integer id) {
		tryAndCreate();
		return all.containsKey(id);
	}
	
	public static Item get(Integer id) {
		Item returnValue = null;
		tryAndCreate();
		if(exists(id)) {
			returnValue = all.get(id);
		}
		return returnValue;
	}
	
	public static boolean isEmpty() {
		tryAndCreate();
		return all.isEmpty();
	}
	
	public static void register(Item obj) {
		tryAndCreate();
		all.put(obj.id, obj);
	}
	
	public static void unregister(Item obj) {
		tryAndCreate();
		all.remove(obj.id);
	}
	
	private static void tryAndCreate() {
		if(all == null) {
			all = new HashMap<Integer, Item>();
		}
	}
}

