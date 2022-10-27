// This is a project purely for fun. No rights reserved. I lay no claim to the Smite content discussed. I did write the code below though :D

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\033[0;93m";
  
    public static void main(String[] args) {
      
    	ArrayList<God> GodPool = new ArrayList<God>();
    	
        God Agni = new God("Agni", "Mage", "Mid", "Magical", "Ranged", "Hindu", "Asia", 1);
        GodPool.add(Agni);
        God Anubis = new God("Anubis", "Mage", "Mid", "Magical", "Ranged", "Egyptian", "Africa", 2);
        GodPool.add(Anubis);
        God Arachne = new God("Arachne", "Assassin", "Jungle", "Physical", "Melee", "Greek", "Europe", 3);
        GodPool.add(Arachne);
        God Artemis = new God("Artemis", "Hunter", "ADC", "Physical", "Ranged", "Greek", "Europe", 4);
        GodPool.add(Artemis);
        God Bastet = new God("Bastet", "Assassin", "Jungler", "Physical", "Melee", "Egyptian", "Africa", 5);
        GodPool.add(Bastet);
        God Hades = new God("Hades", "Mage", "Mid", "Magical", "Ranged", "Greek", "Europe", 6);
        GodPool.add(Hades);
        God He_Bo = new God("He Bo", "Mage", "Mid", "Magical", "Ranged", "Chinese", "Asia", 7);
        GodPool.add(He_Bo);
        God Hel = new God("Hel", "Mage", "Mid", "Magical", "Ranged", "Norse", "Europe", 8);
        GodPool.add(Hel);
        God Hun_Batz = new God("Hun Batz", "Assassin", "Jungle", "Physical", "Melee", "Mayan", "South America", 9);
        GodPool.add(Hun_Batz);
        God Kali = new God("Kali", "Assassin", "Jungle", "Physical", "Melee", "Hindu", "Asia", 10);
        GodPool.add(Kali);
        God Kukulkan = new God("Kukulkan", "Mage", "Mid", "Magical", "Ranged", "Mayan", "South America", 11);
        GodPool.add(Kukulkan);
        God Odin = new God("Odin", "Warrior", "Solo", "Physical", "Melee", "Norse", "Europe", 12);
        GodPool.add(Odin);
        God Ra = new God("Ra", "Mage", "Mid", "Magical", "Ranged", "Egyptian", "Africa", 13);
        GodPool.add(Ra);
        God Sobek = new God("Sobek", "Guardian", "Support", "Magical", "Melee", "Egyptian", "Africa", 14);
        GodPool.add(Sobek);
        God Vamana = new God("Vamana", "Warrior", "Solo", "Physical", "Melee", "Hindu", "Asia", 15);
        GodPool.add(Vamana);
        God Ymir = new God("Ymir", "Guardian", "Support", "Magical", "Melee", "Norse", "Europe", 16);
        GodPool.add(Ymir);
        God Zeus = new God("Zeus", "Mage", "Mid", "Magical", "Ranged", "Greek", "Europe", 17);
        GodPool.add(Zeus);
        God Guan_Yu = new God("Guan Yu", "Warrior", "Solo", "Physical", "Melee", "Chinese", "Asia", 18);
        GodPool.add(Guan_Yu);
        God Bakasura = new God("Bakasura", "Assassin", "Jungle", "Physical", "Melee", "Hindu", "Asia", 19);
        GodPool.add(Bakasura);
        God Anhur = new God("Anhur", "Hunter", "ADC", "Physical", "Ranged", "Egyptian", "Africa", 20);
        GodPool.add(Anhur);
        God Cupid = new God("Cupid", "Hunter", "ADC", "Physical", "Ranged", "Roman", "Europe", 21);
        GodPool.add(Cupid);
        God Thor = new God("Thor", "Assassin", "Jungle", "Physical", "Melee", "Norse", "Europe", 22);
        GodPool.add(Thor);
        God Ares = new God("Ares", "Guardian", "Support", "Magical", "Melee", "Greek", "Europe", 23);
        GodPool.add(Ares);
        God Freya = new God("Freya", "Mage", "ADC", "Magical", "Melee", "Norse", "Europe", 24);
        GodPool.add(Freya);
        God Loki = new God("Loki", "Assassin", "Jungle", "Physical", "Melee", "Norse", "Europe", 25);
        GodPool.add(Loki);
        God Bacchus = new God("Bacchus", "Guardian", "Support", "Magical", "Melee", "Roman", "Europe", 26);
        GodPool.add(Bacchus);
        God Xbalanque = new God("Xbalanque", "Hunter", "ADC", "Physical", "Ranged", "Mayan", "South America", 27);
        GodPool.add(Xbalanque);
        God Hercules = new God("Hercules", "Warrior", "Solo", "Physical", "Melee", "Roman", "Europe", 28);
        GodPool.add(Hercules);
        God Vulcan = new God("Vulcan", "Mage", "Mid", "Magical", "Ranged", "Roman", "Europe", 29);
        GodPool.add(Vulcan);
        God Neith = new God("Neith", "Hunter", "ADC", "Physical", "Ranged", "Egyptian", "Africa", 30);
        GodPool.add(Neith);
        God Poseidon = new God("Poseidon", "Mage", "Mid", "Magical", "Ranged", "Greek", "Europe", 31);
        GodPool.add(Poseidon);
        God Aphrodite = new God("Aphrodite", "Mage", "Mid", "Magical", "Ranged", "Greek", "Europe", 32);
        GodPool.add(Aphrodite);
        God Apollo = new God("Apollo", "Hunter", "ADC", "Physical", "Ranged", "Greek", "Europe", 33);
        GodPool.add(Apollo);
        God Ne_Zha = new God("Ne Zha", "Assassin", "Jungle", "Physical", "Melee", "Chinese", "Asia", 34);
        GodPool.add(Ne_Zha);
        God Fenrir = new God("Fenrir", "Assassin", "Jungle", "Physical", "Melee", "Norse", "Europe", 35);
        GodPool.add(Fenrir);
        God Eset = new God("Eset", "Mage", "Mid", "Magical", "Ranged", "Egyptian", "Africa", 36);
        GodPool.add(Eset);
        God Athena = new God("Athena", "Guardian", "Support", "Magical", "Melee", "Greek", "Europe", 37);
        GodPool.add(Athena);
        God Chronos = new God("Chronos", "Mage", "Mid", "Magical", "Ranged", "Greek", "Europe", 38);
        GodPool.add(Chronos);
        God Chang_e = new God("Chang'e", "Mage", "Mid", "Magical", "Ranged", "Chinese", "Asia", 39);
        GodPool.add(Chang_e);
        God Tyr = new God("Tyr", "Warrior", "Solo", "Physical", "Melee", "Norse", "Europe", 40);
        GodPool.add(Tyr);
        God Zhong_Kui = new God("Zhong Kui", "Mage", "Mid", "Magical", "Ranged", "Chinese", "Asia", 41);
        GodPool.add(Zhong_Kui);
        God Thanatos = new God("Thanatos", "Assassin", "Jungle", "Physical", "Melee", "Greek", "Europe", 42);
        GodPool.add(Thanatos);
        God Mercury = new God("Mercury", "Assassin", "Jungle", "Physical", "Melee", "Roman", "Europe", 43);
        GodPool.add(Mercury);
        God Sun_Wukong = new God("Sun Wukong", "Warrior", "Solo", "Physical", "Melee", "Chinese", "Asia", 44);
        GodPool.add(Sun_Wukong);
        God Ah_Muzen_Cab = new God("Ah Muzen Cab", "Hunter", "ADC", "Physical", "Ranged", "Mayan", "South America", 45);
        GodPool.add(Ah_Muzen_Cab);
        God Nu_Wa = new God("Nu Wa", "Mage", "Mid", "Magical", "Ranged", "Chinese", "Asia", 46);
        GodPool.add(Nu_Wa);
        God Chaac = new God("Chaac", "Warrior", "Solo", "Physical", "Melee", "Mayan", "South America", 47);
        GodPool.add(Chaac);
        God Geb = new God("Geb", "Guardian", "Support", "Magical", "Melee", "Egyptian", "Africa", 48);
        GodPool.add(Geb);
        God Nemesis = new God("Nemesis", "Assassin", "Jungle", "Physical", "Melee", "Greek", "Europe", 49);
        GodPool.add(Nemesis);
        God Scylla = new God("Scylla", "Mage", "Mid", "Magical", "Ranged", "Greek", "Europe", 50);
        GodPool.add(Scylla);
        God Ullr = new God("Ullr", "Hunter", "ADC", "Physical", "Ranged", "Norse", "Europe", 51);
        GodPool.add(Ullr);
        God Kumbhakarna = new God("Kumbhakarna", "Guardian", "Support", "Magical", "Melee", "Hindu", "Asia", 52);
        GodPool.add(Kumbhakarna);
        God Osiris = new God("Osiris", "Warrior", "Solo", "Physical", "Melee", "Egyptian", "Africa", 53);
        GodPool.add(Osiris);
        God Janus = new God("Janus", "Mage", "Mid", "Magical", "Ranged", "Roman", "Europe", 54);
        GodPool.add(Janus);
        God Rama = new God("Rama", "Hunter", "ADC", "Physical", "Ranged", "Hindu", "Asia", 55);
        GodPool.add(Rama);
        God Serqet = new God("Serqet", "Assassin", "Jungle", "Physical", "Melee", "Egyptian", "Africa", 56);
        GodPool.add(Serqet);
        God Cabrakan = new God("Cabrakan", "Guardian", "Jungle", "Magical", "Melee", "Mayan", "South America", 57);
        GodPool.add(Cabrakan);
        God Sylvanus = new God("Sylvanus", "Guardian", "Support", "Magical", "Ranged", "Roman", "Europe", 58);
        GodPool.add(Sylvanus);
        God Nox = new God("Nox", "Mage", "Mid", "Magical", "Ranged", "Roman", "Europe", 59);
        GodPool.add(Nox);
        God Ao_Kuang = new God("Ao Kuang", "Mage", "Jungle", "Magical", "Melee", "Chinese", "Asia", 60);
        GodPool.add(Ao_Kuang);
        God Awilix = new God("Awilix", "Assassin", "Jungle", "Physical", "Melee", "Mayan", "South America", 61);
        GodPool.add(Awilix);
        God Hou_Yi = new God("Hou Yi", "Hunter", "ADC", "Physical", "Ranged", "Chinese", "Asia", 62);
        GodPool.add(Hou_Yi);
        God Bellona = new God("Bellona", "Warrior", "Solo", "Physical", "Melee", "Roman", "Europe", 63);
        GodPool.add(Bellona);
        God Medusa = new God("Medusa", "Hunter", "ADC", "Physical", "Ranged", "Greek", "Europe", 64);
        GodPool.add(Medusa);
        God Ah_Puch = new God("Ah Puch", "Mage", "Mid", "Magical", "Ranged", "Mayan", "South America", 65);
        GodPool.add(Ah_Puch);
        God Ratatoskr = new God("Ratatoskr", "Assassin", "Jungle", "Physical", "Melee", "Norse", "Europe", 66);
        GodPool.add(Ratatoskr);
        God Ravana = new God("Ravana", "Assassin", "Jungle", "Physical", "Melee", "Hindu", "Asia", 67);
        GodPool.add(Ravana);
        God Khepri = new God("Khepri", "Guardian", "Support", "Magical", "Melee", "Egyptian", "Africa", 68);
        GodPool.add(Khepri);
        God Xing_Tian = new God("Xing Tian", "Guardian", "Support", "Magical", "Melee", "Chinese", "Asia", 69);
        GodPool.add(Xing_Tian);
        God Sol = new God("Sol", "Mage", "ADC", "Magical", "Ranged", "Norse", "Europe", 70);
        GodPool.add(Sol);
        God Chiron = new God("Chiron", "Hunter", "ADC", "Physical", "Ranged", "Greek", "Europe", 71);
        GodPool.add(Chiron);
        God Amaterasu = new God("Amaterasu", "Warrior", "Solo", "Physical", "Melee", "Japanese", "Asia", 72);
        GodPool.add(Amaterasu);
        God Raijin = new God("Raijin", "Mage", "Mid", "Magical", "Ranged", "Japanese", "Asia", 73);
        GodPool.add(Raijin);
        God Skadi = new God("Skadi", "Hunter", "ADC", "Physical", "Ranged", "Norse", "Europe", 74);
        GodPool.add(Skadi);
        God Jing_Wei = new God("Jing Wei", "Hunter", "ADC", "Physical", "Ranged", "Chinese", "Asia", 75);
        GodPool.add(Jing_Wei);
        God Susano = new God("Susano", "Assassin", "Jungle", "Physical", "Melee", "Japanese", "Asia", 76);
        GodPool.add(Susano);
        God Fafnir = new God("Fafnir", "Guardian", "Support", "Magical", "Melee", "Norse", "Europe", 77);
        GodPool.add(Fafnir);
        God Erlang_Shen = new God("Erlang Shen", "Warrior", "Jungle", "Physical", "Melee", "Chinese", "Asia", 78);
        GodPool.add(Erlang_Shen);
        God Terra = new God("Terra", "Guardian", "Support", "Magical", "Melee", "Roman", "Europe", 79);
        GodPool.add(Terra);
        God Izanami = new God("Izanami", "Hunter", "ADC", "Physical", "Ranged", "Japanese", "Asia", 80);
        GodPool.add(Izanami);
        God Camazotz = new God("Camazotz", "Assassin", "Jungle", "Physical", "Melee", "Mayan", "South America", 81);
        GodPool.add(Camazotz);
        God Thoth = new God("Thoth", "Mage", "Mid", "Magical", "Ranged", "Egyptian", "Africa", 82);
        GodPool.add(Thoth);
        God Nike = new God("Nike", "Warrior", "Solo", "Physical", "Melee", "Greek", "Europe", 83);
        GodPool.add(Nike);
        God The_Morrigan = new God("The Morrigan", "Mage", "Mid", "Magical", "Ranged", "Celtic", "Europe", 84);
        GodPool.add(The_Morrigan);
        God Kuzenbo = new God("Kuzenbo", "Guardian", "Support", "Magical", "Melee", "Japanese", "Asia", 85);
        GodPool.add(Kuzenbo);
        God Cernunnos = new God("Cernunnos", "Hunter", "ADC", "Physical", "Ranged", "Celtic", "Europe", 86);
        GodPool.add(Cernunnos);
        God Ganesha = new God("Ganesha", "Guardian", "Support", "Magical", "Melee", "Hindu", "Asia", 87);
        GodPool.add(Ganesha);
        God Da_Ji = new God("Da Ji", "Assassin", "Jungle", "Physical", "Melee", "Chinese", "Asia", 88);
        GodPool.add(Da_Ji);
        God Cu_Chulainn = new God("Cu Chulainn", "Warrior", "Solo", "Physical", "Melee", "Celtic", "Europe", 89);
        GodPool.add(Cu_Chulainn);
        God Artio = new God("Artio", "Guardian", "Solo", "Magical", "Melee", "Celtic", "Europe", 90);
        GodPool.add(Artio);
        God Hachiman = new God("Hachiman", "Hunter", "ADC", "Physical", "Ranged", "Japanese", "Asia", 91);
        GodPool.add(Hachiman);
        God Discordia = new God("Discordia", "Mage", "Mid", "Magical", "Ranged", "Roman", "Europe", 92);
        GodPool.add(Discordia);
        God Cerberus = new God("Cerberus", "Guardian", "Solo", "Magical", "Melee", "Greek", "Europe", 93);
        GodPool.add(Cerberus);
        God Achilles = new God("Achilles", "Warrior", "Solo", "Physical", "Melee", "Greek", "Europe", 94);
        GodPool.add(Achilles);
        God Chernobog = new God("Chernobog", "Hunter", "ADC", "Physical", "Ranged", "Slavic", "Europe", 95);
        GodPool.add(Chernobog);
        God Baron_Samedi = new God("Baron Samedi", "Mage", "Mid", "Magical", "Ranged", "Voodoo", "Africa", 96);
        GodPool.add(Baron_Samedi);
        God Pele = new God("Pele", "Assassin", "Jungle", "Physical", "Melee", "Polynesian", "South America", 97);
        GodPool.add(Pele);
        God Hera = new God("Hera", "Mage", "Mid", "Magical", "Ranged", "Greek", "Europe", 98);
        GodPool.add(Hera);
        God King_Arthur = new God("King Arthur", "Warrior", "Solo", "Physical", "Melee", "Arthurian", "Europe", 99);
        GodPool.add(King_Arthur);
        God Merlin = new God("Merlin", "Mage", "Mid", "Magical", "Ranged", "Arthurian", "Europe", 100);
        GodPool.add(Merlin);
        God Jormungandr = new God("Jormungandr", "Guardian", "Solo", "Magical", "Ranged", "Norse", "Europe", 101);
        GodPool.add(Jormungandr);
        God Horus = new God("Horus", "Warrior", "Solo", "Physical", "Melee", "Egyptian", "Africa", 102);
        GodPool.add(Horus);
        God Set = new God("Set", "Assassin", "Jungle", "Physical", "Melee", "Egyptian", "Africa", 103);
        GodPool.add(Set);
        God Olorun = new God("Olorun", "Mage", "ADC", "Magical", "Ranged", "Yoruba", "Africa", 104);
        GodPool.add(Olorun);
        God Persephone = new God("Persephone", "Mage", "Mid", "Magical", "Ranged", "Greek", "Europe", 105);
        GodPool.add(Persephone);
        God Yemoja = new God("Yemoja", "Guardian", "Support", "Magical", "Ranged", "Yoruba", "Africa", 106);
        GodPool.add(Yemoja);
        God Heimdallr = new God("Heimdallr", "Hunter", "ADC", "Physical", "Ranged", "Norse", "Europe", 107);
        GodPool.add(Heimdallr);
        God Mulan = new God("Mulan", "Warrior", "Solo", "Physical", "Melee", "Chinese", "Asia", 108);
        GodPool.add(Mulan);
        God Baba_Yaga = new God("Baba Yaga", "Mage", "Mid", "Magical", "Ranged", "Slavic", "Europe", 109);
        GodPool.add(Baba_Yaga);
        God Cthulhu = new God("Cthulhu", "Guardian", "Solo", "Magical", "Melee", "Old Ones", "None", 110);
        GodPool.add(Cthulhu);
        God Tsukuyomi = new God("Tsukuyomi", "Assassin", "Jungle", "Physical", "Melee", "Japanese", "Asia", 111);
        GodPool.add(Tsukuyomi);
        God Danzaburo = new God("Danzaburo", "Hunter", "ADC", "Physical", "Ranged", "Japanese", "Asia", 112);
        GodPool.add(Danzaburo);
        God Tiamat = new God("Tiamat", "Mage", "Mid", "Magical", "Both", "Babylonian", "Europe", 113);
        GodPool.add(Tiamat);
        God Gilgamesh = new God("Gilgamesh", "Warrior", "Solo", "Physical", "Melee", "Babylonian", "Europe", 114);
        GodPool.add(Gilgamesh);
        God Morgan_Le_Fay = new God("Morgan Le Fay", "Mage", "Mid", "Magical", "Ranged", "Arthurian", "Europe", 115);
        GodPool.add(Morgan_Le_Fay);
        God Charybdis = new God("Charybdis", "Hunter", "ADC", "Physical", "Ranged", "Greek", "Europe", 116);
        GodPool.add(Charybdis);
        God Cliodhna = new God("Cliodhna", "Assassin", "Jungle", "Physical", "Melee", "Celtic", "Europe", 117);
        GodPool.add(Cliodhna);
        God Atlas = new God("Atlas", "Guardian", "Support", "Magical", "Melee", "Greek", "Europe", 118);
        GodPool.add(Atlas);
        God Shiva = new God("Shiva", "Warrior", "Solo", "Physical", "Melee", "Hindu", "Asia", 119);
        GodPool.add(Shiva);
        God Yu_Huang = new God("Yu Huang", "Mage", "Mid", "Magical", "Ranged", "Chinese", "Asia", 120);
        GodPool.add(Yu_Huang);
        God Lancelot = new God("Lancelot", "Assassin", "Jungle", "Physical", "Melee", "Arthurian", "Europe", 121);
        GodPool.add(Lancelot);
        God Ishtar = new God("Ishtar", "Hunter", "ADC", "Physical", "Ranged", "Babylonian", "Europe", 122);
        GodPool.add(Ishtar);
        God Maui = new God("Maui", "Guardian", "Support", "Magical", "Melee", "Polynesian", "Asia", 123);
        GodPool.add(Maui);
        
        LocalDate Today = LocalDate.now();
        		
        int date = Integer.parseInt(Today.format(DateTimeFormatter.ofPattern("yyMMdd")));
        int yesterday = 0;
        
        // If statements for calculating yesterday's date
        if (date % 100 == 1) { // If first of the month then...
        	if (date % 10000 == 301 || date % 10000 == 501 || date % 10000 == 701 || date % 10000 == 801 || date % 10000 == 1001 || date % 10000 == 1201) {
        		yesterday = date - 71;
        	}
        	else if (date % 10000 == 101) {
        		yesterday = date - 8870;
        	}
        	else if (date % 10000 == 301) {
        		yesterday = date - 73;
        	}
        	else if (date % 10000 == 201 || date % 10000 == 401 || date % 10000 == 601 || date % 10000 == 901 || date % 10000 == 1101) {
        		yesterday = date - 70;
        	}
        }
        else {
        	yesterday = date - 1;
        }
        
        int randomize = (int)Math.floor(randomGenerator(date) * 1000000 * 100000 % 119);
        int yestrand = (int)Math.floor(randomGenerator(yesterday) * 1000000 * 100000 % 119);
        
        God Wordle = GodPool.get(randomize);
        God yWordle = GodPool.get(yestrand);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Welcome to Wardle! Today is " + Today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)) + ". ");
        System.out.println("Yesterday's god was: " + yWordle.getName());
        System.out.println("");
        System.out.println("");
        
        play(Wordle, GodPool);
    }
        
    public static void play(God Wordle, ArrayList<God> GodPool) {
    	Scanner scan = new Scanner(System.in);
        System.out.println("Let's begin!");
        System.out.println("");
        System.out.println("Enter your guesses:");
        
        for (int i = 1; i <= 5; i++) {
       	 
        	String guessString = scan.nextLine();
        	
        	guessString = guessString.replaceAll("\\s{2,}", " ").trim();
        	
        	guessString = (toTitleCase(guessString.toLowerCase()));
        	
        	if (guessString.equals("Morrigan")) {
        		guessString = "The Morrigan";
        	}
        	
        	// System.out.println(guessString);
        	
        	God Guess = findGod(guessString, GodPool);
        	
        	if (Guess == Wordle) {
        		System.out.println("Correct! The god was " + Wordle.getName());
        		return;
        	}
        	else if (Guess == null) {
        		i = i-1;
        	}
        	
        	else {
        		System.out.print(Guess.getName() + " ==> ");
        		if (Guess.getRole().equals(Wordle.getRole())) {
        			System.out.print(ANSI_GREEN);
        		}
    			System.out.print(Guess.getRole() + ANSI_RESET + " / ");
    			
    			if (Guess.getConquest().equals(Wordle.getConquest())) {
        			System.out.print(ANSI_GREEN);
        		}
    			System.out.print(Guess.getConquest() + ANSI_RESET + " / ");
    			
    			if (Guess.getDmg().equals(Wordle.getDmg())) {
        			System.out.print(ANSI_GREEN);
        		}
    			System.out.print(Guess.getDmg() + ANSI_RESET + " / ");
    			
    			if (Guess.getAtt().equals(Wordle.getAtt()) || Wordle.getAtt().equals("Both")) {
        			System.out.print(ANSI_GREEN);
        		}
    			System.out.print(Guess.getAtt() + ANSI_RESET + " / ");
    			
    			if (Guess.getPantheon().equals(Wordle.getPantheon())) {
        			System.out.print(ANSI_GREEN);
        		}
    			else if (Guess.getContinent().equals(Wordle.getContinent())) {
    				System.out.print(ANSI_YELLOW);
    			}
    			System.out.print(Guess.getPantheon() + ANSI_RESET + " / ");
    			
    			if (Math.abs((Guess.getOrder() - Wordle.getOrder())) <= 10) {
        			System.out.print(ANSI_YELLOW);
        		}
    			System.out.print(Guess.getOrder() + ANSI_RESET);
    			if (Guess.getOrder() > Wordle.getOrder()) {
    				System.out.print(" v");
    			}
    			else {
    				System.out.print(" ^");
    			}
    			System.out.println();
    			System.out.println("Guesses left: " + (5-i));
    			System.out.println();
        	}
        }
        System.out.println();
        System.out.println("You have failed! The answer is: " + Wordle.getName() + ". Thanks for trying! Better luck next time!");

        scan.close();
    }
    
    // Method for finding a God object given their name
    public static God findGod(String s, ArrayList<God> g) {
    	
    	for (int i = 0; i < g.size(); i++) {
    		if (s.equals(g.get(i).getName())) {
    			return g.get(i);
    		}
    	}
    	System.out.println("Invalid input. Please try again.");
		return null;
    }
    
    public static double randomGenerator(long seed) {
    	Random generator = new Random(seed);
    	double num = generator.nextDouble() * (0.5);
    	
    	return num;
    }
    
    public static String toTitleCase(String givenString) {
        String[] arr = givenString.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                .append(arr[i].substring(1)).append(" ");
        }          
        return sb.toString().trim();
    }
}