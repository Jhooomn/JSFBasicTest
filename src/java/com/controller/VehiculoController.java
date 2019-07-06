/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.Vehiculo;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Jhon Baron
 */
@ManagedBean
@SessionScoped
public class VehiculoController {

    Vehiculo vehiculo = new Vehiculo();

    List<Vehiculo> vehiculos = new LinkedList();

    /**
     * Creates a new instance of VehiculoController
     */
    public VehiculoController() {
        generarVehiculo();

    }
    //String placa, String marca, int modelo, String color, boolean tsonido, 
    //boolean tairbag, boolean trineslujo, boolean tvidrioselectricos

    public void generarVehiculo() {
        vehiculos.add(new Vehiculo("zxc-123", "Mazda", 2001, "Rojo", false, false, false, false));
        vehiculos.add(new Vehiculo("ads-321", "Chevrolet", 1999, "Blanco", false, false, false, false));
        vehiculos.add(new Vehiculo("hks-572", "Toyota", 2019, "Negro", false, false, false, false));
        vehiculos.add(new Vehiculo("qwe-678", "Hyundai", 2007, "Amarillo", false, false, false, false));
    }

    public void seleccionar(Vehiculo v) {
        vehiculo = v;
    }

    public void tieneSonido() {
        if (vehiculo.isTsonido()) {
            vehiculo.setTsonido(false);
        } else {
            vehiculo.setTsonido(true);
        }
    }

    public void tieneAirbag() {
        if (vehiculo.isTairbag()) {
            vehiculo.setTairbag(false);
        } else {
            vehiculo.setTairbag(true);
        }
    }

    public void tieneRines() {
        if (vehiculo.isTrineslujo()) {
            vehiculo.setTrineslujo(false);
        } else {
            vehiculo.setTrineslujo(true);
        }
    }
    public void tieneVidrios() {
        if (vehiculo.isTvidrioselectricos()) {
            vehiculo.setTvidrioselectricos(false);
        } else {
            vehiculo.setTvidrioselectricos(true);
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

}
