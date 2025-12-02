package HerancaPolimorfismo.Exercicios.Ex02;

public sealed abstract class Usuarios permits Atendente,Gerente,Vendedor {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean administradr = false;
    protected boolean logado;

    public Usuarios(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void realizarLogin(String email, String senha){
        if(logado){
            System.out.println("Você já está logado");
        }else{
            if(this.email.equals(email) && this.senha.equals(senha)){
                System.out.println("Seja bem vindo(a) "+nome);
                this.logado = true;
            }else{
                System.out.println("Ops... login errado, tente novamente!");
            }
        }
    }
    public void realizarLogof(){
        if(logado){
            System.out.println("Logof realizado com sucesso!");
            this.logado = false;
        }else{
            System.out.println("Você não está logado");
        }
    }

    public void alterarDados(String dado, String novoDado){
        if(dado.equals("nome")){
            System.out.println("Nome alterado com sucesso");
            this.nome = novoDado;
        }else if(dado.equals("email")){
            System.out.println("Email alterado com sucesso");
            this.email = novoDado;
        }else if(dado.equals("senha")){
            System.out.println("Senha alterado com sucesso");
            this.senha = novoDado;
        }else{
            System.out.println("Entrada errada!");
        }
    }

    public void consultarCaixa(Caixa caixa){
        if(caixa.isStatusCaixa()){
            System.out.println("O valor em caixa atual é de: "+caixa.getValorEmCaixa());
        }else{
            System.out.println("O caixa está fechado");
        }
    }
}
