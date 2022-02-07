package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Model.Destino;

public class DestinoDAO {
	
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

	public void cadastrar(Destino destino) {
		String sql = "INSERT INTO destino (id_destino, local_destino)" + "VALUES (?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = DestinoDAO.createConnectionToMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			
			pstm.setInt(1, destino.getId_destino());
			pstm.setString(2, destino.getLocal_destino());
			
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

public static List<Destino> getDestinos() {
	
	String sql ="SELECT * FROM destino";
	
	List<Destino> destinos = new ArrayList<Destino>();
	
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rset = null;
	
	try {
		conn = DestinoDAO.createConnectionToMySQL();
		
		pstm = conn.prepareStatement(sql);
		
		rset = pstm.executeQuery();
		
		
		while (rset.next()) {
			
			Destino destino = new Destino();
			
			destino.setId_destino(rset.getInt("id_destino"));
			destino.setLocal_destino(rset.getString("local_destino"));
			
			destinos.add(destino);
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
	return destinos;
}
	
/*
 */

public void atualizar(Destino destino) {
	
	String sql = "UPDATE destino SET local_destino = ?" + "WHERE id_destino = ?";
	
	Connection conn = null;
	PreparedStatement pstm = null;
	
	try {
		conn = DestinoDAO.createConnectionToMySQL();
		
		pstm = conn.prepareStatement(sql);
		
		
		pstm.setString(1, destino.getLocal_destino());
		pstm.setInt(2, destino.getId_destino());
		
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

public void excluir(int id_destino) {
	
	String sql = "DELETE FROM destino WHERE id_destino = ?";
	
	Connection conn = null;
	PreparedStatement pstm = null;
	
	try {
		conn = DestinoDAO.createConnectionToMySQL();
		
		pstm = conn.prepareStatement(sql);
		
		
		pstm.setInt(1, id_destino);
		
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


