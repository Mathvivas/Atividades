/*
    Nome: Matheus Lopes Vivas

    R.A.: 17.04401-4
*/

package com.company;

public class Usuário {
    private String nome;
    private String senha;
    private String email;

    public Usuário(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
}
