package activity;

import java.time.LocalDateTime;
import java.time.LocalTime;
import utils.Trajeto;
import utils.Ponto;
import utils.Itinerario2Pontos;
import utils.Utils;


/**
 * Created by Gustavo on 13/08/2016.
 */
public class MainActivity {

    public static void main(String[] args){
        Itinerario2Pontos[] itinerario = Utils.xmlParaItinerario();

    	LocalDateTime agora = LocalDateTime.now();
        Ponto origem = Ponto.CAMPUS_SANTO_ANDRE;
        Ponto destino = Ponto.TERMINAL_LESTE;
        Trajeto[] linhas = Utils.parseTrajeto(agora.getDayOfWeek(),origem,destino);
        LocalTime[] localTime = Utils.busca(agora,linhas,itinerario);
        System.out.println("Agora são "+agora.getHour()+":"+agora.getMinute()+
                "\nOs próximos horários de saída do fretado são:");
        int i = 0;
        for (LocalTime lt:localTime) {
            if (lt != null) {
                System.out.println(linhas[i].getCarro()+" sairá as "+lt);
            }else{
                System.out.println("Não há mais horários para o "+linhas[i].getCarro());
            }
            i++;
        }
    }
}
