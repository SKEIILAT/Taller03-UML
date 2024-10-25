/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller03uml;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class Incidente {
    protected int id;
    protected Date fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected PersonalAcademico beneficiario;
    protected Usuario responsable;
    protected ArrayList log_actualizaciones;
    protected Date fecha_cerrado;
    protected String tipo;
}
