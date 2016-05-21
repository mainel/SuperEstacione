
package com.mainel.estacione.superestacione.main;

import java.util.Calendar;

/**
 *
 * @author Rafael Mainel
 */
public class VagaComum extends Vaga {

    public VagaComum(int numero) {
        super(numero);
    }
    
    @Override
    protected int getNumero() {
        return super.getNumero();
    }

    @Override
    protected void setNumero(int numero) {
        super.setNumero(numero);
    }

    @Override
    protected Carro getCarro() {
        return super.getCarro();
    }

    @Override
    protected void setCarro(Carro carro) {
        super.setCarro(carro);
    }

    @Override
    protected Calendar getEntrada() {
        return super.getEntrada();
    }

    @Override
    protected void setEntrada(Calendar entrada) {
        super.setEntrada(entrada);
    }
}
