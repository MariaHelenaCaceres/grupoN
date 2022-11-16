/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.TiendaCamisetas.Repository;

import com.example.TiendaCamisetas.Modelo.Usuarios;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author KIRITODANI
 */
public interface UsuarioRepository extends CrudRepository<Usuarios, Integer> {
    
}
