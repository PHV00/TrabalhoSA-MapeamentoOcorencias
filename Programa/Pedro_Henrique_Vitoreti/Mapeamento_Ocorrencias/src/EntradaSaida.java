import java.util.Scanner;

public class EntradaSaida {
    public static int inserirValorInt(String msg)//recebe o dado em string e converte para o formato desejado(no caso int)
    {  
        return Integer.parseInt(inserirValorString(msg));
    }
    
    public static boolean inserirValorBoolean(String msg)
    {
        return Boolean.parseBoolean(inserirValorString(msg));
    }
    
    public static String inserirValorString(String msg)//apenas pega o dado
    {
        boolean erro=false;
        String leitura="";
        do{
            System.out.println(msg);
            try{
                leitura=System.console().readLine();
                erro=false;
            }catch(Exception e)
            {
                System.out.println("Erro! tipo inválido");
                erro=true;
            }
        }while(erro==true);
        return leitura;
    }
    
    public static void mostrarMsg(String msg) {
        System.out.println(msg);
    }

    /*public static Object inserirDados(String tipo)
    {
        Scanner scanf= new Scanner(System.in);
        switch (tipo.toLowerCase()) {
            case "boolean":
                boolean dadoBoolean=scanf.nextBoolean();
                return dadoBoolean;
            case "double":
                double dadodouble=scanf.nextDouble();
                return dadodouble;
            case "int":
                int dadoInt=scanf.nextInt();
                return dadoInt;
            case "string":
                String dadoString=scanf.nextLine();
                return dadoString;
            default:
                return "ERROR NO TIPO PASSADO";
        }
    }
    */
}
