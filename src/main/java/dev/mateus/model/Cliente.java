package dev.mateus.model;

class Cliente {
    private final int id;
    private final String nome;
    private final String email;

    public Cliente(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome='" + nome + '\'' + ", email='" + email + '\'' + '}';
    }
}