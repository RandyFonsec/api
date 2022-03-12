package com.cineapi.CineAPI.services;

import java.util.ArrayList;

import com.cineapi.CineAPI.repositories.UsuarioRepository;
import com.cineapi.CineAPI.models.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository userRepo;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) userRepo.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel u){
        return userRepo.save(u);

    }
}
