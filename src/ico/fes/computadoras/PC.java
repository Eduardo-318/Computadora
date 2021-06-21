/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.computadoras;

import Computadoras.Computadora;
import ico.fes.partes.CPU;
import ico.fes.partes.Monitor;
import ico.fes.partes.Mouse;
import ico.fes.partes.Teclado;

/**
 *
 * @author YUGEN
 */
public class PC {
    public static void main(String[] args) {
        
        Computadora pc1=new Computadora();
        pc1.setMarca("lENOVO");
        pc1.setCpu(new CPU("AMD", "Ryzen 5 3400g", 3.7f));
        pc1.setMonitor(new Monitor("ASUS", "VPE-228HE", 21.5f));
        pc1.setModelo(2018);
        pc1.setMouse(new Mouse("Vorago", "mo-501", "Alambrico"));
        pc1.setTeclado(new Teclado("Vorago", "KB-502", 105, 0));
        
        System.out.println(pc1);
    }
    
}
