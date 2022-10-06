package datos.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import database.Conexion;
import datos.CategoriaInt;
import dominio.Categoria;
/**
 *
 * @author NOVA9
 */
public class CategoriaImpl implements CategoriaInt<Categoria>{
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;

    public CategoriaImpl() {
        CON=Conexion.getInstancia();
    }
    
    
    
    @Override
    public List<Categoria> listar(String texto) {
        List<Categoria> lista = new ArrayList();
        try {
            ps=(PreparedStatement)CON.conectar().prepareStatement("SELECT*FROM categoria where nombre LIKE?");
            ps.setString(1,"%"+texto+"%");
            rs=ps.executeQuery();
            while (rs.next()) {
                lista.add(new Categoria(rs.getInt(1),rs.getString(2)));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ps=null;
            CON.desconectar();
        }
        return lista;
    }

    @Override
    public boolean insertar(Categoria obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizar(Categoria obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean elimniar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
