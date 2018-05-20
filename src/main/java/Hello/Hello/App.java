package Hello.Hello;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		// criando uma lista de Profissoes
		Profissao p1 = new Profissao(1, "Analista de Sistemas", "Este profisional é responsável por analisar e projetar...");
		Profissao p2 = new Profissao(2, "Analista de QA", "Este profisional é responsável por elaborar planos de teste...");
		Profissao p3 = new Profissao(3, "Analista de Banco de Dados", "Este profisional é responsável por implementar funcionalidades...");

		// criando uma lista de Enderecos
		Endereco e1 = new Endereco();
		e1.setId(1);
		e1.setDescricao("RUA DAS ALGAROBAS");
		e1.setCompl("APT 111");
		e1.setCidade("SAO PAULO");
		e1.setUf("SP");

		Endereco e2 = new Endereco();
		e2.setId(2);
		e2.setDescricao("RUA DAS MANGUEIRAS");
		e2.setCompl("APT 111");
		e2.setCidade("RECIFE");
		e2.setUf("PE");

		Endereco e3 = new Endereco();
		e3.setId(3);
		e3.setDescricao("AV DO CONTORNO");
		e3.setCompl("APT 111");
		e3.setCidade("BELO HORIZONTE");
		e3.setUf("MG");

		// criando uma lista de Clientes
		Cliente c1 = new Cliente();
		c1.setDefaultValues();

		Cliente c2 = new Cliente(2, "JOHN RAMBO", 55, "(11)9999 8888", e1);

		Cliente c3 = new Cliente(3, "JOHN DEEP", 48, "(11)9999 8888", e2);

		Cliente c4 = new Cliente(4, "ELTON JOHN", 58, "(21)7777 6666", e3);


		Empregado emmpregadoAnonimo = new Empregado();
		emmpregadoAnonimo.setDefaultValues();
		emmpregadoAnonimo.setProfissao(p1);
		emmpregadoAnonimo.setEndereco(e3);

		System.out.println();
		System.out.println("----------------------------------");
		System.out.println(c1.toString());
		System.out.println("----------------------------------");
		System.out.println(c2.toString());
		System.out.println("----------------------------------");
		System.out.println(c3.toString());
		System.out.println("----------------------------------");
		System.out.println(c4.toString());
		System.out.println("----------------------------------");
		System.out.println(emmpregadoAnonimo.toString());
		System.out.println("----------------------------------");
    }
}
