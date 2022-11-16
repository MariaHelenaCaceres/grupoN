
package com.example.TiendaCamisetas.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity  //reconoce las identidades en la tabla
@Table (name = "usuarios") //crea la tabla usuarios
@NoArgsConstructor     //constructor Vacio
@AllArgsConstructor    //Constructor con todos los argumentos
public class Usuarios {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column(name = "id")//con esto seleccionamos la columna de la tabla
    private Integer id;  //son las variables para conectar el codigo caon las tablas
    @Column (name = "nombre", length = 50)
    private String nombre;
    @Column (name ="contrseña", length = 50)
    private int contraseña;
    
}
