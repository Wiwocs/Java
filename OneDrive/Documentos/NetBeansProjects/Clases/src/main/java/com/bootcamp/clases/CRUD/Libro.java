/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bootcamp.clases.CRUD;

/**
 *
 * @author wiwoc
 */
public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private int anho;
    private String genero;
    private boolean prestado;

    public Libro() {
    }

    public Libro(int id, String titulo, String autor, int anho, String genero, boolean prestado) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anho = anho;
        this.genero = genero;
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        String estado = prestado ? "Prestado" : "Disponible";
        return String.format("| %-4d | %-25s | %-20s | %-6d | %-12s | %-11s", id, titulo, autor, anho, genero, estado);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
}
