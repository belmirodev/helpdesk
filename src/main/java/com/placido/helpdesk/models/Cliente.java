package com.placido.helpdesk.models;

import java.util.ArrayList;
import java.util.List;

import com.placido.helpdesk.enums.Perfil;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity(name="TB_CLIENTE")
public class Cliente extends Pessoa {

    @OneToMany(mappedBy = "cliente")
    private List<Chamado> chamados;

    public Cliente() {
        chamados = new ArrayList<>();
        addPerfil(Perfil.CLIENTE);
    }

    public Cliente(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
        chamados = new ArrayList<>();
        addPerfil(Perfil.CLIENTE);
    }

    public List<Chamado> getChamados() {
        return chamados;
    }

}
