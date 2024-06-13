package Pruebas;

import Entidades.Lugar;
import Logica_Negocio.LugarBL;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LugarDAOTest {

    @org.junit.jupiter.api.Test
    void mostrar() {
        LugarBL lugarBL = new LugarBL();
        ArrayList<Lugar> lugars = lugarBL.mostrar();
        assertNotNull(lugars,"La lista de lugares no debe de ser nula");
        assertFalse(lugars.isEmpty(),"Lista no debe estar vacia");
    }

    @org.junit.jupiter.api.Test
    void guardar() {
        LugarBL lugarBL = new LugarBL();
        Lugar lugar = new Lugar("Los leones","sonsonate","Sonsonate");
        int result = lugarBL.guardar(lugar);
        assertEquals(1,result,"Debe devolver 1");
    }

    @org.junit.jupiter.api.Test
    void eliminar() {
        LugarBL lugarBL = new LugarBL();
        int result = lugarBL.eliminar(1);
        assertEquals(1,result,"Deberia volver 1");
    }
}