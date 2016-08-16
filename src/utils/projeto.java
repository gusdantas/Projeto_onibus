package utils;
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package Onibus;


import javax.swing.JOptionPane;
import java.util.Date;
import java.util.TimeZone;
import java.text.*;

public class projeto {
    public static void main(String[] args)
    {
        int hora =0;
        int min =0;
        int[] tempo = new int[2];
        int aux;
        int aux2;
        int onibus1[][] = new int [24][60];
        int onibus2[][] = new int [24][60];
        int onibus3[][] = new int [24][60];

        int transporte1[] =new int [4];
        int transporte2[] =new int [4];
        int transporte3[] =new int [4];

        String S1= "S";
        String S = "";

        int destino =0;
        int embarque =0;

        String text1[] = new String[2];
        String text2[] = new String[2];
        String text3[] = new String[2];
        String textpd[] = new String[2];
        String ted[] = new String[3];

        tempo = calltempo();
        JOptionPane.showMessageDialog(null, "Bem vindo ao sistema de transporte da UFABC","Hora: "+tempo[0]+ ":"+tempo[1]+" - Transporte Universitario", 3);

        do
        {
        text1[0] = "Indisponivel";
        text1[1] = "Indisponivel";
        text2[0] = "Indisponivel";
        text2[1] = "Indisponivel";
        text3[0] = "Indisponivel";
        text3[1] = "Indisponivel";

        onibus1 =onibus.memoriadadoso1();
        onibus2 =onibus.memoriadadoso2();
        onibus3 =onibus.memoriadadoso3();

        transporte1 = zera4l();
        transporte2 = zera4l();
        transporte3 = zera4l();

        do
        {
        aux=0;
        tempo = calltempo();
        embarque = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero correspondente ao seu respectivo local:\n\n   [1] Terminal Leste\n   [2] UFABC Santo André\n   [3] UFABC SBC\n    ", "Hora: " + tempo[0] + ":" + tempo[1] + " - Transporte Universitario", 3));
        if((embarque<1)||(embarque>3))
            {
            aux =1;
            tempo = calltempo();
            JOptionPane.showMessageDialog(null, " Local invalido ","Hora: "+tempo[0]+ ":"+tempo[1]+" - Transporte Universitario", 3);
            }
        }
        while(aux!=0);


        do{
        aux=0;
        tempo = calltempo();
        destino = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero correspondente para o destino desejado:\n\n   [1] Terminal Leste\n   [2] UFABC Santo André\n   [3] UFABC SBC\n   ","Hora: "+tempo[0]+ ":"+tempo[1]+" - Transporte Universitario",3 ));
        if(((destino<1)||(destino>3))||(destino==embarque))
            {
            aux =1;
            tempo = calltempo();
            JOptionPane.showMessageDialog(null, " Destino invalido ","Hora: "+tempo[0]+ ":"+tempo[1]+" - Transporte Universitario", 3);
            }
        }
        while(aux!=0);
// PROCESSA OS DADOS.

        textpd[0] = onibus.convertepd(embarque);
        textpd[1] = onibus.convertepd(destino);
        tempo = calltempo();
        hora = tempo[0];
        min= tempo [1];
               if((embarque>3)||(destino>3))
            {

            if((embarque==6)&&(destino!=5))
                    {
                        transporte1 = onibus.consultaonibus(embarque, destino, hora, min, onibus1);
                        text1 = converte(transporte1);
                    }
            if((embarque==4)&&((destino!=5)&&(destino!=6)))
                    {
                        transporte1 = onibus.consultaonibus(embarque, destino, hora, min, onibus1);
                        text1 = converte(transporte1);
                    }
            }
        else
            {
            if ((embarque==3)||(destino==3))
            {
                if((embarque==2)&&(((hora==15)&&(min>=36))&&((hora==15)&&(min<=1))))
                {
                    int horae = 17;
                    int mine = 5;
                    transporte1 = onibus.consultaonibus(embarque, destino, horae, mine, onibus1);

                }
                else
                {
                    if (((embarque == 1) && (destino == 3)) && (((hora == 14) && (min >= 26)) && ((hora == 14) && (min <=50 ))))
                    {
                    int horae = 16;
                    int mine = 40;
                    transporte1 = onibus.consultaonibus(embarque, destino, horae, mine, onibus1);
                    }
                    else
                    {
                    transporte1 = onibus.consultaonibus(embarque, destino, hora, min, onibus1);
                    }
                }
                text1 = converte(transporte1);
            }
            else
            {
                if((embarque==2)&&(((hora==15)&&(min>=36))&&((hora==16)&&(min<=1))))
                {
                    int horae = 17;
                    int mine = 5;
                    transporte1 = onibus.consultaonibus(embarque, destino, horae, mine, onibus1);
                }
                else
                {
                 transporte1 = onibus.consultaonibus(embarque, destino, hora, min, onibus1);
                }
               text1 = converte(transporte1);
               transporte2 = onibus.consultaonibus(embarque, destino, hora, min, onibus2);
               text2 = converte(transporte2);

            }
            }

            transporte3  = onibus.consultaonibus(embarque, destino, hora, min, onibus3);
            text3 = converte(transporte3);

            ted[0] = onibus.tempodeespera(hora,min,transporte1[2],transporte1[3]);
            ted[1] = onibus.tempodeespera(hora,min,transporte2[2],transporte2[3]);
            ted[2] = onibus.tempodeespera(hora,min,transporte3[2],transporte3[3]);

            JOptionPane.showMessageDialog(null, " Onibus  : Embarque em "+textpd[0]+"  / Previsao de Chegada em "+textpd[1]+"  \n\n"
                                              + " Onibus 1:   "+text1[0]+" / "+text1[1]+" \n"
                                              + " Tempo de espera pelo onibus 1: "+ted[0]+"\n"
                                              + " Onibus 2:   "+text2[0]+" / "+text2[1]+" \n"
                                              + " Tempo de espera pelo onibus 2: "+ted[1]+"\n"
                                              + " Onibus 3:   "+text3[0]+" / "+text3[1]+" \n"
                                              + " Tempo de espera pelo onibus 3: "+ted[2]+"\n", "Hora: "+tempo[0]+ ":"+tempo[1]+" - Transporte Universitario", 1);

        S = JOptionPane.showInputDialog(null, "Deseja fazer uma nova consulta? S/N ","Hora: "+tempo[0]+ ":"+tempo[1]+" - Transporte Universitario", 1);

        }
       while(S.equalsIgnoreCase(S1));

   JOptionPane.showMessageDialog(null, "Boa Viagem!");
}
public static int[] calltempo()
        {

        int[] tempo = new int[2];
        String hora = "HH";
        String minuto = "mm";
        SimpleDateFormat df1 = new SimpleDateFormat(hora);
        SimpleDateFormat df2 = new SimpleDateFormat(minuto);
        df1.setTimeZone(TimeZone.getTimeZone("Brazil/East"));
        tempo[0] = Integer.parseInt(df1.format(new Date()));
        tempo[1] = Integer.parseInt(df2.format(new Date()));

        return tempo;

    }

public static String[] converte(int transporte[]){
    String text[] = new String [2];
    String tempo[] = new String[4] ;
    NumberFormat nf = NumberFormat.getInstance();
    nf.setMinimumIntegerDigits(2);
    int i;
    for(i=0;i<4;i++)
    {
       tempo[i] = nf.format(transporte[i]);
    }
            text[0] = tempo[0]+":"+tempo[1];
            text[1] = tempo[2]+":"+tempo[3];

    return text;
    }

public static int[] zera4l()
{
    int m[] = new int [4];
    int i;
    for(i=0;i<4;i++)
    {
        m[i]=0;
    }
    return m;
}
}*/
