/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computadoras;

import ico.fes.partes.CPU;
import ico.fes.partes.Monitor;
import ico.fes.partes.Mouse;
import ico.fes.partes.Teclado;

/**
 *
 * @author YUGEN
 */
public class Computadora {
    private String marca;
    private int modelo;
    private CPU cpu;
    private Monitor monitor;
    private Mouse mouse;
    private Teclado teclado;

    public Computadora() {
    }

    public Computadora(String marca, int modelo, CPU cpu, Monitor monitor, Mouse mouse, Teclado reclado) {
        this.marca = marca;
        this.modelo = modelo;
        this.cpu = cpu;
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = reclado;
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

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", cpu=" + cpu + ", monitor=" + monitor + ", mouse=" + mouse + ", teclado=" + teclado + '}';
    }
    
}