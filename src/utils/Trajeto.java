package utils;

import java.time.DayOfWeek;

/**
 * Created by Gustavo on 14/08/2016.
 */
public enum Trajeto {
    L11("Carro 1",DayOfWeek.MONDAY,Ponto.CAMPUS_SANTO_ANDRE,Ponto.TERMINAL_LESTE),
    L12("Carro 1",DayOfWeek.MONDAY,Ponto.TERMINAL_LESTE,Ponto.CAMPUS_SANTO_ANDRE),

    L21("Carro 2",DayOfWeek.MONDAY,Ponto.CAMPUS_SANTO_ANDRE,Ponto.TERMINAL_LESTE),
    L22("Carro 2",DayOfWeek.MONDAY,Ponto.TERMINAL_LESTE,Ponto.CAMPUS_SAO_BERNARDO),
    L23("Carro 2",DayOfWeek.MONDAY,Ponto.CAMPUS_SAO_BERNARDO,Ponto.TERMINAL_LESTE),
    L24("Carro 2",DayOfWeek.MONDAY,Ponto.TERMINAL_LESTE,Ponto.CAMPUS_SANTO_ANDRE),

    L31("Carro 3",DayOfWeek.MONDAY,Ponto.CAMPUS_SANTO_ANDRE,Ponto.TERMINAL_LESTE),
    L32("Carro 3",DayOfWeek.MONDAY,Ponto.TERMINAL_LESTE,Ponto.CAMPUS_SAO_BERNARDO),
    L33("Carro 3",DayOfWeek.MONDAY,Ponto.CAMPUS_SAO_BERNARDO,Ponto.TERMINAL_LESTE),
    L34("Carro 3",DayOfWeek.MONDAY,Ponto.TERMINAL_LESTE,Ponto.CAMPUS_SANTO_ANDRE),

    L41("Carro 4",DayOfWeek.MONDAY,Ponto.CAMPUS_SANTO_ANDRE,Ponto.TERMINAL_LESTE),
    L42("Carro 4",DayOfWeek.MONDAY,Ponto.TERMINAL_LESTE,Ponto.CAMPUS_SAO_BERNARDO),
    L43("Carro 4",DayOfWeek.MONDAY,Ponto.CAMPUS_SAO_BERNARDO,Ponto.TERMINAL_LESTE),
    L44("Carro 4",DayOfWeek.MONDAY,Ponto.TERMINAL_LESTE,Ponto.CAMPUS_SANTO_ANDRE),

    L51("Carro 5",DayOfWeek.MONDAY,Ponto.CAMPUS_SAO_BERNARDO,Ponto.PCA_EXPEDICIONARIOS),
    L52("Carro 5",DayOfWeek.MONDAY,Ponto.PCA_EXPEDICIONARIOS,Ponto.TERMINAL_SBC),
    L53("Carro 5",DayOfWeek.MONDAY,Ponto.TERMINAL_SBC,Ponto.PCA_EXPEDICIONARIOS),
    L54("Carro 5",DayOfWeek.MONDAY,Ponto.PCA_EXPEDICIONARIOS,Ponto.CAMPUS_SAO_BERNARDO),

    L61("Carro Expresso",DayOfWeek.MONDAY,Ponto.CAMPUS_SANTO_ANDRE,Ponto.TERMINAL_LESTE),
    L62("Carro Expresso",DayOfWeek.MONDAY,Ponto.TERMINAL_LESTE,Ponto.CAMPUS_SAO_BERNARDO),
    L63("Carro Expresso",DayOfWeek.MONDAY,Ponto.CAMPUS_SAO_BERNARDO,Ponto.TERMINAL_LESTE),
    L64("Carro Expresso",DayOfWeek.MONDAY,Ponto.TERMINAL_LESTE,Ponto.CAMPUS_SANTO_ANDRE),
    
    L71("Carro 1",DayOfWeek.SATURDAY,Ponto.CAMPUS_SANTO_ANDRE,Ponto.TERMINAL_LESTE),
    L72("Carro 1",DayOfWeek.SATURDAY,Ponto.TERMINAL_LESTE,Ponto.CAMPUS_SANTO_ANDRE),

    L81("Carro 2",DayOfWeek.SATURDAY,Ponto.CAMPUS_SANTO_ANDRE,Ponto.TERMINAL_LESTE),
    L82("Carro 2",DayOfWeek.SATURDAY,Ponto.TERMINAL_LESTE,Ponto.TERMINAL_SBC),
    L83("Carro 2",DayOfWeek.SATURDAY,Ponto.TERMINAL_SBC,Ponto.CAMPUS_SAO_BERNARDO),
    L84("Carro 2",DayOfWeek.SATURDAY,Ponto.CAMPUS_SAO_BERNARDO,Ponto.TERMINAL_SBC),
    L85("Carro 2",DayOfWeek.SATURDAY,Ponto.TERMINAL_SBC,Ponto.TERMINAL_LESTE),
    L86("Carro 2",DayOfWeek.SATURDAY,Ponto.TERMINAL_LESTE,Ponto.CAMPUS_SANTO_ANDRE);

    private String carro;
	private DayOfWeek diaDaSemana;
    private Ponto[] pontos;

    Trajeto(String c, DayOfWeek dds, Ponto pt1, Ponto pt2) {
        this.carro = c;
    	this.diaDaSemana = dds;
        this.pontos = new Ponto[]{pt1,pt2};
    }

    public String getCarro(){
        return carro;
    }
    
    DayOfWeek getDiaDaSemana(){
    	return diaDaSemana;
    }

    Ponto[] getPontos(){
        return pontos;
    }
}
