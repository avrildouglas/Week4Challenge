package resApp;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UpdateSkill {


	private Connection conResume = null;
	private Statement stmtResume = null;
	private PreparedStatement pstmtResume = null;
	//private ResultSet rstSki = null;


	public void addSkill(ArrayList<String> listSkills){
		
	
		try{
			 	Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement("Insert into skills (Skill) values(?)"); 
			//System.out.print(pstmtResume);
   
			for (int k = 0; k < listSkills.size()-1; k++){
			//	pstmtResume.setInt(1, 401);
				pstmtResume.setString(1, listSkills.get(k).toString());
				pstmtResume.addBatch();
		        pstmtResume.executeBatch(); 
			}  
			}catch  (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e){
				e.printStackTrace();
			}finally{
				try{
					pstmtResume.close();
					conResume.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
				}
		}
	
	public static String getSkill(String ApEmail){
		
		Connection conResume = null;
		PreparedStatement pstmtResume = null;
		ResultSet rstSki = null;
		
		String outputSki = "";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement("select * from skills where Email = '"+ ApEmail +"'");
			
			rstSki = pstmtResume.executeQuery();
			
			while (rstSki.next()) {
				
			}
			
			outputSki += (rstSki.getString("Skills"));
			
			}catch  (SQLException e) {
					e.printStackTrace();
			}catch (ClassNotFoundException e){
					e.printStackTrace();
			}
			finally{
				try{
					rstSki.close();
					pstmtResume.close();
					conResume.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		return outputSki;
		}
	

		public void DeleteSkill(String ApEmail){
		try{
			// 	Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement("DELETE FROM skills WHERE Email = '"+ ApEmail + "'"); 			
			}catch  (SQLException e) {
			
			}finally{
				try{
					pstmtResume.close();
					conResume.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
				}
   		}
}