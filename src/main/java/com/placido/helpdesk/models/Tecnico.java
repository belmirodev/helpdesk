package com.placido.helpdesk.models;
import java.util.ArrayList;
import java.util.List;

import com.placido.helpdesk.enums.Perfil;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity(name = "TB_TECNICO")
public class Tecnico extends Pessoa {

    @OneToMany(mappedBy = "tecnico")
    private List<Chamado> chamados;

    public Tecnico() {
        chamados = new ArrayList<>();
        addPerfil(Perfil.TECNICO);
    }

    public Tecnico(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
        addPerfil(Perfil.TECNICO);
    }

    public List<Chamado> getChamados() {
        return chamados;
    }
}
