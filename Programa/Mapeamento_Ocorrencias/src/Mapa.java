import java.util.ArrayList;

public class Mapa {
    //diretorio da imagem
    //caso queira prociguir na ideia de ler uma imagem e transofrmar em vetor
    //public final static String IMG = "Mapa.png";
    //public final static String IMGdiretorio = "D:\\Users\\pedro_vitoreti\\Desktop\\TrabalhoSA-MapeamentoOcorencias\\Programa\\Mapeamento_Ocorrencias\\src\\Mapa.png";
    
    //fazer uma lista de char e ou string para poder manipular os pontos especificos do mapa de caracteres que é mostrado na tela

    public final static int altura=40;
    public final static int largura=179;

    private ArrayList<Ponto> listaPontos = new ArrayList<Ponto>();
    private int[][] mapaNumerico = new int[altura][largura];//tamanho tela alturaxlargura= 40x 132 o vetor começa no zero, rever
    private String[][] mapaString= new String[altura][largura];

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
        this.zerarMapa();
        //montarmapa
        this.montarMapa();
        //mostrar matrix numerica
        //this.mostrarMapa();
        //mostra matrix caractere
        this.mostrarMapaCaractere();
    }
    public void zerarMapa()
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
    {   
        this.preencherTransversalDireitaBaixo(10,10);
        //linhas
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
        //this.mapaNumerico[30][30]=4;
        this.adicionarPontoLista(10,10,"vermelho","&");
    }
    public void adicionarPontoMapa()
    {
        for(int k=0;k<this.listaPontos.size();k++)
        {
            Ponto ponto=this.listaPontos.get(k);
            mapaString[ponto.getX()][ponto.getY()]=ponto.getCor()+ponto.getCaractere();
        }
    }
    public void mostrarMapa() {
        //funciona!!!!!!!!!!!
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

    public void adicionarPontoLista(int x,int y, String cor,String caractere)
    {
        this.listaPontos.add(new Ponto(x,y,cor,caractere));
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

    public void preencherTransversalDireitaBaixo(int cordenadaEsquerda,int cordenadaDireita)
    {
        for(int i=cordenadaEsquerda,j=cordenadaDireita;i<cordenadaDireita;i++,j--)
        {
            mapaNumerico[j][i]=5;
        }
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
               if(mapaNumerico[i][j]==4)mapa+="§";
               if(mapaNumerico[i][j]==5)mapa+="\\";
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
