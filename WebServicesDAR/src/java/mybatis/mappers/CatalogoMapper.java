package mybatis.mappers;

import java.util.List;
import pojos.Catalogo;


public interface CatalogoMapper {
    public List<Catalogo> getAllCatalogos();
    public List<Catalogo> getCatalogosByIdtipo(Integer id);
    public void registrarCatalogo(Integer idCatalogo, String nombre,
                                  Integer idTipo, Integer orden);
    public void actualizarCatalogo(Integer idCatalogo, 
            String nombre, Integer orden);
    public void eliminarCatalogo(Integer idCatalogo);
}
