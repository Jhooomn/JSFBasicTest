/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 *
 * @author Jhon Baron
 */
public class Vehiculo {

    String placa;
    String marca;
    int modelo;
    String color;
    boolean tsonido;
    boolean tairbag;
    boolean trineslujo;
    boolean tvidrioselectricos;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, int modelo, String color, boolean tsonido, boolean tairbag, boolean trineslujo, boolean tvidrioselectricos) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tsonido = tsonido;
        this.tairbag = tairbag;
        this.trineslujo = trineslujo;
        this.tvidrioselectricos = tvidrioselectricos;
    }

    public String cSonido() {
        if (this.tsonido) {
            return "ssonido.png";
        } else {
            return "nsonido.png";
        }
    }

    public String cAirbag() {
        if (this.tairbag) {
            return "sairbag.png";
        } else {
            return "nairbag.png";
        }
    }
    
    public String cRines(){
        if (this.trineslujo) {
            return "srines.jpg";
        }else{
            return "nrines.jpg";
        }
    }
    public String cvidrios(){
        if (this.tvidrioselectricos) {
            return "svidrios.jpg";
        }else{
            return "nvidrios.jpg";
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTsonido() {
        return tsonido;
    }

    public void setTsonido(boolean tsonido) {
        this.tsonido = tsonido;
    }

    public boolean isTairbag() {
        return tairbag;
    }

    public void setTairbag(boolean tairbag) {
        this.tairbag = tairbag;
    }

    public boolean isTrineslujo() {
        return trineslujo;
    }

    public void setTrineslujo(boolean trineslujo) {
        this.trineslujo = trineslujo;
    }

    public boolean isTvidrioselectricos() {
        return tvidrioselectricos;
    }

    public void setTvidrioselectricos(boolean tvidrioselectricos) {
        this.tvidrioselectricos = tvidrioselectricos;
    }

}
