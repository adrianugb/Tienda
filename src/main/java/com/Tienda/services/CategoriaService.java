package com.Tienda.services;

import com.Tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Se recupera los registro de la tabla categoria en un 
    //ArrayList de objetos Categoria.
    //Todos o sólo los activos
    
    public List<Categoria>getCategoria(boolean activos);
}
