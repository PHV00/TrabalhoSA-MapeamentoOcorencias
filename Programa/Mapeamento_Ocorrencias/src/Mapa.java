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
       //pimeirabarra transversal
       this.primeiraTranversal();
       //segunda Transversal 
       this.segundaTransversal();
       //mostrar matrix
       this.mostarMapa();
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
    public void segundaTransversal() {
        int pInicial=22;
        for(int i=pInicial;i<pInicial+4;i++)
         {
            for(int j=0;j<largura;j++)
            {
                mapaNumerico[i][j]=1;
            }
        }
    }

    public void primeiraTranversal() {
       int pInicial=9;
        for(int i=pInicial;i<pInicial+4;i++)
        {
            for(int j=0;j<largura;j++)
            {
                mapaNumerico[i][j]=1;
            }
        }
    }

    public void mostarMapa() {
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
