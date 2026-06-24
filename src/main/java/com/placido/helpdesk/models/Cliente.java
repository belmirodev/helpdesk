package com.placido.helpdesk.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    private List<Chamado> chamados;

    public Cliente() {
        chamados = new ArrayList<>();
    }

    public Cliente(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
        chamados = new ArrayList<>();
    }

    public List<Chamado> getChamados() {
        return chamados;
    }

}
