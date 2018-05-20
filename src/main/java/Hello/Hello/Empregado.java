package Hello.Hello;

import java.util.Date;

public class Empregado extends Cliente {
	
	String PIS;
	String NumeroCTS;
	Date dataAdmissao;
	Profissao profissao;
	
	public Empregado() {

	}

	public void setPIS(String pis) {
		this.PIS = pis;
	}

	public void setNumeroCTS(String numeroCTS) {
		this.NumeroCTS = numeroCTS;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	public String toString() {
		return super.toString() + ", PIS: " + this.PIS + ", CTS: " + this.NumeroCTS + ", Admissao: " + this.dataAdmissao + ", Profissao: " + this.profissao.toString();
	}

	public void setDefaultValues() {

		super.setDefaultValues();

		this.PIS = "000.000.00-0";
		this.NumeroCTS = "00000-0";
		this.dataAdmissao = new Date();

		System.out.println("PASSOU PELO 'setDefaultValues()' DO EMPREGADO");
	}
}
