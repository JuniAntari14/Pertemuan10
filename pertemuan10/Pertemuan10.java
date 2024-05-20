package pertemuan10;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Juni Antari
 * NIM : 2201010172
 */
public class Pertemuan10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws SQLException  {
        list_all();
       
    }
     
    private static void list_all() throws SQLException{
        Connection cnn = koneksi.getKoneksi();
        if(cnn.isClosed()){
            System.out.println("Koneksi Gagal");
        }else{
            PreparedStatement PS =cnn.prepareStatement("SELECT * FROM datateman;");
            ResultSet rs = PS.executeQuery();
            
            while (rs.next()){
                System.out.println("No Record :"+ rs.getInt("idteman"));
                System.out.println("nama :"+ rs.getString("nama"));
                System.out.println("alamat :"+ rs.getString("alamat"));
                System.out.println("telp :"+ rs.getString("telp"));
            }
        }
        
        
        
    }
    
}
