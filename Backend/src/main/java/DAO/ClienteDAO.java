package DAO;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;

	import Model.Cliente;

	public class ClienteDAO {
		
		private static final String USERNAME = "root";
		
		private static final String PASSWORD = "HotelC@lifornia2022";
		
		private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/ativprat";
		
		public static Connection createConnectionToMySQL() throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
			
			return connection; }
		
		public static void main(String[] args) throws Exception {
			
			Connection con = createConnectionToMySQL();
			
			if (con != null) {
				System.out.println("Conexão obtida com sucesso!" + con);
				
				con.close(); 
				
			}
		}

		public void cadastrar(Cliente cliente) {
			String sql = "INSERT INTO cliente (nome, cpf, email, senha)" + "VALUES (?, ?, ?, ?)";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try {
				conn = ClienteDAO.createConnectionToMySQL();
				
				pstm = conn.prepareStatement(sql);
				
				
				pstm.setString(1, cliente.getNome());
				pstm.setString(2, cliente.getCpf());
				pstm.setString(3, cliente.getEmail());
				pstm.setString(4, cliente.getSenha());
				
				pstm.execute();
			} 
			
			catch(Exception e) {
				e.printStackTrace();
			}
			
			finally {
				
				try {
					
					if (pstm != null) {
						pstm.close();
					}
					
						if (conn != null) {
							conn.close();
						}
				}
				
				catch (Exception e) {
					e.printStackTrace();
				}
			}

		}

	/*
	 */

	public static List<Cliente> getClientes() {
		
		String sql ="SELECT * FROM cliente";
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		
		try {
			conn = ClienteDAO.createConnectionToMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			rset = pstm.executeQuery();
			
			
			while (rset.next()) {
				
				Cliente cliente = new Cliente();
				
				cliente.setNome(rset.getString("nome"));
				cliente.setCpf(rset.getString("cpf"));
				cliente.setEmail(rset.getString("email"));
				cliente.setSenha(rset.getString("senha"));
				
				clientes.add(cliente);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
			try {
				
				if (rset != null) {
					rset.close();
				}
				
				if (pstm != null) {
					pstm.close();
				}
				
					if (conn != null) {
						conn.close();
					}
			}
			
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return clientes;
	}
		
	/*
	 */

	public void atualizar(Cliente cliente) {
		
		String sql = "UPDATE cliente SET nome = ?, cpf = ?, email = ?, senha = ?" + "WHERE id_cliente = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ClienteDAO.createConnectionToMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getCpf());
			pstm.setString(3, cliente.getEmail());
			pstm.setString(4, cliente.getSenha());
			pstm.setInt(5, cliente.getId_cliente());
			
			pstm.execute();
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
			try {
				
				if (pstm != null) {
					pstm.close();
				}
				
					if (conn != null) {
						conn.close();
					}
			}
			
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/*
	 */

	public void excluir(int id_cliente) {
		
		String sql = "DELETE FROM cliente WHERE id_cliente = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ClienteDAO.createConnectionToMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			
			pstm.setInt(1, id_cliente);
			
			pstm.execute();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
			try {
				
				if (pstm != null) {
					pstm.close();
				}
				
					if (conn != null) {
						conn.close();
					}
			}
			
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	}
