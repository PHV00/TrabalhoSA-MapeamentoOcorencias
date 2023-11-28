import java.util.Scanner;

public class EntradaSaida {
    public static int inserirValorInt(String msg)//recebe o dado em string e converte para o formato desejado(no caso int)
    {  
        return Integer.parseInt(inserirDado(msg));
    }
    public static String inserirDado(String msg)//apenas pega o dado
    {
        Scanner scanf= new Scanner(System.in);
        System.out.println(msg);
        return scanf.nextLine();
    }

      /* 
    public static void inserirDados(String tipo)
    {
        Scanner scanf= new Scanner(System.in);
        switch (tipo.toLowerCase()) {
            case "boolean":
                scanf.nextBoolean();
                break;
            case "double":
                double dado=scanf.nextDouble();
                return dado;
            case "int":
                scanf.nextInt();
                break;
            case "string":
                scanf.nextLine();
                break;
            default:
                System.out.println("ERROR NO TIPO PASSADO");
                break;
        }
    }*/
}
