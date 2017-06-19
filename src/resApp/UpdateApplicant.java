package resApp;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateApplicant {

	private Connection conResume = null;
	//private Statement stmtResume = null;
	private PreparedStatement pstmtResume = null;
	private PreparedStatement pstmtEd = null;
	private PreparedStatement pstmtEx = null;
	private PreparedStatement pstmtSk = null;
	private ResultSet rstApp = null;
	private ResultSet rstEdApp = null;
	private ResultSet rstExApp = null;
	private ResultSet rstSkApp = null;
//	String EdApId, ExApId, SkApId;
	
	public void AddApplicant(String appfName, String applName, String appeMail){
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement("Insert into applicant (FirstName,LastName, Email) values(?,?,?)"); 
		
			//pstmtResume.setInt(1,10); 
			
			pstmtResume.setString(1,appfName);
			pstmtResume.setString(2,applName);
			pstmtResume.setString(3,appeMail);
			pstmtResume.executeUpdate();
			
/**			pstmtEd = conResume.prepareStatement("Insert into appedu (ApplId) values (501)");
				//	+ "//(select ApplId from applicant where FirstName = '"+ appfName +"' and LastName = '"+ applName +"'" );
//			rstEdApp = pstmtEd.executeQuery();
			
			while (rstEdApp.next()) {
				EdApId = rstEdApp.getString("ApplId");
				System.out.println(EdApId);	
			}

			pstmtEx = conResume.prepareStatement("Insert into appexp (select ApplId from applicant where FirstName = '"+ appfName +"' and LastName = '"+ applName +"'" );
			rstExApp = pstmtEx.executeQuery();
			
			while (rstExApp.next()) {
				ExApId = rstExApp.getString("ApplId");
			}
			
			pstmtSk = conResume.prepareStatement("Insert into appski (select ApplId from applicant where FirstName = '"+ appfName +"' and LastName = '"+ applName +"'" ); 
			rstSkApp = pstmtSk.executeQuery();
			while (rstSkApp.next()) {
				ExApId = rstSkApp.getString("ApplId");
			}

			System.out.println(EdApId);*/
			}catch  (SQLException e) {
					e.printStackTrace();
			}catch  (ClassNotFoundException e) {
				e.printStackTrace();
			}
		finally{
			try{		
				pstmtResume.close();
				conResume.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
			}
    	}
	
	public static String GetApplicant(String ApEmail){
		Connection conResume = null;
		PreparedStatement pstmtResume = null;
		ResultSet rstApp = null;
		
		String output = "";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement("select * from applicant where Email = '"+ ApEmail +"'"); 
			
			rstApp = pstmtResume.executeQuery();
			
			while (rstApp.next()) {	
			//pstmtResume.setInt(1,10);
			output += (rstApp.getString("FirstName") + rstApp.getString("LastName"));
			output += (rstApp.getString("Email"));
			}
						
			}catch  (SQLException e) {
					e.printStackTrace();
			}catch  (ClassNotFoundException e) {
				e.printStackTrace();
			}
		finally{
			try{	
				rstApp.close();
				pstmtResume.close();
				conResume.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
			}
		return output;
    	}
	

		public void DeleteApplicant(String ApEmail){
		try{
				Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement("DELETE FROM applicant WHERE Email = '"+ ApEmail + "'"); 
			System.out.println(pstmtResume);			
			}catch  (SQLException e) {
				e.printStackTrace();
			}catch  (ClassNotFoundException e) {
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
