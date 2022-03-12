package com.cineapi.CineAPI.models;
import javax.persistence.*;

@Entity
@Table(name="user_info")
public class UsuarioModel {
    @Id
    private String name;
    private String email;

    public UsuarioModel(){}

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name =name;
    }
    public String getEmail(){
        return this.email;
    }

    public void seEmail(String email){
        this.email = email;
    }
}