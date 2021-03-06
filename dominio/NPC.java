package dominio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class NPC extends Entidade {
	protected String nome;
	protected Aparencia aparencia;
	
	private static Map<Integer, NPC> all; //By ID
	
	protected NPC() {}
	
	protected NPC(Integer type) {
		super(type);
	}
	
	public mapa.Mapa getMapa() {
		return mapa;
	}
	
	public EntidadeEstado getEstado() {
		return estado;
	}
	
	public Ponto2D getPosicao() {
		return posicao;
	}
	
	public String getNome() {
		return nome;
	}

	public Aparencia getAparencia() {
		return aparencia;
	}

	public void setMapa(mapa.Mapa mapa) {
		this.mapa = mapa;
	}
	
	public void setEstado(EntidadeEstado estado) {
		this.estado = estado;
	}
	
	public void setPosicao(Ponto2D posicao) {
		this.posicao = posicao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAparencia(Aparencia aparencia) {
		this.aparencia = aparencia;
	}
	
	public abstract boolean iniciar(Personagem pessoa);
	
	///////////////////////////////
	//Métodos de coleção estática//
	///////////////////////////////
	
	public static List<NPC> getAll() {
		tryAndCreate();
		List<NPC> list = new ArrayList<NPC>();
		Set<Integer> indexes = all.keySet();
		for(Integer index : indexes) {
			list.add(all.get(index));
		}
		return list;
	}
	
	public static boolean exists(NPC obj) {
		tryAndCreate();
		return (all.containsKey(obj.id));
	}
	
	public static boolean exists(Integer id) {
		tryAndCreate();
		return all.containsKey(id);
	}
	
	public static NPC get(Integer id) {
		NPC returnValue = null;
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
	
	public static void register(NPC obj) {
		tryAndCreate();
		all.put(obj.id, obj);
	}
	
	public static void unregister(NPC obj) {
		tryAndCreate();
		all.remove(obj.id);
	}
	
	private static void tryAndCreate() {
		if(all == null) {
			all = new HashMap<Integer, NPC>();
		}
	}
}

