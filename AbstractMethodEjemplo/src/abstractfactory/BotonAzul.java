/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Kryz Ale
 */
public class BotonAzul extends Boton{
    public BotonAzul()
    {
        this.configurar();
    }
    // ------------------------------
     public void configurar()
    {
        System.out.println("Configurando el BOTÓN con borde AZUL");
    }
}
