package com.mainel.estacione.superestacione.main;

import java.util.Calendar;

/**
 *
 * @author Rafael Mainel
 */
public abstract class Vaga {
    private int numero;
    private Carro carro;
    private Calendar entrada;

    public Vaga(int numero) {
        this.numero = numero;
    }

    protected int getNumero() {
        return numero;
    }

    protected void setNumero(int numero) {
        this.numero = numero;
    }

    protected Carro getCarro() {
        return carro;
    }

    protected void setCarro(Carro carro) {
        this.carro = carro;
    }

    protected Calendar getEntrada() {
        return entrada;
    }

    protected void setEntrada(Calendar entrada) {
        this.entrada = entrada;
    }   
    
}
