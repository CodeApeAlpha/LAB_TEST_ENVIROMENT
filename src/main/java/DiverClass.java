import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DiverClass {
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:8080/";
        Connection myConn = null;
        try
        {
            //Class.forName("com.mysql.jdbc.Driver");
            myConn = DriverManager.getConnection(url, "", "");
            if(myConn != null)
            {
                JOptionPane.showMessageDialog(null, "Connected to Local Server",
                        "JDBC Connection Status", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
