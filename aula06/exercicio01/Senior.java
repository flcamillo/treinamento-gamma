package aula06.exercicio01;

public class Senior extends Funcionario {
    // atributos
    private float bonus;

    /**
     * Define o construtor do funcionario senior com seu nome, valor hora e valor
     * bonus que será recebido a cada 10h trabalhadas
     * 
     * @param nome
     * @param valorHora
     * @param bonus
     */
    public Senior(String nome, float valorHora, float bonus) {
        super(nome, valorHora);
        if (bonus >= 0) {
            this.bonus = bonus;
        }
    }

    /**
     * Calcula o salario bonus que sera recebido a cada 10h trabalhadas
     * 
     * @return valor bonus que sera recebido
     */
    public float salarioBonus() {
        float resto = super.getHorasTrabalhadas() % 10;
        float unidades = (super.getHorasTrabalhadas() - resto) / 10;
        return unidades * bonus;
    }

    /**
     * Retorna o valor do bonus
     * 
     * @return valor
     */
    public float getBonus() {
        return bonus;
    }

    /**
     * Define o valor do bonus
     * 
     * @param bonus
     */
    public void setBonus(float bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        } else {
            this.bonus = 0;
        }
    }

    /**
     * Redefine o calculo do salario para o funcionario senior
     * 
     * @return salario + bonus
     */
    @Override
    public float salario() {
        return super.salario() + salarioBonus();
    }

    /**
     * Redefine o metodo exibir para personalizar a exibição do funcionario senior
     * 
     * @return nome, horas trabalhdas, valor hora e bonus
     */
    @Override
    public String exibir() {
        return String.format(
                "%s (Senior) trabalhou %.2fh e receberá R$ %.2f com bonus de R$ %.2f, total a receber R$ %.2f",
                super.getNome(), super.getHorasTrabalhadas(), super.salario(), salarioBonus(), salario());
    }

}