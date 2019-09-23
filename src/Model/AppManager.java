/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Carlos Gomez
 */
public enum AppManager {
    INSTANCE; 
    private LinkedList<Player> players;
    private LinkedList<String> luck;
    private LinkedList<String> communityBox;
    private Random random;
    
    AppManager() {
        players = new LinkedList<>();
        luck = new LinkedList<>();
        communityBox = new LinkedList<>();
        random = new Random();
        init();
    }

    public LinkedList<Player> getPlayers() {
        return players;
    }

    public Player getPlayers(int position) {
        return players.get(position);
    }
    
    public void addPlayer(Player player){
        players.add(player);
    }

    private void init() {
        addLuck();
        addCommunityBox();
    }

    private void addLuck() {
        String s1 = "Saia Livre da cadeia";
        luck.add(s1);
        
        String s2 = "Venda o seu bilhete de temporada na casa da musica num leilao online . Recebe 500k";
        luck.add(s2);
        
        String s3 = "Construa uma piscina no seu apartamento no topo de um edificio no algarve. Pague 200k";
        luck.add(s3);
        
        String s4 = "Pague as propinas do colégio no valor de 1.5M";
        luck.add(s4);
        
        String s5 = "Avance para a casa de partida";
        luck.add(s5);
        
        String s6 = "Transito na hora de ponta! Recue 3 casas";
        luck.add(s6);
        
        String s7 = "O aumento do imposto sobre a propriedade sobe e afeta todas as suas propriedades. Pague 400k por cada apartamento e 1.15M por cada Hotel";
        luck.add(s7);
        
        String s8 = "Vai para a cadeia";
        luck.add(s8);
        
        String s9 = "Convide decoradores famosos para decorarem as suas propriedades. Por casa apartamento pague 250K"
                + "por cada Hotel pague 1M";
        luck.add(s9);
        
        String s10 = "Decide investir em acçoes. Avançe para Lisboa - Bélem e se passar pela casa de partida recebe 2M";
        luck.add(s10);
        
        String s11 = "Ganhou na Lotaria recebe 1M";
        luck.add(s11);
        
        String s12 = "Foi multado por usar o telemovel ao volante. Pague 150K";
        luck.add(s12);
        
        String s13 = "Apanhe o aviao no aeroporto da madeira se passar pela casa de partida receba 2M";
        luck.add(s13);
        
        String s14 = "Avance para Aveiro. Se passar na casa de partida receba 2M";
        luck.add(s14);
        
        String s15 = "Vende as suas acçoes com lucro. Recebe 1.5M";
        luck.add(s15);
        
        String s16 = "Va passear e ver a paisagem. Avance para Viana do castelo. Se passar na casa de partida receba 2M";
        luck.add(s16);
    }

    private void addCommunityBox() {
        String s1 = "Recebe 1M de lucros pelo aluguer do seu jato privado";
        communityBox.add(s1);
        
        String s2 = "Va directamente para a cadeia";
        communityBox.add(s2);
        
        String s3 = "Recebe dinheiro do seguro do seu carro. Recebe 250K";
        communityBox.add(s3);
        
        String s4 = "Ganha um programa de televisao. Recebe 100k";
        communityBox.add(s4);
        
        String s5 = "Pague 500k por um fim de semana num hotel de 5 estrelas";
        communityBox.add(s5);
        
        String s6 = "Pague 1M para alugar a casa da musica para uma festa privada.";
        communityBox.add(s6);
        
        String s7 = "Parte um aquario no oceanario. Pague 500k";
        communityBox.add(s7);
        
        String s8 = "Receba devoluçao de dinheiro do IRS. Recebe 500k";
        communityBox.add(s8);
        
        String s9 = "A sua companhia de internet obtem bons resultados. Recebe 2M";
        communityBox.add(s9);
        
        String s10 = "Pague uma multa de 100k ou retire uma carta da sorte";
        communityBox.add(s10);
        
        String s11 = "Saia livre da cadeia";
        communityBox.add(s11);
        
        String s12 = "Avance para a casa de partida";
        communityBox.add(s12);
        
        String s13 = "Os seus colegas alugam o seu monte em Evora durante 1 semana. Recebe 100k de cada jogador";
        communityBox.add(s13);
        
        String s14 = "Regresse a castelo Branco para comprar bilhetes para um concerto";
        communityBox.add(s14);
        
        String s15 = "Compra uma aguarela em Leiria e vende-a com um grande lucro. Recebe 200k";
        communityBox.add(s15);
        
        String s16 = "Herda 3M mas tem de pagar um grande imposto sucessorio. Recebe 1M";
        communityBox.add(s16);
    }

    public LinkedList<String> getLuck() {
        return luck;
    }

    public LinkedList<String> getCommunityBox() {
        return communityBox;
    }
    
    public String getLuck(int position) {
        return luck.get(position);
    }
    
    public String getRandomLuck(){
        int generateNumber = random.nextInt(16);
        
        return getLuck(generateNumber);
    }
    
    public String getRandomCommunityBox(){
        int generateNumber = random.nextInt(16);
        
        return getCommunityBox(generateNumber);
    }

    public String getCommunityBox(int position) {
        return communityBox.get(position);
    }
    
    
    
}
