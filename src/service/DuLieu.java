package service;
import java.util.Properties;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.Statement;

		public class DuLieu {
			
			public static java.sql.Connection conn = null;
			public static java.sql.Statement statement = null;
			public DuLieu() {
				try {
					String strConn = "jdbc:mysql://localhost/DoiBongHoangGia";
					Properties pro = new Properties();
					pro.put("user", "root");
					pro.put("password", "letriduc123");
					Driver driver = new org.gjt.mm.mysql.Driver();
					conn = driver.connect(strConn, pro);	
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			
		}

}