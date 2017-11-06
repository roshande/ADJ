/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketDemo;

/**
 *
 * @author student
 */
import java.io.*;  
import java.net.*;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcServer {  
    // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   //jdbc:vender://@hostname:port/db_name
   static final String DB_URL = "jdbc:mysql://localhost/Student_db"; 
   //for oracle => jdbc:oracle:thin:@hostname:port Number:databaseName

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "";
   
    static boolean checkCredentials(String username,String password) throws ClassNotFoundException, SQLException
    {
        boolean authentication = true;
        System.out.println("checking credentials");
        
        //STEP 2: Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");

        //STEP 3: Open a connection
        System.out.println("Connecting to database...");
        Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);

        //STEP 4: Execute a query
        System.out.println("Creating statement...");
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM credentials WHERE username="+username+",password="+password;
  
        ResultSet rs = stmt.executeQuery(sql);

        if(rs == null)
            authentication = false;
        if(rs != null)
            rs.close();
        stmt.close();
        conn.close();
        return authentication;
    }
    
    static boolean create()
    {
        
    }
    public static void main(String[] args){  
        try{
            ServerSocket ss=new ServerSocket(6666);  
            Socket s = ss.accept();//establishes connection   
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            //read first packet
            String packet = din.readUTF();
            System.out.println("message= "+packet);
            String[] credentials = packet.split(";:");
            if( credentials[0].equals("Username") && credentials[2].equals("Password") && checkCredentials(credentials[1], credentials[3]))
            {
                dout.writeUTF("Authenticated");
            }
            else 
            {
                dout.writeUTF("NotAuthenticated");
                din.close();
                ss.close();
                return;
            }
            do{
                packet=(String)din.readUTF();
                System.out.println("Message= "+packet);
                if(packet.startsWith("Create"))
                {
                    
                }
                else if(packet.startsWith("Retrieve"))
                {
                    
                }
                else if(packet.startsWith("Update"))
                {
                    
                }
                else if(packet.startsWith("Delete"))
                {
                    
                }
                else if(packet.startsWith("Exit"))
                    break;
                else{
                    dout.writeUTF("Error");
                }
            }while(true);
            din.close();
            ss.close();
        }
        catch(IOException | ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
    }  
}  
