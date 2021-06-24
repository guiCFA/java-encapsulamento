
public class testaBanco {
	public static void main(String[] args) {
		
		Cliente guilherme = new Cliente();
		guilherme.setNome("guilherme");
		guilherme.setCpf("123.123.123-03");
		guilherme.setProfissao("programador");
		
		Banco contaGui = new Banco();
		contaGui.deposita(100);
		
		// associando banco com cliente
		
		contaGui.setTitular(guilherme);
	
		
		System.out.println(contaGui.getTitular().getNome());
		System.out.println(contaGui.getSaldo());
		
		
		//testando get e set
		
		contaGui.setNumero(6644);
		System.out.println(contaGui.getNumero());
		
		contaGui.setNumero(3232);
		System.out.println(contaGui.getNumero());
		
	}
}
