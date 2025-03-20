package com.android.testeviews;

public class Pessoa {
    private String nome;
    private String matricula;
    private String status;
    private String img;

    public Pessoa(String nome, String matricula, String status, String img) {
        this.nome = nome;
        this.matricula = matricula;
        this.status = status;
        this.img = img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
