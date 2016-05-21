package com.mainel.estacione.superestacione.main;

import com.mainel.estacione.superestacione.swing.Principal;

/**
 * Main class to run Super Estacione Project
 * <p>
 * @author Rafael Mainel
 */
public class Main 
{
    public static void main (String[] args){
        Principal principal = new Principal(new Estacionamento());
        principal.setVisible(true);
    }
}
