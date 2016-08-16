package Activity;

import Onibus.Trajeto2P;
import Onibus.Linha;
import Onibus.Ponto;
import Onibus.Utils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;

/**
 * Created by Gustavo on 13/08/2016.
 */
public class MainActivity {

    public static void main(String[] args){
        LocalDateTime agora = LocalDateTime.of(2016,Month.AUGUST,15,10,20);
        System.out.println(agora.toString());
        Ponto origem = Ponto.CAMPUS_SANTO_ANDRE;
        Ponto destino = Ponto.TERMINAL_LESTE;
        Linha[] linhas = parseTrajeto(agora.getDayOfWeek(),origem,destino);
        Trajeto2P[] itinerario = Utils.xmlParaTrajeto();
        LocalTime[] localTime = Utils.busca(agora,linhas,itinerario);
        for (LocalTime lt:localTime) {
            System.out.println(lt);
        }

    }

    public static Linha[] parseTrajeto(DayOfWeek dow, Ponto o, Ponto d){
        Linha[] l = new Linha[0];
        if(dow == DayOfWeek.SUNDAY){

        }else if(dow == DayOfWeek.SATURDAY){

        }else {
            if (o == Ponto.CAMPUS_SANTO_ANDRE) {
                if (d == Ponto.TERMINAL_LESTE) {
                    l = new Linha[]{Linha.L11, Linha.L21, Linha.L31, Linha.L41, Linha.L61};
                }else if(d == Ponto.CAMPUS_SAO_BERNARDO){
                    l = new Linha[]{Linha.L21, Linha.L31, Linha.L41, Linha.L61};
                }
            } else if (o == Ponto.TERMINAL_LESTE) {
                if (d == Ponto.CAMPUS_SANTO_ANDRE) {
                    l = new Linha[]{Linha.L12, Linha.L24, Linha.L34, Linha.L44, Linha.L64};
                }else if(d == Ponto.CAMPUS_SAO_BERNARDO){
                    l = new Linha[]{Linha.L22, Linha.L32, Linha.L42, Linha.L62};
                }
            } else if (o == Ponto.CAMPUS_SAO_BERNARDO){
                if (d == Ponto.TERMINAL_LESTE || d == Ponto.CAMPUS_SANTO_ANDRE){
                    l = new Linha[]{Linha.L23, Linha.L33, Linha.L43, Linha.L63};
                }
            }
        }
        return l;
    }

}
