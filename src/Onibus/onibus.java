/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Onibus;

public class onibus {


public static int[][] memoriadadoso1()
    {
    int o1[][]= new int [24][60];
    int i;
    int j;
    for(i=0;i<23;i++)
    {
        for(j=0;j<59;j++)
        {
          o1[i][j]= 0;

        }
    }
    o1[7][0]= 2;
    o1[7][6]= 1;
    o1[7][10]= 1;
    o1[7][16]= 2;
    o1[7][22]= 1;
    o1[7][40]= 2;
    o1[7][45]= 1;
    o1[7][55]= 2;
    o1[8][0]= 3;
    o1[8][10]= 1;
    o1[8][20]= 2;
    o1[8][25]= 3;
    o1[8][35]= 1;
    o1[8][45]= 2;
    o1[8][50]= 3;

    o1[9][0]= 1;
    o1[9][10]= 2;
    o1[9][15]= 3;
    o1[9][25]= 1;
    o1[9][35]= 2;
    o1[9][40]= 3;
    o1[9][50]= 1;

    o1[10][0]= 2;
    o1[10][5]= 3;
    o1[10][15]= 1;
    o1[10][25]= 2;
    o1[10][30]= 3;
    o1[10][40]= 1;
    o1[10][50]= 2;
    o1[10][55]= 3;

    o1[11][05]= 1;
    o1[11][15]= 2;
    o1[11][20]= 3;
    o1[11][30]= 1;
    o1[11][40]= 2;
    o1[11][45]= 3;
    o1[11][55]= 1;


    o1[12][5]=2 ;
    o1[12][10]=3 ;
    o1[12][20]= 1;
    o1[12][30]= 2;
    o1[12][35]= 3;
    o1[12][45]= 1;
    o1[12][55]= 2;

    o1[13][0]= 3;
    o1[13][10]= 1;
    o1[13][20]= 2;
    o1[13][25]= 3;
    o1[13][35]= 1;
    o1[13][45]= 2;
    o1[13][50]= 3;

    o1[14][0]= 1;
    o1[14][10]= 2;
    o1[14][15]= 3;
    o1[14][25]= 1;
    o1[14][35]= 2;
    o1[14][40]= 3;
    o1[14][50]= 1;

    o1[15][0]= 2;
    o1[15][5]= 7; // começo do recesso do onibus

    o1[16][10]= 6;
    o1[16][25]= 4;
    o1[16][40]= 1;
    o1[16][45]= 2;

    o1[16][50]= 7; // começo do recesso do onibus

    o1[17][5]= 2;
    o1[17][10]= 3;
    o1[17][20]= 1;
    o1[17][30]= 2;
    o1[17][35]= 3;
    o1[17][45]= 1;
    o1[17][55]= 2;

    o1[18][0]= 3;
    o1[18][10]= 1;
    o1[18][20]= 2;
    o1[18][25]= 3;
    o1[18][35]= 1;
    o1[18][45]= 2;
    o1[18][55]= 1;

    o1[19][5]= 2;
    o1[19][15]= 1;
    o1[19][20]= 2;
    o1[19][30]= 1;
    o1[19][35]= 2;
    o1[19][45]= 1;
    o1[19][50]= 2;

    o1[19][55]=7;
    o1[20][0]= 7;
    o1[20][5]= 7;
    o1[20][10]= 7;
    o1[20][15]= 7;

    o1[20][20]= 2;
    o1[20][30]= 1;
    o1[20][35]= 2;
    o1[20][45]= 1;
    o1[20][50]= 2;

    o1[21][0]= 1;
    o1[21][5]= 2;
    o1[21][15]= 1;
    o1[21][20]= 2;
    o1[21][30]= 1;
    o1[21][35]= 2;
    o1[21][45]= 1;
    o1[21][50]= 2;

    o1[22][0]= 2;
    o1[22][6]= 1;
    o1[22][10]= 1;
    o1[22][16]= 2;
    o1[22][22]= 1;
    o1[22][26]= 1;
    o1[22][32]= 2;
    o1[22][38]= 1;

    o1[23][0]= 1;
    o1[23][5]= 2;
    o1[23][10]= 2;
    o1[23][20]= 1;
    o1[23][25]= 2;
    o1[23][35]= 1;
    o1[23][40]=7;
    return o1;

}

public static int[][] memoriadadoso2()
    {
    int o2[][]= new int [24][60];
    int i;
    int j;
    for(i=0;i<23;i++)
    {
        for(j=0;j<59;j++)
        {
          o2[i][j]= 0;

        }
    }
	o2[7][05]=1 ;
	o2[7][10]=2 ;
	o2[7][20]=1 ;
	o2[7][25]=2 ;
	o2[7][35]=1 ;
	o2[7][40]=2 ;
	o2[7][50]=1 ;
	o2[7][55]=2 ;

	o2[8][00]=3 ;
	o2[8][10]=1;
	o2[8][20]=2 ;
	o2[8][25]=3 ;
	o2[8][35]=1 ;
	o2[8][45]=2 ;
	o2[8][50]=3 ;


	o2[9][00]=2;
	o2[9][10]=1;
	o2[9][15]=2;
	o2[9][30]=1;
	o2[9][35]=2;
	o2[9][45]=1;
	o2[9][50]=2;

	o2[10][00]=1;
	o2[10][05]=2;
	o2[10][20]=1;
	o2[10][25]=2;
	o2[10][35]=1;
	o2[10][40]=2;
	o2[10][50]=1;
	o2[10][55]=2;

	o2[11][00]=7;

	o2[11][25]=7;
	o2[11][30]=2;
	o2[11][40]=1;
	o2[11][45]=2;
	o2[11][55]=1;


	o2[12][00]=2;
	o2[12][10]=1;
	o2[12][15]=2;
	o2[12][30]=1;
	o2[12][35]=2;
	o2[12][45]=1;
	o2[12][50]=2;

	o2[13][00]=1;
	o2[13][05]=2;
	o2[13][20]=1;
	o2[13][25]=2;
	o2[13][35]=1;
	o2[13][40]=2;
	o2[13][50]=1;
	o2[13][55]=2;

	o2[14][00]=1;
	o2[14][05]=2;
	o2[14][15]=1;
	o2[14][20]=2;
	o2[14][35]=1;
	o2[14][40]=2;
	o2[14][45]=7;

	o2[15][25]=7;
	o2[15][30]=2;
	o2[15][40]=1;
	o2[15][45]=2;
	o2[15][55]=1;

	o2[16][00]=2;
	o2[16][10]=1;
	o2[16][15]=2;
	o2[16][25]=1;
	o2[16][30]=2;
	o2[16][40]=1;
	o2[16][45]=2;
	o2[16][55]=1;

	o2[17][00]=2;
	o2[17][10]=1;
	o2[17][15]=2;
	o2[17][25]=1;
	o2[17][30]=2;
	o2[17][45]=1;
	o2[17][50]=2;

	o2[18][00]=1;
        o2[18][05]=2;
        o2[18][15]=1;
        o2[18][20]=2;
        o2[18][35]=1;
        o2[18][40]=2;
        o2[18][50]=1;
        o2[18][55]=2;

	o2[19][05]=1;
        o2[19][10]=2;
        o2[19][20]=1;
        o2[19][25]=2;
        o2[19][35]=1;
        o2[19][40]=2;
        o2[19][45]=7;
        
        o2[20][25]=7;
        o2[20][30]=2;
        o2[20][40]=1;
        o2[20][45]=2;
        o2[20][55]=1;

	o2[21][00]=2;
        o2[21][10]=1;
        o2[21][15]=2;
        o2[21][25]=1;
        o2[21][30]=2;
        o2[21][40]=1;
        o2[21][45]=2;
        o2[21][55]=1;

	o2[22][00]=2;
        o2[22][10]=1;
        o2[22][15]=2;
        o2[22][25]=1;
        o2[22][30]=2;
        o2[22][40]=1;
        o2[22][45]=2;
        o2[22][55]=1;

	o2[23][00]=2;
        o2[23][10]=1;
        o2[23][15]=2;
        o2[23][25]=1;
        o2[23][30]=7;

return o2;
}

public static int[][] memoriadadoso3()
    {
    int o3[][]= new int [24][60];
    int i;
    int j;
    for(i=0;i<23;i++)
    {
        for(j=0;j<59;j++)
        {
          o3[i][j]= 0;

        }
    }

o3[7][0] =1;
o3[7][5] =2;
o3[7][10] =3;
o3[7][30] =4;
o3[7][50] =5;
o3[7][55] =6;

o3[8][10] =4;
o3[8][25] =1;
o3[8][30] =2;
o3[8][40] =3;
o3[8][55] =4;

o3[9][15] =5;
o3[9][20] =6;
o3[9][35] =4;
o3[9][55] =1;

o3[10][0] =2;
o3[10][10] =3 ;
o3[10][25] =4 ;
o3[10][45] =5 ;
o3[10][50] =6 ;

o3[11][10] =4;
o3[11][30] =1 ;
o3[11][35] =2 ;
o3[11][40] =7 ;

o3[12][10] =2 ;
o3[12][20] =3 ;
o3[12][35] =4 ;
o3[12][55] =5 ;

o3[13][0] =6 ;
o3[13][15] =4 ;
o3[13][30] =1 ;
o3[13][35] =2 ;
o3[13][45] =3 ;

o3[14][0] =4 ;
o3[14][20] =5 ;
o3[14][25] =6 ;
o3[14][40] =4 ;
o3[14][55] =1 ;

o3[15][0] =2;
o3[15][10]=1;
o3[15][15]=2;
o3[15][25] =1 ;
o3[15][30] =2 ;
o3[15][45] =1 ;
o3[15][50] =2 ;

o3[16][0] = 1;
o3[16][5] = 2;
o3[16][10] = 2;
o3[16][20] = 1;
o3[16][25] = 2;
o3[16][35] = 3;
o3[16][50] = 4;

o3[17][10] = 5;
o3[17][15] = 6;
o3[17][35] = 4;
o3[17][55] = 1;

o3[18][0] = 2;
o3[18][10] = 3;
o3[18][30] = 4;
o3[18][50] = 5;
o3[18][55] = 6;

o3[19][15] =4;
o3[19][35] =1;
o3[19][40] =2;
o3[19][45] =7;

o3[20][30] =2 ;
o3[20][40] =3 ;
o3[20][55] =4 ;

o3[21][15] =6 ;
o3[21][30] =3 ;
o3[21][45] =1 ;
o3[21][50] =2 ;
o3[21][55] =7 ;

o3[22][30] =2 ;
o3[22][35] =1 ;
o3[22][50] =4 ;

o3[23][10] =6 ;
o3[23][25] =4 ;
o3[23][35] =1 ;
o3[23][40] =2 ;
o3[23][45] =7 ;

return o3;
}

public static int[] consultaonibus(int embarque,int destino,int hora,int min,int onibustab[][])
    {
    int x[]= new int [4];
    int i =hora;
    int j =min;
    int aux1 =0;
    int aux2;
    do{
    aux2 =0;
    // DESCOBRIR A HORA QUE O ONIBUS VAI CHEGAR PARA EMBARQUE

      do
        {
            do
            {
                if (onibustab[i][j] == embarque)
                {
                    aux1 = embarque;
                     x[0] = i;
                     x[1] = j;
                }
                else
                {
                    if(j==59)
                    {
                        j = 0;
                            if(i==23)
                            {
                            i=7;
                            }
                            else
                            {
                            i = i + 1;
                            }
                    }
                    else
                    {
                        j=j+1;
                    }
                }

             }
            while (embarque != aux1);
            j= j+5;
            if (j>=60)
                {
                j= j -60;
                i=i+1;
                }
        }
        while (onibustab[i][j]==7);// para os casos em que os onibus nao estao disponiveis

        // DESCOBRIR A HORA QUE O ONIBUS VAI CHEGAR NO DESTINO

        i= x[0];
        j= x[1];
        do
        {
            if(onibustab[i][j]==embarque) // para o caso em há repetiçoes futuras do msm slocal de partida antees do destino
            {
            x[0] = i;
            x[1] = j;
            }

            if (onibustab[i][j] == destino)
            {
             aux1 = destino;
             x[2] = i;
             x[3] = j;
            }
            else
            {
                if(j==59)
                {
                j = 0;
                if(i==23)
                    {
                    i=7;
                    aux2=1;
                    }
                else{
                    i = i + 1;
                    }
                }
                else
                   {
                    j=j+1;
                    }
            }
        }
        while (destino != aux1);
    if(aux2==1)
    {
    i=7;
    j=0;

    }
   }
   while(aux2 == 1);
   return x;

}



public static String convertepd(int local){
    String text ="";

    switch(local)
    {
            case 1:
                text = "Terminal Leste";
                break;
            case 2:
                text = "Rua Abolição";
                break;
            case 3:
                text = "Catequese";
                break;
            case 4:
                text = "Atlantica";
                break;
            case 5:
                text = "Terminal SBC";
                break;
            case 6:
                 text = "Bloco Sigma";
                break;
    }

    return text;
    }

public static String tempodeespera(int hora,int min,int chegadahora,int chegadamin){
    String text = "";
    int h=0;
    int m=0;
    String sh= "s";
    String sm= "s";
    h = chegadahora - hora;
    m = chegadamin - min;
    if((chegadahora==0)&&(chegadamin==0))
    {
        text = " indisponivel";
    }
  else
  {
    if((h==0)||((chegadamin<min)&&((h==1)||(h==-1))))
    {
        if (m < 0)
            {
            m = chegadamin + (60 - min);
            }
        if(m==1)
            {
                sm ="";
            }
        text = m + " minuto"+sm;

    }
    else
    {
        if (h < 0)
        {
        h = chegadahora + (24 - hora );
        }
        if(m==0)
        {
           if(h==1)
           {
               sh="";
           }
           text = m + " hora"+sh;
        }
        else
        {
            if (m < 0)
            {
            m = chegadamin + (60 - min);
            }
            if(m==1)
            {
                sm ="";
            }
           if(h==1)
           {
               sh="";
           }
           text = h+" hora"+sh+" e "+m+" minuto"+sm;
        }
    }
  }
return text;

}
}