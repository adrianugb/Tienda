package com.Tienda.services.impl;

import com.Tienda.dao.CategoriaDao;
import com.Tienda.domain.Categoria;
import com.Tienda.services.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl 
        implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    public List<Categoria> getCategoria(boolean activos) {
        var lista = categoriaDao.findAll();
        
        if (activos){//si solo quiero activos
            lista.removeIf(c -> !c.isActivo());
        }
        
        return lista;
        }
    
}
