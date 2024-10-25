/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller03uml;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Usuario {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    private ArrayList<Incidente> incidentes;

    protected boolean logln(){
        return true;
    }

    protected boolean logOut(){
        return true;
    }
}
