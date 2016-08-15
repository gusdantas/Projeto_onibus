package Onibus;

/**
 * Created by Gustavo on 14/08/2016.
 */
public enum Linha {
    L11(Ponto.CAMPUS_SANTO_ANDRE,Ponto.TERMINAL_LESTE),
    L12(Ponto.TERMINAL_LESTE,Ponto.CAMPUS_SANTO_ANDRE);


    public Ponto[] pontos;

    Linha(Ponto pt1, Ponto pt2) {
        this.pontos = new Ponto[]{pt1,pt2};
    }

    Ponto[] getPontos(){
        return pontos;
    }
}
