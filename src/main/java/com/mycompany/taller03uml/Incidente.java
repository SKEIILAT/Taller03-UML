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
    protected Date fechaReportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected PersonalAcademico beneficiario;
    protected Usuario responsable;
    protected ArrayList logActualizaciones;
    protected Date fechaCerrado;
    protected String tipo;
}
