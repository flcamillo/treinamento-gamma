package aula06.exercicio02;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Exercicio criar uma classe Animal e outra Proprietario, em seguida criar uma
 * classe Gerenciador para cadastro dos animais e proprietarios. Lista todos os
 * animais da lista, e listar os proprietarios de animais de uma determinada
 * raça.
 */
public class Exercicio02 {

    public static void main(String[] args) {
        
        // cria o gerenciador de animais
        GerenciadorAnimais gerenciador = new GerenciadorAnimais();

        // cria um calendario para gerar datas
        Calendar calendar = Calendar.getInstance();
        
        // cria um gato
        calendar.set(2020, 7, 13);
        Animal gato = gerenciador.Add("pipoca", "vira-lata", "branca", calendar.getTime());

        // cria um cachorro
        calendar.set(2020, 6, 13);
        Animal cachorro = new Animal("rex", "buldog", "marrom", calendar.getTime());
        gerenciador.Add(cachorro);
              
        // cria os donos dos animais
        Proprietario fabio = new Proprietario("Fabio", "1234-4321");
        Proprietario leandro = new Proprietario("Leandro", "7777-8888");
                
        // define o proprietario do gato e cachorro
        gato.setProprietario(fabio);
        cachorro.setProprietario(leandro);

        // cria um passaro e seu proprietario
        calendar.set(2019, 6, 13);
        Animal passaro = new Animal("loro", "papagaio", "verde e amarelo", calendar.getTime());
        Proprietario camillo = new Proprietario("Camillo", "5555-4444");
        gerenciador.Add(passaro, camillo);

        // cria um peixe e seu proprietario
        calendar.set(2018, 1, 1);
        Animal peixe = gerenciador.Add("ariel", "carpa", "laranja", calendar.getTime(), "Jose", "9999-8888");    
        
        // lista os animais
        System.out.println("Lista de animais no gerenciador:");
        gerenciador.listar();

        // procura o animal da raca buldog
        String filtro = "buldog";
        ArrayList<Animal> encontrados = gerenciador.ProcurarRaca(filtro);
        if (encontrados.size() == 0) {
            System.out.printf("Nenhum animal da raça '%s' foi encontrado.\n", filtro);
        } else {
            System.out.printf("Listando proprietarios dos animais da raça '%s'...\n", filtro);
            for (Animal animal : encontrados) {
                System.out.printf("%s dono de '%s'\n", animal.getProprietario(), animal.getNome());
            }
        }

        // remove o animal peixe
        if (gerenciador.Remove(peixe)) {
            System.out.printf("O animal %s da raça %s foi removido com sucesso.", peixe.getNome(), peixe.getRaca());
        } else {
            System.out.printf("O animal %s da raça %s não foi encontrado.", peixe.getNome(), peixe.getRaca());
        }

        // lista os animais após exclusão
        System.out.println("Lista após exclusão:");
        gerenciador.listar();
    }
}