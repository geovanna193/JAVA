package modelo;
public class Carro{
    private String placa;
    private String marca;
    private String modelo;
    private int velocidade;
    private static int quantidade = 0;

    public Carro (String marca, String placa, String modelo, int velocidade) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.velocidade  = velocidade;
        quantidade++;
        
    }
    public void acelerar(){
        velocidade += 10;
    }
    public void frear(){
        velocidade -= 10;
    }
    public void exibir(){
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade);
    }

    public String getMarca(){
        return marca;
    }

    public String getPlaca(){
        return placa;
    }

    public String getModelo(){
        return modelo;
    }

    public int getVelocidade(){
        return velocidade;
    }
     public static int getQuantidade(){
        return quantidade;
     }
}
