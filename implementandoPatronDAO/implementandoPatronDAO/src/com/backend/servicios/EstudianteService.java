package com.backend.servicios;

import com.backend.dao.IDao;
import com.backend.entidades.Estudiante;

import java.util.List;

public class EstudianteService {

    private IDao<Estudiante> estudianteIDao;

    public void setEstudianteIDao(IDao<Estudiante> estudianteIDao) {
        this.estudianteIDao = estudianteIDao;
    }

    public Estudiante guardarEstudiante(Estudiante e){
        // Delegarle la responsbilidad de guardar al DAO
        return estudianteIDao.guardar(e);
    }

    // Delegarle la responsbilidad de eliminar al DAO
    public void eliminarEstudiante(Long id){
        estudianteIDao.eliminar(id);

    }

    // Delegarle la responsbilidad de buscar al DAO
    public Estudiante buscarEstudiante(Long id){
        return estudianteIDao.buscar(id);
    }

    // Delegarle la responsbilidad de buscar a todos al DAO
    public List<Estudiante> buscarTodos(){
        return estudianteIDao.buscarTodos();
    }

}
