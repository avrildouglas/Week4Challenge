package resApp;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UpdateExperience {

	private Connection conResume = null;
	private Statement stmtResume = null;
	private PreparedStatement pstmtResume = null;
	//private ResultSet rstExp = null;


	public void addExperience(ArrayList<String> listExp){
		
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement("Insert into experience(Experience) values(?)"); 
	   
			for (int k = 0; k < listExp.size()-1; k++){
			//	pstmtResume.setInt(1, 301);
				pstmtResume.setString(1, listExp.get(k).toString());
				pstmtResume.addBatch();
		        pstmtResume.executeBatch(); 
		      //  conResume.commit();
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
	
	public static String getExperience(String ApEmail){
		
		Connection conResume = null;
		PreparedStatement pstmtResume = null;
		ResultSet rstExp = null;
		
		String outputExp = "";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement("select * from education where Email = '"+ ApEmail +"'");
			
			rstExp = pstmtResume.executeQuery();
			
			while (rstExp.next()) {
				
			}
			
			outputExp += (rstExp.getString("Experience"));
			
			}catch  (SQLException e) {
					e.printStackTrace();
			}catch (ClassNotFoundException e){
					e.printStackTrace();
			}
			finally{
				try{
					rstExp.close();
					pstmtResume.close();
					conResume.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		return outputExp;
		}

		public void DeleteExperience(String ApEmail){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");
			pstmtResume = conResume.prepareStatement("DELETE FROM experience WHERE Email = '"+ ApEmail + "'"); 			
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

}