package dominio.perfil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dominio.Aparencia;
import dominio.Atributos;
import dominio.Selecionavel;

public class Etnia extends Selecionavel {
	private String nome;
	private Atributos modificadorDeAtributos;
	private Aparencia aparencia;
	
	private static Map<Integer, Etnia> all; //By ID
	
	public String getNome() {
		return nome;
	}
	
	public Atributos getModificadorDeAtributos() {
		return modificadorDeAtributos;
	}
	
	public Aparencia getAparencia() {
		return aparencia;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setModificadorDeAtributos(Atributos modificadorDeAtributos) {
		this.modificadorDeAtributos = modificadorDeAtributos;
	}
	
	public void setAparencia(Aparencia aparencia) {
		this.aparencia = aparencia;
	}
	
    ///////////////////////////////
	//Métodos de coleção estática//
	///////////////////////////////
	
	public static List<Etnia> getAll() {
		tryAndCreate();
		List<Etnia> list = new ArrayList<Etnia>();
		Set<Integer> indexes = all.keySet();
		for(Integer index : indexes) {
			list.add(all.get(index));
		}
		return list;
	}
	
	public static boolean exists(Etnia obj) {
		tryAndCreate();
		return (all.containsKey(obj.id));
	}
	
	public static boolean exists(Integer id) {
		tryAndCreate();
		return all.containsKey(id);
	}
	
	public static Etnia get(Integer id) {
		Etnia returnValue = null;
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
	
	public static void register(Etnia obj) {
		tryAndCreate();
		all.put(obj.id, obj);
	}
	
	public static void unregister(Etnia obj) {
		tryAndCreate();
		all.remove(obj.id);
	}
	
	private static void tryAndCreate() {
		if(all == null) {
			all = new HashMap<Integer, Etnia>();
		}
	}
}

