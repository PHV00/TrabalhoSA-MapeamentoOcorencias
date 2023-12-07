import java.util.ArrayList;
import java.util.List;

import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;

public class Mapa {
    //diretorio da imagem
    public final static String IMG = "Mapa.png";
    public final static String IMGdiretorio = "D:\\Users\\pedro_vitoreti\\Desktop\\TrabalhoSA-MapeamentoOcorencias\\Programa\\Mapeamento_Ocorrencias\\src\\Mapa.png";
    
    public final static int altura=40;
    public final static int largura=179;

    private static List<String> mapaCaractere = new ArrayList<String>();
    private static List<Integer> mapaCaractereNumeros = new ArrayList<Integer>();
    private int[][] mapaNumerico = new int[altura][largura];//tamanho tela alturaxlargura= 40x 132 o vetor começa no zero, rever



    public static void testeTamanhoTela()
    {
        for(int i=0;i<altura;i++){
            String nome="01020304050607080910111213141516171819202122232425267282030313233343536373839404142434445464748495051525354555657585960/01020304050607080910111213141516171819202122232425267282030";
            System.out.println(nome);
        }
    }

    public void testeMapa()
    {
        //limpa/zeratudo
        this.zerarTela();
        //montarmapa
        this.montarMapa();
        //mostrar matrix numerica
        this.mostrarMapa();
        //mostra matrix caractere
        this.mostrarMapaCaractere();
    }
    public void zerarTela()
        {
            for(int i=0;i<altura;i++)
            {
                for(int j=0;j<largura;j++)
                {
                    mapaNumerico[i][j]=0;
                }
            }
        }
    
    public void montarMapa()
    {   //linhas
        this.preencherLinha(10-1);
        this.preencherLinha(20-1);
        this.preencherLinha(30-1);
        //colunas
        this.preencherColuna(10-1);
        this.preencherColuna(20-1);
        this.preencherColuna(30-1);
        this.preencherColuna(70-1);
        this.preencherColuna(80-1);
        this.preencherColuna(150-1);
        this.preencherColuna(90-1);
        this.preencherColuna(120-1);
        this.limpaRuaLinha(10);
        this.limpaRuaLinha(20);
        this.limpaRuaLinha(30);
        this.mapaNumerico[30][30]=4;
    }

    public void limpaRuaColuna(int cordenada)
    {
            for(int j=cordenada;j<altura;j++)
            {
                if(j==cordenada) mapaNumerico[cordenada][j]=0;
            }
    }
    public void limpaRuaLinha(int cordenada)
    {
        for(int j=0;j<largura;j++)
        {
            if(mapaNumerico[cordenada][j]!=0) mapaNumerico[cordenada][j]=0;
        }
    }
    public void preencherColuna(int cordenada)
    {
        for(int i=0;i<altura;i++)//trocar para responsiva a grossura
        {
            for(int j=cordenada;j<cordenada+3;j++)
            {
                if(j==cordenada+1) mapaNumerico[i][j]=0;
                else mapaNumerico[i][j]=mapaNumerico[i][j]+2;
                if(mapaNumerico[i][j]==3&&mapaNumerico[i+2][j+2]==3)mapaNumerico[i][j]=0;
            }
        }
    }
    public void preencherLinha(int cordenada)
    {
        for(int i=cordenada;i<cordenada+3;i++)//trocar para responsiva a grossura
        {
            for(int j=0;j<largura;j++)
            {
                if(i==cordenada+1) mapaNumerico[i][j]=0;
                else mapaNumerico[i][j]=mapaNumerico[i][j]+1;
                if(mapaNumerico[i][j]==3&&mapaNumerico[i+2][j+2]==3)mapaNumerico[i][j]=0;
            }
        }
    }

    public void mostrarMapa() {
        String mapa="";
        for(int i=0;i<altura;i++)
        {
            for(int j=0;j<largura;j++)
            {
               mapa+=mapaNumerico[i][j];
            }
        }
        System.out.println(mapa);
    }

    public void mostrarMapaCaractere()
    {
       String mapa="";
        for(int i=0;i<altura;i++)
        {
            for(int j=0;j<largura;j++)
            {
               if(mapaNumerico[i][j]==0)mapa+=" ";
               if(mapaNumerico[i][j]==1)mapa+="=";
               if(mapaNumerico[i][j]==2)mapa+="|";
               if(mapaNumerico[i][j]==3)mapa+="+";
               if(mapaNumerico[i][j]==4)mapa+="\u001B[31m§\u001B[00m";
            }
        }
        System.out.println(mapa); 
    }

    public static void cadastrarMapa()
    {
          //  for(int i=0;i<39;i++)
        //  {
        //     for(int j=0;i<181;i++)
        //     {
        //         mapaNumerico[i][j]=1;
        //     }
        //  }
        //  for(int i=0;i<39;i++)
        //  {
        //     for(int j=0;i<181;i++)
        //     {
        //         mapaNumerico[i][j]=1;
        //     }
        //  }
    }
}
