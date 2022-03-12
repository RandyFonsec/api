package com.cineapi.CineAPI.controllers;

import java.util.ArrayList;

import com.cineapi.CineAPI.models.UsuarioModel;
import com.cineapi.CineAPI.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService userServ;
    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return userServ.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel u ){
        return this.userServ.guardarUsuario(u);
    }
    

}
