package dominio.item;

public abstract class Item {
	private String nome;
	private String descricao;
	private Integer valor;
	
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
}

