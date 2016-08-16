package Onibus;

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

/**
 * Created by Gustavo on 14/08/2016.
 */
public class Utils {

    public static Trajeto2P[] xmlParaTrajeto(){
        Trajeto2P[] linha2p = new Trajeto2P[0];
        try {
            File fXmlFile = new File("res/itinerario_completo.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("trajeto");
            linha2p = new Trajeto2P[nList.getLength()];

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    DayOfWeek dds = DayOfWeek.valueOf(eElement.getElementsByTagName("dia").item(0).getTextContent());
                    Linha linha = Linha.valueOf("L"+eElement.getElementsByTagName("linha").item(0).getTextContent());

                    int hp = Integer.parseInt(eElement.getElementsByTagName("hp").item(0).getTextContent());
                    int mp = Integer.parseInt(eElement.getElementsByTagName("mp").item(0).getTextContent());
                    int hc = Integer.parseInt(eElement.getElementsByTagName("hc").item(0).getTextContent());
                    int mc = Integer.parseInt(eElement.getElementsByTagName("mc").item(0).getTextContent());
                    linha2p[temp] = new Trajeto2P(linha,dds,LocalTime.of(hp,mp),LocalTime.of(hc,mc));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return linha2p;
    }

    public static LocalTime[] busca(LocalDateTime localDateTime, Linha[] linhas, Trajeto2P[] it){
        LocalTime[] localTime = new LocalTime[linhas.length];
        int i = 0;
        A: for (Linha l:linhas) {
            B: for (Trajeto2P anIt : it) {
                if (l.getPontos() == anIt.getLinha().getPontos() && localDateTime.getDayOfWeek() == anIt.getDiaDaSemana()
                        && localDateTime.getHour() <= anIt.gettOrigem().getHour()) {
                    if (localDateTime.getMinute() < anIt.gettOrigem().getMinute()) {
                        localTime[i] = LocalTime.of(anIt.gettOrigem().getHour(), anIt.gettOrigem().getMinute());
                        i++;
                        break B;
                    }
                }
            }
        }
        return localTime;
    }
}
