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

/**
 * Created by Gustavo on 13/08/2016.
 */
public class MainActivity {

    public static void main(String[] args){
        LocalDateTime agora = LocalDateTime.of(2016,Month.AUGUST,15,10,20);
        System.out.println(agora.toString());
        Ponto origem = Ponto.TERMINAL_LESTE;
        Ponto destino = Ponto.CAMPUS_SANTO_ANDRE;
        Trajeto2P[] itinerario = Utils.xmlParaTrajeto();
        System.out.println(Utils.busca(agora,origem,destino,itinerario).toString());
    }

}
