package aula04.exercicio07;

/**
 * Define um veiculo qualquer
 */
public class Veiculo {
    // atributos do veículo
    String modelo, marca;
    float consumo;
    // construtor principal
    public Veiculo(String modelo, String marca, float consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }
    /**
     * Retorna os dados basicos do veículo
     * @return marca do veículo, modelo e consumo
     */
    public String info() {
        return this.marca + " - " + this.modelo + " - Consumo: " + String.format("%.2f Km/L", this.consumo);
    }
    /**
     * Retorna o consumo por litro do veículo
     * @return quantidade de KM por litro
     */
    public float Consumo() {
        return consumo;
    }
}