package encapsulamento;

public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(3636, 17604);
		//conta.numero = 3636;
		conta.setNumero(3636);
		System.out.println(conta.getNumero());
	
	    Cliente paulo = new Cliente();
	    //conta.titular = Paulo;
	    paulo.setNome("Paulo Silveira");
	    
	    conta.setTitular(paulo);
	    
	    System.out.println(conta.getTitular().getNome());
	    
	    conta.getTitular().setProfissao("Desenvolvedor Java");
	    // agora em duas linhas:
	    Cliente titularDaConta = conta.getTitular();
	    titularDaConta.setProfissao("Programador");
	    
	    System.out.println(titularDaConta);
	    System.out.println(paulo);
	    System.out.println(conta.getTitular());
	    
	    
	
	}
}
