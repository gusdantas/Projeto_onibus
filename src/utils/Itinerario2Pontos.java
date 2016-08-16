package utils;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * Created by Gustavo on 13/08/2016.
 */
public class Itinerario2Pontos extends ItinerarioSimples {

    Itinerario2Pontos(Trajeto l, DayOfWeek dds, LocalTime to, LocalTime td) {
        super(l, dds, l.getPontos()[0], l.getPontos()[1], to, td);
    }

    @Override
    public Trajeto getLinha() {
        return linha;
    }

    @Override
    public void setLinha(Trajeto l) {
        linha = l;
    }

    @Override
    public Ponto getpOrigem() {
        return pOrigem;
    }

    @Override
    public void setpOrigem(Ponto po) {
        pOrigem = po;
    }

    @Override
    public Ponto getpDestino() {
        return pDestino;
    }

    @Override
    public void setpDestino(Ponto pd) {
        pDestino = pd;
    }

    @Override
    public LocalTime gettOrigem() {
        return tOrigem;
    }

    @Override
    public void settOrigem(LocalTime to) {
        tOrigem = to;
    }

    @Override
    public LocalTime gettDestino() {
        return tDestino;
    }

    @Override
    public void settDestino(LocalTime td) {
        tDestino = td;
    }

    @Override
    public DayOfWeek getDiaDaSemana() {
        return diaDaSemana;
    }

    @Override
    public void setDiaDaSemana(DayOfWeek dds) {
        diaDaSemana = dds;
    }
}
