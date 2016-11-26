/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybatis.mappers;

import org.apache.ibatis.annotations.Param;
import pojos.Usuario;

/**
 *
 * @author osocron
 */
public interface UsuarioMapper {
    public Usuario login(Usuario usuadio);
    public void registarUsario(Usuario usuario);
}
