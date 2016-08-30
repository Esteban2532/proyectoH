/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package co.lab.aplicaciones.proyectoholel.repository;

import co.lab.aplicaciones.proyectoholel.modelo.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Esteban
 */
@Repository
public class HotelDao {

    @Autowired
    private HotelRepository hotelRepository;

    @Transactional

    public Hotel save(Hotel h) {
        // some business logic
        if (h.getNombre()== null){
            throw new IllegalArgumentException ("Debe genenera un nombre");
            
        }

        return hotelRepository.save(h);
    }
}
