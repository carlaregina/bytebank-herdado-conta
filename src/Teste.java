
public class Teste {

	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca(222, 23645);
		Cliente joao = new Cliente();
		joao.setNome("joao");
		cp.setTitular(joao);
		
		System.out.println(joao.getNome());

		
		

	}

}
