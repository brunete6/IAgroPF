package com.example.iagropf;

public class Usuario {
    private String Usuario , contrasenia, resultado;

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Usuario(String usuario, String contrasenia) {
        Usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public Usuario(String resultado) {
       this.resultado = resultado;
    }
}
