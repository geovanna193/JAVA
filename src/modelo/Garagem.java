package modelo;
public class Garagem {
    private Carro carro1;
    private Carro carro2;
    private Carro carro3;
    public void estacionar(Carro carro){
        if (this.carro1 == null) {
            this.carro1 = carro;
        }
        else if (this.carro2 == null) {
            this.carro2 = carro;
        }
        else if (this.carro3 == null) {
            this.carro3 = carro;
        }
        else {
            System.out.println("Gragem cheia!");
        }
    }
    public void exibir(){
        System.out.println("----- Garagem -----");
        if (carro1 != null){
            System.out.println("1." + carro1.getPlaca() + "-" + carro1.getMarca() + " " + carro1.getModelo());
        }
        if (carro2 != null){
            System.out.println("1." + carro2.getPlaca() + "-" + carro2.getMarca() + " " + carro2.getModelo());
        }
        if (carro3 != null){
            System.out.println("1." + carro3.getPlaca() + "-" + carro3.getMarca() + " " + carro3.getModelo());
}}
}
