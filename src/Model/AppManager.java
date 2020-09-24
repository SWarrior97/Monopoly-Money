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
    private LinkedList<Propriety> proprieties;
    private Random random;
    
    AppManager() {
        players = new LinkedList<>();
        luck = new LinkedList<>();
        communityBox = new LinkedList<>();
        proprieties = new LinkedList<>();
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
        addProprieties();
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

    private void addProprieties() {
        //castanho
        Propriety p1 = new Propriety("Castelo Branco",600000, 20000, 100000, 300000, 900000, 1600000, 2500000, 500000, 500000, 300000, "Castanho");
        proprieties.add(p1);
        
        Propriety p2 = new Propriety("Vila Real",600000, 40000, 200000, 600000, 1800000, 3200000, 4500000, 500000, 500000, 300000, "Castanho");
        proprieties.add(p2);
        
        //azul bebe
        Propriety p3 = new Propriety("Bragança",1000000, 60000, 300000, 900000, 2700000, 4000000, 5500000, 500000, 500000, 500000, "Azul bebe");
        proprieties.add(p3);
        
        Propriety p4 = new Propriety("Leiria",1000000, 60000, 300000, 900000, 2700000, 4000000, 5500000, 500000, 500000, 500000, "Azul bebe");
        proprieties.add(p4);
        
        Propriety p5 = new Propriety("Portalegre",1200000, 80000, 400000, 1000000, 3000000, 4500000, 6000000, 500000, 500000, 600000, "Azul bebe");
        proprieties.add(p5);
        
        //Rosa
        Propriety p6 = new Propriety("Aveiro",1400000, 100000, 500000, 1500000, 4500000, 6250000, 7500000, 1000000, 1000000, 700000, "Rosa");
        proprieties.add(p6);
        
        Propriety p7 = new Propriety("Santarém",1400000, 100000, 500000, 1500000, 4500000, 6250000, 7500000, 1000000, 1000000, 700000, "Rosa");
        proprieties.add(p7);
        
        Propriety p8 = new Propriety("Braga",1600000, 120000, 600000, 1800000, 5000000, 7000000, 9000000, 1000000, 1000000, 800000, "Rosa");
        proprieties.add(p8);
        
        //Laranja
        Propriety p9 = new Propriety("Viseu",1800000, 140000, 700000, 2000000, 5500000, 7500000, 9500000, 1000000, 1000000, 900000, "Laranja");
        proprieties.add(p9);
        
        Propriety p10 = new Propriety("Setúbal",1800000, 140000, 700000, 2000000, 5500000, 7500000, 9500000, 1000000, 1000000, 900000, "Laranja");
        proprieties.add(p10);
        
        Propriety p11 = new Propriety("Guarda",2000000, 160000, 800000, 2200000, 6000000, 8000000, 10000000, 1000000, 1000000, 1000000, "Laranja");
        proprieties.add(p11);
        
        //Vermelho
        Propriety p12 = new Propriety("Beja",2200000, 180000, 900000, 2500000, 7000000, 8750000, 10500000, 1500000, 1500000, 1100000, "Vermelho");
        proprieties.add(p12);
        
        Propriety p13 = new Propriety("Évora",2200000, 180000, 900000, 2500000, 7000000, 8750000, 10500000, 1500000, 1500000, 1100000, "Vermelho");
        proprieties.add(p13);
        
        Propriety p14 = new Propriety("Viana do Castelo",2400000, 200000, 1000000, 3000000, 7500000, 9250000, 11000000, 1500000, 1500000, 1200000, "Vermelho");
        proprieties.add(p14);
        
        //Amarelo
        Propriety p15 = new Propriety("Faro",2600000, 220000, 1100000, 3300000, 8000000, 9750000, 11500000, 1500000, 1500000, 1300000, "Amarelo");
        proprieties.add(p15);
        
        Propriety p16 = new Propriety("Coimbra",2600000, 220000, 1100000, 3300000, 8000000, 9750000, 11500000, 1500000, 1500000, 1300000, "Amarelo");
        proprieties.add(p16);
        
        Propriety p17 = new Propriety("Porto Boavista",2800000, 240000, 1200000, 3600000, 8500000, 10250000, 12000000, 1500000, 1500000, 1400000, "Amarelo");
        proprieties.add(p17);
        
        //Verde
        Propriety p18 = new Propriety("Lisboa Expo",3000000, 260000, 1300000, 3900000, 9000000, 11000000, 12750000, 2000000, 2000000, 1500000, "Verde");
        proprieties.add(p18);
        
        Propriety p19 = new Propriety("Madeira",3000000, 260000, 1300000, 3900000, 9000000, 11000000, 12750000, 2000000, 2000000, 1500000, "Verde");
        proprieties.add(p19);
        
        Propriety p20 = new Propriety("Açores",3200000, 280000, 1500000, 4500000, 10000000, 12000000, 14000000, 2000000, 2000000, 1600000, "Verde");
        proprieties.add(p20);
        
        //Azul escuro
        Propriety p21 = new Propriety("Porto Ribeira",3500000, 350000, 1750000, 5000000, 11000000, 13000000, 15000000, 2000000, 2000000, 1750000, "Azul Escuro");
        proprieties.add(p21);
        
        Propriety p22 = new Propriety("Lisboa Belém",4000000, 500000, 2000000, 6000000, 14000000, 17000000, 20000000, 2000000, 2000000, 2000000, "Azul Escuro");
        proprieties.add(p22);
        
        //aeroportos
        Propriety p23 = new Propriety("Aeroporto João Paulo II",2000000, 250000, 500000, 1000000, 2000000,1000000, "Branco");
        proprieties.add(p23);
        
        Propriety p24 = new Propriety("Aeroporto da Madeira",2000000, 250000, 500000, 1000000, 2000000,1000000, "Branco");
        proprieties.add(p24);
        
        Propriety p25 = new Propriety("Aeroporto Francisco Sá Carneiro",2000000, 250000, 500000, 1000000, 2000000,1000000, "Branco");
        proprieties.add(p25);
        
        Propriety p26 = new Propriety("Aeroporto da Portela",2000000, 250000, 500000, 1000000, 2000000,1000000, "Branco");
        proprieties.add(p26);
        
        //serviços
        Propriety p27 = new Propriety("Internet",1500000,750000, "Branco");
        proprieties.add(p27);
        
        Propriety p28 = new Propriety("Telemóveis",1500000,750000, "Branco");
        proprieties.add(p28);
        
        //000000
        
    }

    public LinkedList<Propriety> getProprieties() {
        return proprieties;
    }
    
    public Propriety getPropriety(int position) {
        return proprieties.get(position);
    }
    
    
    
}