package src.app;
import modelo.Carro;
import modelo.Garagem;
import modelo.Motorista;

public class principal {
    public static void main (string[] args){
    //Marca, placa, modelo, int velocidade 
    Carro carro1 = new Carro(marca:"Ferrari", placa:"1410HLNV", modelo:"Sport", velocidade: 110);
    Carro carro2 = new Carro(marca: "Aston Martin", placa: "221BAKER", modelo: "SportHD",220);
    Carro carro3 = new Carro(marca: "Mercedes", placa:"MRTH12", modelo: "Hybrid", 330);

    carro1.acelerar();
    carro1.acelerar();
    carro2.frear();
    carro3.acelerar();
    carro3.acelerar();
    carro3.acelerar();

    Motorista motorista1 = new Motorista (nome: "Charles", carro1);
    Motorista motorista1 = new Motorista (nome: "Sherlock", carro2);

    Garagem garagem = new Garagem();
    garagem.estacionar(carro1);
    garagem.estacionar(carro2);
    garagem.estacionar(carro3);

    system.out.println("\n----- Motoristas -----\n");
    System.out.println(motorista1.getNome() + "-->" + motorista1.getCarro()getPlaca());
    System.out.println(motorista2.getNome() + "-->" + motorista2.getCarro()getPlaca());

    System.out.println();
    garagem.exibir();

    System.out.println("Total de carros criados: " + Carro.getQuantidade());


}}