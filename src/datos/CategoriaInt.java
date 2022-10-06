package datos;

import java.util.List;

/**
 *
 * @author NOVA9
 */
public interface CategoriaInt<T> {
    public List<T> listar(String texto);
    public boolean insertar (T obj);
    public boolean  actualizar (T obj);
    public boolean  elimniar (int id);
}

