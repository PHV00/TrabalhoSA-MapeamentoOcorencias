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

    public static Object inserirDados(String tipo)
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
}
