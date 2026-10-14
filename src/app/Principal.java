package app;
import modelo.Carro;
import modelo.Garagem;
import modelo.Motorista;

public class Principal {
    public static void main (String[] args){
    //Marca, placa, modelo, int velocidade 
    Carro carro1 = new Carro("Ferrari", "1410HLNV", "Sport", 110);
    Carro carro2 = new Carro("Aston Martin","221BAKER", "SportHD",220);
    Carro carro3 = new Carro("Mercedes","MRTH12", "Hybrid", 330);

    carro1.acelerar();
    carro1.acelerar();
    carro2.frear();
    carro3.acelerar();
    carro3.acelerar();
    carro3.acelerar();

    Motorista motorista1 = new Motorista ("Charles", carro1);
    Motorista motorista2 = new Motorista ("Sherlock", carro2);

    Garagem garagem = new Garagem();
    garagem.estacionar(carro1);
    garagem.estacionar(carro2);
    garagem.estacionar(carro3);

    System.out.println("\n----- Motoristas -----\n");
    System.out.println(motorista1.getNome() + "-->" + motorista1.getCarro().getPlaca());
    System.out.println(motorista2.getNome() + "-->" + motorista2.getCarro().getPlaca());

    System.out.println();
    garagem.exibir();

    System.out.println("Total de carros criados: " + Carro.getQuantidade());


}}