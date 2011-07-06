package dominio;

public class Atributos {
	private Integer exp;
	private Integer maxHp;
	private Integer hp;
	private Integer maxMp;
	private Integer mp;
	private Integer forca;
	private Integer inteligencia;
	private Integer dextreza;
	private Integer constituicao;
	
	public Atributos(Integer exp, Integer maxHp, Integer hp, Integer maxMp,
			Integer mp, Integer forca, Integer inteligencia, Integer dextreza,
			Integer constituicao) {
		this.exp = exp;
		this.maxHp = maxHp;
		this.hp = hp;
		this.maxMp = maxMp;
		this.mp = mp;
		this.forca = forca;
		this.inteligencia = inteligencia;
		this.dextreza = dextreza;
		this.constituicao = constituicao;
	}

	public Integer getExp() {
		return exp;
	}
	
	public Integer getMaxHp() {
		return maxHp;
	}
	
	public Integer getHp() {
		return hp;
	}
	
	public Integer getMaxMp() {
		return maxMp;
	}
	
	public Integer getMp() {
		return mp;
	}
	
	public Integer getForca() {
		return forca;
	}
	
	public Integer getInteligencia() {
		return inteligencia;
	}
	
	public Integer getDextreza() {
		return dextreza;
	}
	
	public Integer getConstituicao() {
		return constituicao;
	}
	
	public void setExp(Integer exp) {
		this.exp = exp;
	}
	
	public void setMaxHp(Integer maxHp) {
		this.maxHp = maxHp;
	}
	
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	
	public void setMaxMp(Integer maxMp) {
		this.maxMp = maxMp;
	}
	
	public void setMp(Integer mp) {
		this.mp = mp;
	}
	
	public void setForca(Integer forca) {
		this.forca = forca;
	}
	
	public void setInteligencia(Integer inteligencia) {
		this.inteligencia = inteligencia;
	}
	
	public void setDextreza(Integer dextreza) {
		this.dextreza = dextreza;
	}
	
	public void setConstituicao(Integer constituicao) {
		this.constituicao = constituicao;
	}
}

