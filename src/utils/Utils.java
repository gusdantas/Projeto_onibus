package utils;

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

    public static Itinerario2Pontos[] xmlParaItinerario(){
        Itinerario2Pontos[] linha2p = new Itinerario2Pontos[0];
        try {
            File fXmlFile = new File("res/itinerario_completo.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("trajeto");
            linha2p = new Itinerario2Pontos[nList.getLength()];

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    DayOfWeek dds = DayOfWeek.valueOf(eElement.getElementsByTagName("dia").item(0).getTextContent());
                    Trajeto linha = Trajeto.valueOf("L"+eElement.getElementsByTagName("linha").item(0).getTextContent());

                    int hp = Integer.parseInt(eElement.getElementsByTagName("hp").item(0).getTextContent());
                    int mp = Integer.parseInt(eElement.getElementsByTagName("mp").item(0).getTextContent());
                    int hc = Integer.parseInt(eElement.getElementsByTagName("hc").item(0).getTextContent());
                    int mc = Integer.parseInt(eElement.getElementsByTagName("mc").item(0).getTextContent());
                    linha2p[temp] = new Itinerario2Pontos(linha,dds,LocalTime.of(hp,mp),LocalTime.of(hc,mc));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return linha2p;
    }

    public static LocalTime[] busca(LocalDateTime localDateTime, Trajeto[] linhas, Itinerario2Pontos[] it){
        LocalTime[] localTime = new LocalTime[linhas.length];
        int i = 0;
        for (Trajeto l:linhas) {
            for (Itinerario2Pontos anIt : it) {
                if (l.getPontos() == anIt.getLinha().getPontos() && l.getDiaDaSemana() == anIt.getDiaDaSemana()
                        && localDateTime.getHour() <= anIt.gettOrigem().getHour()) {
                    if (localDateTime.getMinute() < anIt.gettOrigem().getMinute()) {
                        localTime[i] = LocalTime.of(anIt.gettOrigem().getHour(), anIt.gettOrigem().getMinute());
                        i++;
                        break;
                    }
                }
            }
        }
        return localTime;
    }

    public static Trajeto[] parseTrajeto(DayOfWeek dow, Ponto o, Ponto d){
        Trajeto[] l = new Trajeto[0];
        switch (dow) {
            case SUNDAY:
                break;
            case SATURDAY:
                if (o == Ponto.CAMPUS_SANTO_ANDRE) {
                    if (d == Ponto.TERMINAL_LESTE || d == Ponto.TERMINAL_SBC || d == Ponto.CAMPUS_SAO_BERNARDO) {
                        l = new Trajeto[]{Trajeto.L71, Trajeto.L81};
                    }
                } else if (o == Ponto.TERMINAL_LESTE) {
                    if (d == Ponto.CAMPUS_SANTO_ANDRE) {
                        l = new Trajeto[]{Trajeto.L72, Trajeto.L86};
                    } else if (d == Ponto.TERMINAL_SBC || d == Ponto.CAMPUS_SAO_BERNARDO) {
                        l = new Trajeto[]{Trajeto.L82};
                    }
                } else if (o == Ponto.TERMINAL_SBC) {
                    if (d == Ponto.CAMPUS_SAO_BERNARDO) {
                        l = new Trajeto[]{Trajeto.L83};
                    } else if (d == Ponto.TERMINAL_LESTE || d == Ponto.CAMPUS_SANTO_ANDRE) {
                        l = new Trajeto[]{Trajeto.L85};
                    }
                } else if (o == Ponto.CAMPUS_SAO_BERNARDO) {
                    if (d == Ponto.TERMINAL_SBC || d == Ponto.TERMINAL_LESTE || d == Ponto.CAMPUS_SANTO_ANDRE) {
                        l = new Trajeto[]{Trajeto.L84};
                    }
                }
                break;
            default:
                if (o == Ponto.CAMPUS_SANTO_ANDRE) {
                    if (d == Ponto.TERMINAL_LESTE) {
                        l = new Trajeto[]{Trajeto.L11, Trajeto.L21, Trajeto.L31, Trajeto.L41, Trajeto.L61};
                    } else if (d == Ponto.CAMPUS_SAO_BERNARDO) {
                        l = new Trajeto[]{Trajeto.L21, Trajeto.L31, Trajeto.L41, Trajeto.L61};
                    }
                } else if (o == Ponto.TERMINAL_LESTE) {
                    if (d == Ponto.CAMPUS_SANTO_ANDRE) {
                        l = new Trajeto[]{Trajeto.L12, Trajeto.L24, Trajeto.L34, Trajeto.L44, Trajeto.L64};
                    } else if (d == Ponto.CAMPUS_SAO_BERNARDO) {
                        l = new Trajeto[]{Trajeto.L22, Trajeto.L32, Trajeto.L42, Trajeto.L62};
                    }
                } else if (o == Ponto.CAMPUS_SAO_BERNARDO) {
                    if (d == Ponto.TERMINAL_LESTE || d == Ponto.CAMPUS_SANTO_ANDRE) {
                        l = new Trajeto[]{Trajeto.L23, Trajeto.L33, Trajeto.L43, Trajeto.L63};
                    } else {
                        l = new Trajeto[]{Trajeto.L51};
                    }
                } else if (o == Ponto.PCA_EXPEDICIONARIOS) {
                    if (d == Ponto.TERMINAL_SBC) {
                        l = new Trajeto[]{Trajeto.L52};
                    } else if (d == Ponto.CAMPUS_SAO_BERNARDO) {
                        l = new Trajeto[]{Trajeto.L54};
                    }
                } else if (o == Ponto.TERMINAL_SBC) {
                    if (d == Ponto.PCA_EXPEDICIONARIOS || d == Ponto.CAMPUS_SAO_BERNARDO) {
                        l = new Trajeto[]{Trajeto.L53};
                    }
                }
                break;
        }
        return l;
    }
}
