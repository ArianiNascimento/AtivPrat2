import Model.Cliente;
import DAO.ClienteDAO;
import Model.Destino;
import DAO.DestinoDAO;

public class Teste {

	public static void main(String[] args) {
		/*ClienteDAO clienteDAO = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Maria Gorete");
		cliente.setCpf("88410692449");
		cliente.setEmail("mariasena326@gmail.com");
		cliente.setSenha("24680");
		
		clienteDAO.cadastrar(cliente);*/
		
		for (Cliente c : ClienteDAO.getClientes()) {
			System.out.println("Nome: " + c.getNome());
			System.out.println("CPF: " + c.getCpf());
			System.out.println("E-mail: " + c.getEmail());
		}
		
		/*Cliente cliente1 = new Cliente();
		cliente1.setNome("Ademilson Nascimento");
		cliente1.setCpf("76534936453");
		cliente1.setEmail("ademilson958@gmail.com");
		cliente1.setSenha("09876");
		cliente1.setId_cliente(5);
		
		clienteDAO.atualizar(cliente1);
	
		clienteDAO.excluir(5); */
		
		/*
		 */
		
		DestinoDAO destinoDAO = new DestinoDAO();
		
		Destino destino = new Destino();
		destino.setId_destino(1);
		destino.setLocal_destino("São Paulo");
		
		destinoDAO.cadastrar(destino);
		
		
		for (Destino d : DestinoDAO.getDestinos()) {
			System.out.println("ID: " + d.getId_destino());
			System.out.println("Local de destino: " + d.getLocal_destino());
		}
		
		/*Destino destino = new Destino();
		
		destino.setId_destino(1);
		destino.setLocal_destino("Rio de Janeiro");
		
		destinoDAO.atualizar(destino);
		
		destinoDAO.excluir(1);*/

	}

}