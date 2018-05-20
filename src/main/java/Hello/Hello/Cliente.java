package Hello.Hello;

public class Cliente {
	
	Integer id;
	String nome;
	Integer idade;
	String telefone;
	Endereco endereco;
	
	public Cliente() {
	}

	public Cliente(Integer id, String nome, Integer idade, String telefone, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String toString() {

		String ret = "Cliente ID: " + this.id + ", NOME: " + this.nome + ", IDADE: " + this.idade + ", TELEFONE: " + this.telefone;

		if (this.endereco != null) {
			ret +=  ", ENDERECO: " + this.endereco.toString();
		}

		return ret;
	}

	public Integer getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public Integer getIdade() {
		return this.idade;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setDefaultValues() {
		this.id = 0;
		this.nome = "CLIENTE ANONIMO";
		this.idade = 0;
		this.telefone = "(00)0000 0000";
		this.endereco = null;
		System.out.println("PASSOU PELO 'setDefaultValues()' DO CLIENTE");
	}
}
