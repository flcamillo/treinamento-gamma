package aula06.exercicio01;

public class Senior extends Funcionario {
    // atributos
    private float bonus;

    // define um novo construtor para o Senior onde é necessário informar seu bonus
    // para cada 10h trabalhadas
    public Senior(String nome, float valorHora, float bonus) {
        super(nome, valorHora);
        this.bonus = bonus;
    }

    // retorna o salario bonus considenrando que ele só ocorre a cada 10h trabalhadas
    public float salarioBonus() {
        float resto = super.getHorasTrabalhadas() % 10;
        float unidades = (super.getHorasTrabalhadas() - resto) / 10;
        return unidades * bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    // redefine o metodo salario para considerar a soma do valor bonus
    public float salario() {
        return super.salario() + salarioBonus();
    }

    @Override
    // redefine o metodo exibir para personalizar a exibição do funcionario senior
    public String exibir() {
        return String.format("%s (Senior) trabalhou %.2fh e receberá R$ %.2f com bonus de R$ %.2f, total a receber R$ %.2f",
                super.getNome(), super.getHorasTrabalhadas(), super.salario(), salarioBonus(), salario());
    }

}