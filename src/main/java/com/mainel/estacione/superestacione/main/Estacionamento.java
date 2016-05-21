package com.mainel.estacione.superestacione.main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author Rafael Mainel
 */
public class Estacionamento {

    private final List<Vaga> VAGAS;

    public Estacionamento() {
        this.VAGAS = Estacionamento.getVagas();
    }

    public static List<Vaga> getVagas() {
        final int VAGAS_NORMAIS = 20;
        final int VAGAS_DEFICIENTES = 5;
        final List<Vaga> VAGAS = new ArrayList<>();

        for (int i = 0; i < VAGAS_NORMAIS; i++) {
            VAGAS.add(new VagaComum(i + 1));
        }
        for (int i = 0; i < VAGAS_DEFICIENTES; i++) {
            VAGAS.add(new VagaDeficiente((i + VAGAS_NORMAIS) + 1));
        }

        return VAGAS;
    }

    public int GetNumerodeVagas() {
        int contador = 0;
        for (Vaga vaga : this.VAGAS) {
            if (vaga.getCarro() == null) {
                contador++;

            }
        }
        return contador;
    }

}
