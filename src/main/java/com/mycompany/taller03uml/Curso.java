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
public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private ArrayList<Foro> foros;
    private Profesor responsable;
    private ArrayList<Estudiante> estudiantesEnEsperaDeInscripcion;
    private ArrayList<ActividadSumativa> actividadesSumativas;
}
