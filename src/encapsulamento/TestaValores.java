package encapsulamento;

public class TestaValores {
	
	public static void main(String[] args) {
		  Conta conta = new Conta(3636, 17604);
		  
		  conta.deposita(200.0);
		  
		  System.out.println(conta.getSaldo());
		  
		  conta.setAgencia(1232123);
		  
		  System.out.println(conta.getAgencia());
		  
		  System.out.println("o total de contas é : " + Conta.getTotal());
	}

}
