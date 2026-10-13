package src.modelo;
public class Motorista{
    private String nome;
    private Carro carro;

    public Motorista(String nome, Carro carro){
        this.nome = nome;
        this.carro = carro;
    }
    
    public void trocarCarro(Carro novoCarro){
        this.carro = novoCarro;
    }
    public void exibir(){
        Syatem.out.println("Motorista: " + this.nome);
        if(this.carro != null){
            System.out.println("Carro: ");
            this.carro.exibir();
        }
        else{
            System.out.println("Carro: nenhum")
        }
    }
    public String getNome(){
        return nome;
    }
    public Carro getCarro(){
        return carro;
    }
}