import java.util.ArrayList;

public class UsuarioCrud {
    private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();//checar o private 

    public void cadastrarUsuario()
    {
        int cpf=EntradaSaida.inserirValorInt("Digite seu cpf:");
        int telefone=EntradaSaida.inserirValorInt("Digite seu telefone:");
        String nome=EntradaSaida.inserirDado("Digite seu nome completo:");
        int senha=EntradaSaida.inserirValorInt("Digite sua senha:"); 
        Usuario usuario= new Usuario(cpf, nome, telefone, senha);
        this.listaUsuarios.add(usuario);
    }
    public void encontrarUsuario(String nome)
    {
        for (Usuario usuario : listaUsuarios) {
            if(nome==listaUsuarios.set(0, usuario).toString())
            {

            }
        }
    }

}
