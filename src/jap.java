/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;


/**
 *
 * @author manoj
 */
public class jap {

  //To change body of generated methods, choose Tools | Templates.
    
     Statement st;
     ResultSet rs;
     Connection con;
  
    public  jap()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex)
        {
           System.out.println("error"+ex);
        }
        try
        {
            con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","manoj","manoj");
            st=con.createStatement();
            System.out.println("success");
        }
        catch(SQLException e)
        {
            System.out.println("error"+e);
        }
    }
    

      public static void main(String args[])
    {
        jap j=new jap();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BMTC().setVisible(true);
            }
        });
        
    }
  

  
   
    
}
