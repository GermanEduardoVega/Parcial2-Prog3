package com.example.Parcial1_ApiRest_VideosHasta16.services;

import com.example.Parcial1_ApiRest_VideosHasta16.entities.Persona;
import com.example.Parcial1_ApiRest_VideosHasta16.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class PersonaService implements BaseService<Persona>{

    //@Autowired
    private PersonaRepository personaRepository; //creamos el objeto que se va a comunicar con la bd
                                                //Declaramos el personaRepository para la inyeccion de dependencias a travez del constructor (o con autowired)

    //Constructor que reemplaza el Autowired
    public PersonaService (PersonaRepository personaRepository){// Este constructor no lo llamamos desde ningun lado spring se va a  encargar de obtener las dependencias que necesita el servicio
        this.personaRepository = personaRepository;

    }



    @Override
    public List<Persona> findAll() throws Exception {
        return null;
    }

    @Override
    @Transactional
    public Persona findById(Long id) throws Exception {
        return null;
    }

    @Override
    @Transactional
    public Persona save(Persona entity) throws Exception {
        return null;
    }

    @Override
    @Transactional
    public Persona update(Long id, Persona entity) throws Exception {
        return null;
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        return false;
    }
}


/*
* 1)
* @Transactional: Me va a permitir que van hacer transacciones con la BD (en casos anteriores usabamos entity manager en la persistencia
*               con Transaccional Beggin ()
*                                   Commit()
*            en las excepciones un    Rollback()
*
* 2)Bloque try Catch
* */