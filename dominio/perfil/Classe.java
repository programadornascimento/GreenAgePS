package dominio.perfil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dominio.Selecionavel;
import dominio.item.Equipamento;

public class Classe extends Selecionavel {
	private String nome;
	private Integer nivelMinimo;
	
	private Set<Equipamento> equipamentos;
	private Set<Habilidade> habilidades;
	private Classe antecessor;
	private Classe sucessor;
	
	private static Map<Integer, Classe> all; //By ID
	
	public Classe() {
		register(this);
	}
	
	public String getNome() {
		return nome;
	}
	
	public Integer getNivelMinimo() {
		return nivelMinimo;
	}
	
	public Set<Equipamento> getEquipamentos() {
		return equipamentos;
	}
	
	public Set<Habilidade> getHabilidades() {
		return habilidades;
	}
	
	public Classe getAntecessor() {
		return antecessor;
	}
	
	public Classe getSucessor() {
		return sucessor;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNivelMinimo(Integer nivelMinimo) {
		this.nivelMinimo = nivelMinimo;
	}
	
	public void setEquipamentos(Set<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}
	
	public void setHabilidades(Set<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}
	
	public void setAntecessor(Classe antecessor) {
		this.antecessor = antecessor;
	}
	
	public void setSucessor(Classe sucessor) {
		this.sucessor = sucessor;
	}
	
	///////////////////////////////
	//Métodos de coleção estática//
	///////////////////////////////
	
	public static List<Classe> getAll() {
		tryAndCreate();
		List<Classe> list = new ArrayList<Classe>();
		Set<Integer> indexes = all.keySet();
		for(Integer index : indexes) {
			list.add(all.get(index));
		}
		return list;
	}
	
	public static boolean exists(Classe obj) {
		tryAndCreate();
		return (all.containsKey(obj.id));
	}
	
	public static boolean exists(Integer id) {
		tryAndCreate();
		return all.containsKey(id);
	}
	
	public static Classe get(Integer id) {
		Classe returnValue = null;
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
	
	public static void register(Classe obj) {
		tryAndCreate();
		all.put(obj.id, obj);
	}
	
	public static void unregister(Classe obj) {
		tryAndCreate();
		all.remove(obj.id);
	}
	
	private static void tryAndCreate() {
		if(all == null) {
			all = new HashMap<Integer, Classe>();
		}
	}
}
