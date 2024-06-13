package Acceso_Datos;
import Entidades.Lugar;

import java.sql.*;
import java.util.ArrayList;

public class LugarDAO {
    PreparedStatement ps;
    ResultSet rs;
    Lugar est;
    Conexion cn = new Conexion();

    public Connection getConexion() throws ClassNotFoundException, SQLException{
        Class.forName(cn.getDriver());
        return DriverManager.getConnection(cn.getUrl(),cn.getUser(),cn.getPass());
    }
    public ArrayList<Lugar> mostrar(){
        ArrayList<Lugar> listEst = new ArrayList<>();
        try{
            ps = getConexion().prepareStatement("select * from lugar");
            rs = ps.executeQuery();
            while (rs.next()){
                est = new Lugar(rs.getInt(1), rs.getString(2),
                        rs.getString(3),rs.getString(4));
                listEst.add(est);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return listEst;
    }
    public int guardar(Lugar pLugar){
        int result = 0;
        try{
            ps = getConexion().prepareStatement("INSERT INTO " + "lugar(nombre,direccion,ciudad) values (?,?,?)");
            ps.setString(1,pLugar.getNombre());
            ps.setString(2,pLugar.getDireccion());
            ps.setString(3,pLugar.getCiudad());
            result = ps.executeUpdate();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }

    public int eliminar(int pId){
        int result = 0;
        try{
            ps = getConexion().prepareStatement("Delete from lugar " + "where id = ?");
            ps.setInt(1,pId);
            result = ps.executeUpdate();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
}
