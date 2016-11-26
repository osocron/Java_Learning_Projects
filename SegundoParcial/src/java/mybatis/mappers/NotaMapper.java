/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybatis.mappers;

import java.util.List;
import pojos.Nota;

/**
 *
 * @author osocron
 */
public interface NotaMapper {
    public List<Nota> notasPorUsuario(Integer idUsuario);
    public void nuevaNota(Nota nota);
    public void modificarNota(Nota nota);
    public void eliminarNota(Integer idNota);
}
