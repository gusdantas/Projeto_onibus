package activity;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import utils.Trajeto;
import utils.Ponto;
import utils.Itinerario2Pontos;
import utils.Utils;

/**
 * Created by Gustavo on 13/08/2016.
 */
public class MainActivity {

    public static void main(String[] args){
        //LocalDateTime agora = LocalDateTime.of(2016,Month.AUGUST,15,10,20);
    	LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.toString());
        Ponto origem = Ponto.CAMPUS_SANTO_ANDRE;
        Ponto destino = Ponto.TERMINAL_LESTE;
        Trajeto[] linhas = parseTrajeto(agora.getDayOfWeek(),origem,destino);
        Itinerario2Pontos[] itinerario = Utils.xmlParaItinerario();
        LocalTime[] localTime = Utils.busca(agora,linhas,itinerario);
        for (LocalTime lt:localTime) {
            System.out.println(lt);
        }

    }

    public static Trajeto[] parseTrajeto(DayOfWeek dow, Ponto o, Ponto d){
        Trajeto[] l = new Trajeto[0];
        
        if(dow == DayOfWeek.SUNDAY){
        }else if(dow == DayOfWeek.SATURDAY){
            if (o == Ponto.CAMPUS_SANTO_ANDRE) {
            	if (d == Ponto.TERMINAL_LESTE || d == Ponto.TERMINAL_SBC || d == Ponto.CAMPUS_SAO_BERNARDO) {
            		l = new Trajeto[]{Trajeto.L71, Trajeto.L81};
            	}
            } else if (o == Ponto.TERMINAL_LESTE) {
                if (d == Ponto.CAMPUS_SANTO_ANDRE) {
                    l = new Trajeto[]{Trajeto.L72, Trajeto.L86};
                }else if(d == Ponto.TERMINAL_SBC || d == Ponto.CAMPUS_SAO_BERNARDO){
                    l = new Trajeto[]{Trajeto.L82};
                }
            } else if (o == Ponto.TERMINAL_SBC){
            	if (d == Ponto.CAMPUS_SAO_BERNARDO){
            		l = new Trajeto[]{Trajeto.L83};
            	} else if(d == Ponto.TERMINAL_LESTE || d == Ponto.CAMPUS_SANTO_ANDRE){
            		l = new Trajeto[]{Trajeto.L85};
            	}
            } else if (o == Ponto.CAMPUS_SAO_BERNARDO){
            	if (d == Ponto.TERMINAL_SBC || d == Ponto.TERMINAL_LESTE || d == Ponto.CAMPUS_SANTO_ANDRE) {
            		l = new Trajeto[]{Trajeto.L84};
            	}
            }
        }else {
            if (o == Ponto.CAMPUS_SANTO_ANDRE) {
                if (d == Ponto.TERMINAL_LESTE) {
                    l = new Trajeto[]{Trajeto.L11, Trajeto.L21, Trajeto.L31, Trajeto.L41, Trajeto.L61};
                }else if(d == Ponto.CAMPUS_SAO_BERNARDO){
                    l = new Trajeto[]{Trajeto.L21, Trajeto.L31, Trajeto.L41, Trajeto.L61};
                }
            } else if (o == Ponto.TERMINAL_LESTE) {
                if (d == Ponto.CAMPUS_SANTO_ANDRE) {
                    l = new Trajeto[]{Trajeto.L12, Trajeto.L24, Trajeto.L34, Trajeto.L44, Trajeto.L64};
                }else if(d == Ponto.CAMPUS_SAO_BERNARDO){
                    l = new Trajeto[]{Trajeto.L22, Trajeto.L32, Trajeto.L42, Trajeto.L62};
                }
            } else if (o == Ponto.CAMPUS_SAO_BERNARDO){
                if (d == Ponto.TERMINAL_LESTE || d == Ponto.CAMPUS_SANTO_ANDRE){
                    l = new Trajeto[]{Trajeto.L23, Trajeto.L33, Trajeto.L43, Trajeto.L63};
                }else {
                	l = new Trajeto[]{Trajeto.L51};
                }
            } else if (o == Ponto.PCA_EXPEDICIONARIOS){
            	if (d == Ponto.TERMINAL_SBC){
            		l = new Trajeto[]{Trajeto.L52};
            	}else if (d == Ponto.CAMPUS_SAO_BERNARDO){
            		l = new Trajeto[]{Trajeto.L54};
            	}
            } else if (o == Ponto.TERMINAL_SBC) {
            	if (d == Ponto.PCA_EXPEDICIONARIOS || d == Ponto.CAMPUS_SAO_BERNARDO){
            		l = new Trajeto[]{Trajeto.L53};
            	}
				
			}
        }
        return l;
    }

}
