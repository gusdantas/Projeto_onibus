package Onibus;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * Created by Gustavo on 13/08/2016.
 */
public abstract class TrajetoSimples {
    //int id;
    Linha linha;
    DayOfWeek diaDaSemana;
    Ponto pOrigem, pDestino;
    LocalTime tOrigem, tDestino;

    public TrajetoSimples(Linha l, DayOfWeek dds, Ponto or, Ponto de, LocalTime o, LocalTime d){
        //this.id = i;
        this.linha = l;
        this.diaDaSemana = dds;
        this.pOrigem = or;
        this.pDestino = de;
        this.tOrigem = o;
        this.tDestino = d;
    }

    /*public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }*/

    public abstract Linha getLinha();

    public abstract void setLinha(Linha linha);

    public abstract Ponto getpOrigem();

    public abstract void setpOrigem(Ponto pOrigem);

    public abstract Ponto getpDestino();

    public abstract void setpDestino(Ponto pDestino);

    public abstract LocalTime gettOrigem();

    public abstract void settOrigem(LocalTime tOrigem);

    public abstract LocalTime gettDestino();

    public abstract void settDestino(LocalTime tDestino);

    public abstract DayOfWeek getDiaDaSemana();

    public abstract void setDiaDaSemana(DayOfWeek diaDaSemana);
}
