package Logica_Negocio;
import Acceso_Datos.LugarDAO;
import Entidades.Lugar;

import java.util.ArrayList;

public class LugarBL {
    private static LugarDAO estDAO = new LugarDAO();

    public ArrayList<Lugar> mostrar(){
        return estDAO.mostrar();
    }
    public int guardar(Lugar pLugar){
        return estDAO.guardar(pLugar);
    }
    public int eliminar(int pId){
        return estDAO.eliminar(pId);
    }
}
