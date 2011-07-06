package dominio.perfil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dominio.Atributos;
import dominio.Selecionavel;

public class Habilidade extends Selecionavel {
	private String nome;
	private Integer duracao;
	private TipoHabilidade tipo;
	private Atributos modificadorDeAtributos;
	private Integer nivelMinimo;
	
	private static Map<Integer, Habilidade> all; //By ID
	
	public String getNome() {
		return nome;
	}
	
	public Integer getDuracao() {
		return duracao;
	}
	
	public TipoHabilidade getTipo() {
		return tipo;
	}
	
	public Atributos getModificadorDeAtributos() {
		return modificadorDeAtributos;
	}
	
	public Integer getNivelMinimo() {
		return nivelMinimo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}
	
	public void setTipo(TipoHabilidade tipo) {
		this.tipo = tipo;
	}
	
	public void setModificadorDeAtributos(Atributos modificadorDeAtributos) {
		this.modificadorDeAtributos = modificadorDeAtributos;
	}

	public void setNivelMinimo(Integer nivelMinimo) {
		this.nivelMinimo = nivelMinimo;
	}
	
	///////////////////////////////
	//Métodos de coleção estática//
	///////////////////////////////
	
	public static List<Habilidade> getAll() {
		tryAndCreate();
		List<Habilidade> list = new ArrayList<Habilidade>();
		Set<Integer> indexes = all.keySet();
		for(Integer index : indexes) {
			list.add(all.get(index));
		}
		return list;
	}
	
	public static boolean exists(Habilidade obj) {
		tryAndCreate();
		return (all.containsKey(obj.id));
	}
	
	public static boolean exists(Integer id) {
		tryAndCreate();
		return all.containsKey(id);
	}
	
	public static Habilidade get(Integer id) {
		Habilidade returnValue = null;
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
	
	public static void register(Habilidade obj) {
		tryAndCreate();
		all.put(obj.id, obj);
	}
	
	public static void unregister(Habilidade obj) {
		tryAndCreate();
		all.remove(obj.id);
	}
	
	private static void tryAndCreate() {
		if(all == null) {
			all = new HashMap<Integer, Habilidade>();
		}
	}
}
