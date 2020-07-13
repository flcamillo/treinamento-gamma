package aula06.exercicio02;

import java.util.ArrayList;
import java.util.Date;

public class GerenciadorAnimais {

    // lista para armazenar os animais cadastrados
    ArrayList<Animal> animais = new ArrayList<>();

    /**
     * Adiciona um animal
     * 
     * @param animal
     */
    public void Add(Animal animal) {
        animais.add(animal);
    }

    /**
     * Adiciona um animal, o animal adicionado é retornado
     * 
     * @param nome
     * @param raca
     * @param cor
     * @param nascimento
     * @return animal adicionado
     */
    public Animal Add(String nome, String raca, String cor, Date nascimento) {
        Animal animal = new Animal(nome, raca, cor, nascimento);
        animais.add(animal);
        return animal;
    }

    /**
     * Adiciona um animal associando ao seu proprietario, o animal adicionado é retornado
     * 
     * @param nome
     * @param raca
     * @param cor
     * @param nascimento
     * @param nomeProprietario
     * @param telefone
     * @return animal adicionado
     */
    public Animal Add(String nome, String raca, String cor, Date nascimento, String nomeProprietario, String telefone) {
        Animal animal = new Animal(nome, raca, cor, nascimento);
        Proprietario proprietario = new Proprietario(nomeProprietario, telefone);
        animal.setProprietario(proprietario);
        animais.add(animal);
        return animal;
    }

    /**
     * Adiciona um animal associando ao seu proprietario, o animal adicionado é retornado
     * @param animal
     * @param proprietario
     */
    public void Add(Animal animal, Proprietario proprietario) {
        animal.setProprietario(proprietario);
        animais.add(animal);
    }

    /**
     * Remove um animal
     */
    public boolean Remove(Animal animal) {
        return animais.remove(animal);
    }

    /**
     * Remove um animal pelo seu nome
     * @param nome
     * @return true or false se a remoção foi realizada
     */
    public boolean Remove(String nome) {
        for (Animal animal : animais) {
            if (animal.getNome().equals(nome)) {
                return animais.remove(animal);
            }
        }
        return false;
    }

    /**
     * Procura um animal pelo seu nome
     */
    public Animal ProcurarAnimal(String nome) {
        for (Animal animal : animais) {
            if (animal.getNome().equals(nome)) {
                return animal;
            }
        }
        return null;
    }

    /**
     * Procura todos os animais de um proprietario
     * @param nome
     * @return uma lista de animais encontrados
     */
    public ArrayList<Animal> ProcurarProprietario(String nome) {
        ArrayList<Animal> encontrados = new ArrayList<>();
        for (Animal animal : animais) {
            Proprietario proprietario = animal.getProprietario();
            if (proprietario != null && proprietario.getNome().equals(nome)) {
                encontrados.add(animal);
            }
        }
        return encontrados;
    }

    /**
     * Procura todos os animais de uma raça
     * @param raca
     * @return uma lista de animais encontrados
     */
    public ArrayList<Animal> ProcurarRaca(String raca) {
        ArrayList<Animal> encontrados = new ArrayList<>();
        for (Animal animal : animais) {
            if (animal.getRaca().equals(raca)) {
                encontrados.add(animal);
            }
        }
        return encontrados;
    }

    /**
     * Exibe no terminal a lista de animais cadastrados
     */
    public void listar() {
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }
}