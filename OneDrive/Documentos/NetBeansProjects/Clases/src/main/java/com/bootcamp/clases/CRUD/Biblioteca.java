/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bootcamp.clases.CRUD;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wiwoc
 */
public class Biblioteca {
    private ArrayList<Libro> estanteria;
    private Scanner teclado = new Scanner(System.in);

    public Biblioteca() {
        estanteria = new ArrayList<Libro>();
    }

    public Biblioteca(ArrayList<Libro> estanteria) {
        this.estanteria = estanteria;
    }
    
    public void agregarLibro(){
        System.out.println("Ingrese ID del libro");
        int id = teclado.nextInt();
        System.out.println("Ingrese ID del libro");
        String titulo = teclado.nextLine();
        System.out.println("Ingrese ID del libro");
        String autor = teclado.nextLine();
        System.out.println("Ingrese ID del libro");
        int anho = teclado.nextInt();
        System.out.println("Ingrese ID del libro");
        String genero = teclado.nextLine();
        Libro libro = new Libro(id, titulo, autor, anho, genero, false);
        this.estanteria.add(libro);
    }
    
    public void listarLibros(){
        estanteria.forEach(libro -> System.out.println(libro.toString()));
    }
    
    public void buscarPorId(){
        System.out.println("Ingrese Id a buscar");
        int id = teclado.nextInt();
        Libro encontrado = encontrarLibroPorId(id);
        if(encontrado != null){
            encontrado.toString();
        } else {
            System.out.println("Libro no encontrado");
        }
    }
    
    public Libro encontrarLibroPorId(int id){
        for(int i = 0; i < estanteria.size(); i++){
            if(estanteria.get(i).getId() == id){
                return estanteria.get(i);
            }
        }
        return null;
    }
    
    public Libro encontrarLibroPorNombre(String nombre){
        for(int i = 0; i < estanteria.size(); i++){
            if(estanteria.get(i).getTitulo() == nombre){
                return estanteria.get(i);
            }
        }
        return null;
    }
    
    public void buscarPorTitulo(){
        System.out.println("Ingrese Titulo a Buscar");
        String nombre = teclado.nextLine();
        Libro encontrado = encontrarLibroPorNombre(nombre);
        if(encontrado != null){
            encontrado.toString();
        } else {
            System.out.println("Libro no encontrado");
        }
    }
    public void actualizarLibro(){
        System.out.println("Ingrese Id del libro a buscar");
        int id = teclado.nextInt();
        Libro encontrado = encontrarLibroPorId(id);
        if(encontrado != null){
            encontrado.toString();
            int i;
            do{
                i = menu();
                switch(i){
                    case 1:
                        System.out.println("Ingrese Nombre Libro Nuevo");
                        encontrado.setTitulo(teclado.nextLine());
                        break;
                    case 2:
                        System.out.println("Ingrese Nombre Autor Nuevo");
                        encontrado.setAutor(teclado.nextLine());
                        break;
                    case 3:
                        System.out.println("Ingrese El Nuevo año de publicacion");
                        encontrado.setAnho(teclado.nextInt());
                        break;
                    case 4:
                        System.out.println("Ingrese el Genero Nuevo");
                        encontrado.setGenero(teclado.nextLine());
                        break;
                    case 0:
                        System.out.println("Entendido, que tenga un excelente dia");
                        break;
                    default:
                        System.out.println("Ingrese la opcion Correcta");
                }
            }while(i != 0);
        } else {
            System.out.println("Libro no encontrado");
        }
    }
    public int menu(){
        System.out.println("-------------------------");
        System.out.println("¿Que dato desea cambiar?");
        System.out.println("1.- Nombre");
        System.out.println("2.- Autor");
        System.out.println("3.- Año Publicacion");
        System.out.println("4.- Genero");
        System.out.println("0.- Salir");
        System.out.println("-------------------------");
        return teclado.nextInt();
    }
    public void eliminarLibro(){
        System.out.println("Ingrese Id del libro a buscar");
        int id = teclado.nextInt();
        Libro encontrado = encontrarLibroPorId(id);
        if(encontrado != null){
            encontrado.toString();
            System.out.println("¿Desea eliminar este libro (S/N)");
            String respuesta = teclado.nextLine();
            if(respuesta.equalsIgnoreCase("S") || respuesta.equalsIgnoreCase("si")){
                estanteria.remove(encontrado);
            }else{
                System.out.println("¿Arrepentido? genial, un libro es un mundo, no lo elimines");
            }
        } else {
            System.out.println("Libro no encontrado");
        }
    }
}
