package Hello.Hello;

public class Endereco {
	
	Integer id;
	String descricao;
	String compl;
	String cidade;
	String uf;

	public Endereco() {
		// the default constructor
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setCompl(String compl) {
		this.compl = compl;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String toString() {
		return "Endereco ID: " + this.id + ", DESCRICAO: " + this.descricao + ", COMPLEMENTO: " + this.compl + ", CIDADE: " + this.cidade + ", UF:" + this.uf;
	}
}
