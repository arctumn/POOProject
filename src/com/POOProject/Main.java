package com.POOProject;

import com.myinputs.Ler;

import java.io.*;
import java.util.ArrayList;

public class Main {
    private static void sayTouradas(ArrayList<Capeias>capeias,ArrayList<Corridas>corridas,ArrayList<TouradasACorda>touradasACordas,ArrayList<Largadas>largadas,ArrayList<EspectaculoDeRecortes>espetaculodeRecortes){
        capeias.forEach(c-> System.out.println(c.getNomeEvento()));
        touradasACordas.forEach(t-> System.out.println(t.getNomeEvento()));
        corridas.forEach(c-> System.out.println(c.getNomeEvento()));
        largadas.forEach(l-> System.out.println(l.getNomeEvento()));
        espetaculodeRecortes.forEach(c-> System.out.println(c.getNomeEvento()));
    }
    private static Local findLocalByName(String s, ArrayList<Local> locais) {
        for (Local local : locais){
            if (local.getLocalidade().equals(s))
                return local;
            }
        return null;
    }
    private static Tourada findTouradaByName(String s, ArrayList<Tourada> touradas) {
        for (Tourada tourada : touradas){
            if (tourada.getNomeEvento().equals(s))
                return tourada;
            }
        return null;
    }
    private static EspectaculoDeRecortes findEspectaculoDeRecortesByName(String s, ArrayList<EspectaculoDeRecortes>er){
        for (EspectaculoDeRecortes E : er){
            if(E.getNomeEvento().equals(s)) return E;
        }
        return null;
    }
    private static  Corridas findCorridasByName(String s, ArrayList<Corridas>corridas){
        for (Corridas corrida : corridas){
            if (corrida.getNomeEvento().equals(s)) return corrida;
        }
        return null;
    }
    private static Largadas findLargadasByName(String s, ArrayList<Largadas> largadas){
        for (Largadas largada : largadas){
            if(largada.getNomeEvento().equals(s)) return largada;
        }
        return null;
    }
    private static Capeias findCapeiasByName(String s2, ArrayList<Capeias> capeias) {
        for (Capeias capeia : capeias){
            if (capeia.getNomeEvento().equals(s2))
                return capeia;
            }
        return null;
    }
    private static TouradasACorda findTouradasACordabyName(String s, ArrayList<TouradasACorda> tcs){
        for (TouradasACorda tc : tcs){
            if (tc.getNomeEvento().equals(s))
                return tc;
        }
        return null;
    }
    public static void main(String[] args) {
        FileInputStream is1, is2, is3, is4,is5,is6,is7,is8,is9,is10;
        ObjectInputStream obIP1, obIP2, obIP3, obIP4,obIP5,obIP6,obIP7,obIP8,obIP9,obIP10;
        FileOutputStream os1, os2, os3, os4,os5,os6,os7,os8,os9,os10;
        ObjectOutputStream obOS1, obOS2, obOS3, obOS4,obOS5,obOS6,obOS7,obOS8,obOS9,obOS10;
        int dumbvar,dumbvar2;
        String s, s1,s2;
        ArrayList<Local> locais = new ArrayList<>();
        ArrayList<Tourada> touradas2 = new ArrayList<>();
        ArrayList<Tourada> touradas3 = new ArrayList<>();
        ArrayList<Capeias> capeias = new ArrayList<>();
        ArrayList<EspectaculoDeRecortes> espetaculodeRecortes = new ArrayList<>();
        ArrayList<Corridas> corridas = new ArrayList<>();
        ArrayList<Largadas> largadas = new ArrayList<>();
        ArrayList<TouradasACorda> touradasACordas = new ArrayList<>();
        ArrayList<Toiros> toiros = new ArrayList<>();
        ArrayList<GFA> gfas = new ArrayList<>();
        ArrayList<Ganadaria> ganadarias = new ArrayList<>();
        ArrayList<Cavaleiro> cavaleiros = new ArrayList<>();
        File f1 = new File("fichLocais.dat");
        File f2 = new File("fichCapeias.dat");
        File f3 = new File("fichCorridas.dat");
        File f4 = new File("fichLargadas.dat");
        File f5 = new File("fichEspecRec.dat");
        File f6 = new File("fichTouradasACorda.dat");
        File f7 = new File("fichGFA.dat");
        File f8 = new File("fichGanadaria.dat");
        File f9 = new File("fichCavaleiros.dat");
        File f10 = new File("fichToiros.dat");
        try {
            is1 = new FileInputStream(f1);
            obIP1 = new ObjectInputStream(is1);
            locais = (ArrayList<Local>) obIP1.readObject();
            is1.close();
            is2 = new FileInputStream(f2);
            obIP2 = new ObjectInputStream(is2);
            capeias = (ArrayList<Capeias>) obIP2.readObject();
            is2.close();
            is3 = new FileInputStream(f3);
            obIP3 = new ObjectInputStream(is3);
            corridas = (ArrayList<Corridas>) obIP3.readObject();
            is3.close();
            is4 = new FileInputStream(f4);
            obIP4 = new ObjectInputStream(is4);
            largadas = (ArrayList<Largadas>) obIP4.readObject();
            is4.close();
            is5 = new FileInputStream(f5);
            obIP5 = new ObjectInputStream(is5);
            espetaculodeRecortes = (ArrayList<EspectaculoDeRecortes>) obIP5.readObject();
            is5.close();
            is6 = new FileInputStream(f6);
            obIP6 = new ObjectInputStream(is6);
            touradasACordas = (ArrayList<TouradasACorda>) obIP6.readObject();
            is6.close();
            is7 = new FileInputStream(f7);
            obIP7 = new ObjectInputStream(is7);
            gfas = (ArrayList<GFA>) obIP7.readObject();
            is7.close();
            is8 = new FileInputStream(f8);
            obIP8 = new ObjectInputStream(is8);
            ganadarias = (ArrayList<Ganadaria>) obIP8.readObject();
            is8.close();
            is9 = new FileInputStream(f9);
            obIP9 = new ObjectInputStream(is9);
            cavaleiros = (ArrayList<Cavaleiro>) obIP9.readObject();
            is9.close();
            is10 = new FileInputStream(f10);
            obIP10 = new ObjectInputStream(is10);
            toiros = (ArrayList<Toiros>)obIP10.readObject();
            is10.close();
        } catch (IOException | NullPointerException e) {
             System.out.println("Existe ficheiros vazios");
            }catch (ClassNotFoundException e){
            System.out.println("Nao encontrei uma classe: "+e.getMessage());
        }
        locais.forEach(l-> System.out.println("Cidade: "+l.getLocalidade()));
        // O codigo dentro destes comentarios é de debug mas serve para verficar o conteudo dos ficheiros
        //Alguns metodos ainda teem bugs para testarem uma classe de toiros usem a Capeia por estar sem bugs ja
        touradas3.addAll(corridas);
        touradas3.addAll(largadas);
        touradas3.addAll(touradasACordas);
        touradas3.addAll(capeias);
        touradas3.addAll(espetaculodeRecortes);
        sayTouradas(capeias,corridas,touradasACordas,largadas,espetaculodeRecortes);
        //O codigo dentro destes comentarios é de debug mas serve para verficar o conteudo dos ficheiros
        int sWvar, sB,z1;
        do {
            System.out.println("Pressione 1 para ir para o Menu das Regioes Dos Eventos");
            System.out.println("Pressione 2 para ir para o Menu das Touradas");
            System.out.println("Pressione 3 para ir para o Menu dos Participantes");
            System.out.println("Pressione 4 para ir para o Menu das entidades externas");
            System.out.println("Pressione qualquer outra tecla para encerrar");
            sWvar = Ler.umInt();
            switch (sWvar) {
                    case 1: {
                    do {
                        System.out.println("Pressione 1 para Adicionar 1 novo local");
                        System.out.println("Pressione 2 para remover 1 local pelo nome");
                        System.out.println("Pressione 3 para Vizualizar 1 local");
                        System.out.println("Pressione 4 para Mostar todos os locais");
                        System.out.println("Pressione 5 para pesquisar uma tourada pelo local");
                        System.out.println("Pressione qualquer outra tecla para encerrar");
                        sB = Ler.umInt();
                        switch (sB) {
                            case 1: {
                                System.out.println("Nome do Novo local");
                                s = Ler.umaString();
                                if (findLocalByName(s, locais) != null) {
                                    System.out.println("Ja existe " + s);
                                    break;
                                }
                                System.out.println("Qual Pais?");
                                s1 = Ler.umaString();
                                locais.add( new Local(s, s1));
                                locais.sort(Local.compareLocalbyNome);
                                System.out.println("Adicionou " + s + " no pais " + s1);
                                break;
                            }
                            case 2: {
                                System.out.println("Nome do local a remover?");
                                locais.forEach(l-> System.out.println(l.getLocalidade()));
                                s = Ler.umaString();
                                Local classeARemover = findLocalByName(s, locais);
                                if (classeARemover != null) {
                                    locais.remove(classeARemover);
                                    System.out.println("Removeu " + s);
                                    break;
                                } else System.out.println("Nao existe Esse Local");
                                break;
                            }
                            case 3: {
                                System.out.println("Qual local quer ver?");
                                locais.forEach(l-> System.out.println(l.getLocalidade()));
                                s = Ler.umaString();
                                Local classeAVer = findLocalByName(s, locais);
                                if (classeAVer != null) {
                                    System.out.println(classeAVer);
                                    break;
                                } else System.out.println("Nao existe Esse Local");
                                break;
                            }
                            case 4: {
                                System.out.println(locais);
                                break;
                            }
                            case 5: {
                                System.out.println("Em qual local quer procurar a tourada?");
                                locais.forEach(l-> System.out.println(l.getLocalidade()));
                                s = Ler.umaString();
                                Local classeAVer = findLocalByName(s, locais);
                                if (classeAVer != null) {
                                    for (Capeias capeia : capeias)
                                        if (capeia.getLocal().equals(classeAVer.getLocalidade())) {
                                            touradas2.add(capeia);
                                        }
                                    for (Corridas corrida : corridas)
                                        if (corrida.getLocal().equals(classeAVer.getLocalidade())) {
                                            touradas2.add(corrida);
                                        }
                                    for (Largadas largada : largadas)
                                        if (largada.getLocal().equals(classeAVer.getLocalidade())) {
                                            touradas2.add(largada);
                                        }
                                    for (TouradasACorda touradasACorda : touradasACordas)
                                        if (touradasACorda.getLocal().equals(classeAVer.getLocalidade())) {
                                            touradas2.add(touradasACorda);
                                        }
                                    for (EspectaculoDeRecortes espectaculoDeRecorte : espetaculodeRecortes)
                                        if (espectaculoDeRecorte.getLocal().equals(classeAVer.getLocalidade())) {
                                            touradas2.add(espectaculoDeRecorte);
                                         }
                                    System.out.println("Estas sao as touradas dessa Localidade:");
                                        touradas2.forEach(t-> System.out.println(t.toString()));
                                        break;
                                }
                                System.out.println("Não existe essa localidade");
                                break;
                            }
                            default:{
                                System.out.println("Saiu do menu das localidades");
                                try{
                                    os1 = new FileOutputStream(f1);
                                    obOS1 = new ObjectOutputStream(os1);
                                    obOS1.writeObject(locais);
                                    os1.close();
                                }catch(IOException e){
                                    System.out.println(e.getMessage());
                                }
                                sB = -1;
                            }
                        }
                    }while (sB != -1);
                        //fazer em 1
                        break;
                    }
                    case 2: {
                        do {
                            System.out.println("Pressione 1 para Adicionar 1 nova tourada");
                            System.out.println("Pressione 2 para remover 1 tourada pelo nome");
                            System.out.println("Pressione 3 para comprar ou vender bilhetes");
                            System.out.println("Pressione 4 para ver 1 tourada pelo nome");
                            System.out.println("Pressione 5 para mostrar todas as touradas");
                            System.out.println("Pressione 6 para alterar um evento");
                            System.out.println("Pressione qualquer outro numero para sair");
                            sB = Ler.umInt();
                            switch (sB) {
                                case 1: {
                                    System.out.println("Nome da Nova tourada");
                                    s = Ler.umaString();
                                    if (findTouradaByName(s, touradas3) != null) {
                                        System.out.println("Ja existe " + s);
                                        break;
                                    }
                                        System.out.println("Qual tipo de Tourada?");
                                        System.out.println("Corrida\tCapeia\tEspetaculo de Recortes\tLargada\tTourada a Corda");
                                        s1 = Ler.umaString();
                                    if (s1.equals("Capeia")){
                                        System.out.println("Intruduza uma assistencia");
                                        System.out.println("Uma data");
                                        Tourada t = new Tourada(Ler.umInt(),Ler.umaString(),s);
                                        System.out.println("Qual local?");
                                        locais.forEach(l-> System.out.println(l.getLocalidade()));
                                        s2 = Ler.umaString();
                                        Local l = findLocalByName(s2,locais);
                                        while(l == null){
                                            System.out.println("Esse local nao existe");
                                            System.out.println("Introduza outro");
                                            locais.forEach(l1-> System.out.println(l1.getLocalidade()));
                                            s2 = Ler.umaString();
                                            l = findLocalByName(s2,locais);
                                        }
                                        capeias.add(new Capeias(t,l));
                                        touradas3.add(new Capeias(t,l));
                                        capeias.sort(Capeias.compareCapeiasbyNome);
                                        System.out.println("Adicionou a tourada " +t.getNomeEvento());
                                    }
                                    if (s1.equals("Tourada a Corda")){
                                        System.out.println("Uma data");
                                        Tourada t = new Tourada(0,Ler.umaString(),s);
                                        System.out.println("Qual local?");
                                        locais.forEach(l-> System.out.println(l.getLocalidade()));
                                        s2 = Ler.umaString();
                                        Local l = findLocalByName(s2,locais);
                                        while(l == null){
                                            System.out.println("Esse local nao existe");
                                            System.out.println("Introduza outro");
                                            locais.forEach(l1-> System.out.println(l1.getLocalidade()));
                                            s2 = Ler.umaString();
                                            l = findLocalByName(s2,locais);
                                        }
                                        touradasACordas.add(new TouradasACorda(t,l));
                                        touradas3.add(new TouradasACorda(t,l));
                                        touradasACordas.sort(TouradasACorda.compareTouradasACordabyNome);
                                        System.out.println("Adicionou a tourada " +t.getNomeEvento());
                                    }
                                    if (s1.equals("Espetaculo de Recortes")){
                                        System.out.println("Intruduza uma assistencia");
                                        System.out.println("Uma data");
                                        Tourada t = new Tourada(Ler.umInt(),Ler.umaString(),s);
                                        System.out.println("Qual local?");
                                        locais.forEach(l-> System.out.println(l.getLocalidade()));
                                        s2 = Ler.umaString();
                                        Local l = findLocalByName(s2,locais);
                                        while(l == null){
                                            System.out.println("Esse local nao existe");
                                            System.out.println("Introduza outro");
                                            locais.forEach(l1-> System.out.println(l1.getLocalidade()));
                                            s2 = Ler.umaString();
                                            l = findLocalByName(s2,locais);
                                        }
                                        espetaculodeRecortes.add(new EspectaculoDeRecortes(t,l));
                                        touradas3.add(new EspectaculoDeRecortes(t,l));
                                        espetaculodeRecortes.sort(EspectaculoDeRecortes.compareEspectaculoDeRecortesbyNome);
                                        System.out.println("Adicionou a tourada " +t.getNomeEvento());
                                    }
                                    if (s1.equals("Corrida")){
                                        System.out.println("Intruduza uma assistencia");
                                        System.out.println("Uma data");
                                        Tourada t = new Tourada(Ler.umInt(),Ler.umaString(),s);
                                        System.out.println("Qual local?");
                                        locais.forEach(l-> System.out.println(l.getLocalidade()));
                                        s2 = Ler.umaString();
                                        Local l = findLocalByName(s2,locais);
                                        while(l == null){
                                            System.out.println("Esse local nao existe");
                                            System.out.println("Introduza outro");
                                            locais.forEach(l1-> System.out.println(l1.getLocalidade()));
                                            s2 = Ler.umaString();
                                            l = findLocalByName(s2,locais);
                                        }
                                        corridas.add(new Corridas(t,l));
                                        touradas3.add(new Corridas(t,l));
                                        corridas.sort(Corridas.compareCorridasbyNome);
                                        System.out.println("Adicionou a tourada " +t.getNomeEvento());
                                    }
                                    if (s1.equals("Largada")) {
                                        System.out.println("Uma data");
                                        Tourada t = new Tourada(0,Ler.umaString(),s);
                                        System.out.println("Qual local?");
                                        locais.forEach(l-> System.out.println(l.getLocalidade()));
                                        s2 = Ler.umaString();
                                        Local l = findLocalByName(s2,locais);
                                        while(l == null){
                                            System.out.println("Esse local nao existe");
                                            System.out.println("Introduza outro");
                                            locais.forEach(l1-> System.out.println(l1.getLocalidade()));
                                            s2 = Ler.umaString();
                                            l = findLocalByName(s2,locais);
                                        }
                                        largadas.add( new Largadas(t, l));
                                        touradas3.add(new Largadas(t,l));
                                        largadas.sort(Largadas.compareLargadasbyNome);
                                        System.out.println("Adicionou a tourada " + t.getNomeEvento());
                                    }
                                    break;
                                }
                                case 2: {
                                    System.out.println("Nome da tourada a remover?");
                                    touradas3.forEach(t3 -> System.out.println(t3.getNomeEvento()));
                                    s = Ler.umaString();
                                    Tourada classeARemover = findTouradaByName(s,touradas3);
                                    if (classeARemover != null) {
                                        if (classeARemover instanceof Capeias)
                                            capeias.remove(classeARemover);
                                        else if(classeARemover instanceof EspectaculoDeRecortes)
                                            espetaculodeRecortes.remove(classeARemover);
                                        else if(classeARemover instanceof Largadas)
                                            largadas.remove(classeARemover);
                                        else if(classeARemover instanceof Corridas)
                                            corridas.remove(classeARemover);
                                        else if(classeARemover instanceof TouradasACorda)
                                            touradasACordas.remove(classeARemover);
                                        touradas3.remove(classeARemover);
                                        System.out.println("Removeu " + s);
                                        break;
                                    } else System.out.println("Nao existe essa Tourada");
                                    break;
                                }
                                case 3: {
                                    System.out.println("Que tipo de tourada?");
                                    System.out.println("Corrida\tCapeia\tEspetaculoDeRecortes");
                                    s = Ler.umaString();
                                    if(s.equals("Capeia")) {
                                        capeias.forEach(ca-> System.out.println(ca.getNomeEvento()));
                                        System.out.println("Qual o nome do evento?");
                                        s2 = Ler.umaString();
                                        Capeias classeATrablhar = findCapeiasByName(s2, capeias);
                                        if (classeATrablhar != null) {
                                            System.out.println("Quer comprar ou vender bilhetes?");
                                            if (Ler.umaString().equals("comprar")) {
                                                System.out.println("Quantos?");
                                                dumbvar = Ler.umInt();
                                                dumbvar2 = classeATrablhar.getBilhete();
                                                classeATrablhar.comprabilhete(dumbvar);
                                                if (classeATrablhar.getBilhete() != dumbvar)
                                                System.out.println("Comprou "+dumbvar2+" bilhetes");
                                                classeATrablhar.percentagem();
                                                break;
                                            }
                                            else if (Ler.umaString().equals("vender")) {
                                                System.out.println("Quantos?");
                                                dumbvar = Ler.umInt();
                                                dumbvar2 = classeATrablhar.getBilhete();
                                                classeATrablhar.removerbilhete(dumbvar);
                                                if (classeATrablhar.getBilhete() != dumbvar)
                                                    System.out.println("Vendeu "+dumbvar2+" bilhetes");
                                                classeATrablhar.percentagem();
                                                break;
                                            }
                                            else {
                                                System.out.println("Nao existe essa operação");
                                                break;
                                            }

                                        } else {
                                            System.out.println("Nao existe essa tourada");
                                            break;
                                        }
                                    }
                                    if(s.equals("Corrida")) {
                                        corridas.forEach(c-> System.out.println(c.getNomeEvento()));
                                        System.out.println("Qual o nome do evento?");
                                        s2 = Ler.umaString();
                                        Corridas classeATrablhar = findCorridasByName(s2, corridas);
                                        if (classeATrablhar != null) {
                                            System.out.println("Quer comprar ou vender bilhetes?");
                                            if (Ler.umaString().equals("comprar")) {
                                                System.out.println("Quantos?");
                                                dumbvar = Ler.umInt();
                                                dumbvar2 = classeATrablhar.getBilhete();
                                                classeATrablhar.comprabilhete(dumbvar);
                                                if (classeATrablhar.getBilhete() != dumbvar)
                                                    System.out.println("Comprou "+dumbvar2+" bilhetes");
                                                classeATrablhar.percentagem();
                                                break;
                                            }
                                            else if (Ler.umaString().equals("vender")) {
                                                System.out.println("Quantos?");
                                                dumbvar = Ler.umInt();
                                                dumbvar2 = classeATrablhar.getBilhete();
                                                classeATrablhar.removerbilhete(dumbvar);
                                                if (classeATrablhar.getBilhete() != dumbvar)
                                                    System.out.println("Vendeu "+dumbvar2+" bilhetes");
                                                classeATrablhar.percentagem();
                                                break;
                                            }
                                            else {
                                                System.out.println("Nao existe essa operação");
                                                break;
                                            }
                                        }
                                        else {
                                            System.out.println("Nao existe essa tourada");
                                            break;
                                        }
                                    }
                                    if(s.equals("EspetaculoDeRecortes")) {
                                        espetaculodeRecortes.forEach(e-> System.out.println(e.getNomeEvento()));
                                        System.out.println("Qual o nome do evento?");
                                        s2 = Ler.umaString();
                                        EspectaculoDeRecortes classeATrablhar = findEspectaculoDeRecortesByName(s2, espetaculodeRecortes);
                                        if (classeATrablhar != null) {
                                            System.out.println("Quer comprar ou vender bilhetes?");
                                            if (Ler.umaString().equals("comprar")) {
                                                System.out.println("Quantos?");
                                                dumbvar = Ler.umInt();
                                                dumbvar2 = classeATrablhar.getBilhete();
                                                classeATrablhar.comprabilhete(dumbvar);
                                                if (classeATrablhar.getBilhete() != dumbvar)
                                                    System.out.println("Comprou "+dumbvar2+" bilhetes");
                                                classeATrablhar.percentagem();
                                                break;
                                            }
                                            else if (Ler.umaString().equals("vender")) {
                                                System.out.println("Quantos?");
                                                dumbvar = Ler.umInt();
                                                dumbvar2 = classeATrablhar.getBilhete();
                                                classeATrablhar.removerbilhete(dumbvar);
                                                if (classeATrablhar.getBilhete() != dumbvar)
                                                    System.out.println("Comprou "+dumbvar2+" bilhetes");
                                                classeATrablhar.percentagem();
                                                break;
                                            }
                                            else {
                                                System.out.println("Nao existe essa operação");
                                                break;
                                            }
                                        }
                                        else{
                                            System.out.println("Nao existe essa tourada");
                                            break;
                                        }
                                    }
                                    System.out.println("Nao existe esse evento");
                                    break;
                                }
                                case 4: {
                                    System.out.println("Qual tourada quer pesquisar?");
                                    sayTouradas(capeias,corridas,touradasACordas,largadas,espetaculodeRecortes);
                                    s = Ler.umaString();
                                    if(findTouradaByName(s,touradas3) == null){
                                        System.out.println("Nao existe: "+s);
                                        break;
                                    }
                                    System.out.println(findTouradaByName(s,touradas3));
                                    break;
                                }
                                case 5: {
                                    if(touradas3.isEmpty()){
                                        System.out.println("Nao existem touradas");
                                        break;
                                    }
                                    touradas3.forEach(t -> System.out.println(t.toString()));
                                    break;
                                }
                                case 6: {
                                    System.out.println("Qual o nome do evento");
                                    sayTouradas(capeias,corridas,touradasACordas,largadas,espetaculodeRecortes);
                                    s = Ler.umaString();
                                    Tourada elementoAMecher = findTouradaByName(s,touradas3);
                                    if(elementoAMecher == null){
                                        System.out.println("Nao existe: "+s);
                                        break;
                                    }
                                    do{
                                        System.out.println("Pressione 1 para mudar o nome");
                                        System.out.println("Pressione 2 para mudar os assentos maximos");
                                        System.out.println("Pressione 3 mudar a data");
                                        System.out.println("Pressione outro numero para sair");
                                        dumbvar2 = Ler.umInt();
                                        switch (dumbvar2){
                                            case 1:{
                                                System.out.println("Qual o novo nome?");
                                                s = Ler.umaString();
                                                elementoAMecher.setNomeEvento(s);
                                                System.out.println("Mudou para o nome: "+s);
                                                break;
                                            }

                                            case 2:{
                                                if(!(elementoAMecher instanceof Corridas) || !(elementoAMecher instanceof Capeias) || !(elementoAMecher instanceof EspectaculoDeRecortes)){
                                                    System.out.println("Esse evento nao tem assistencia limite");
                                                    break;
                                                }
                                                System.out.println("Para quanto quer alterar a lotação?");
                                                z1 = Ler.umInt();
                                                elementoAMecher.setAssistencia(z1);
                                                System.out.println("Alterou para "+z1);
                                                break;
                                            }
                                            case 3:{
                                                System.out.println("Para que data pretende alterar?");
                                                elementoAMecher.setDATA(Ler.umaString());
                                                System.out.println("Alterou a data para "+elementoAMecher.getDATA());
                                                break;
                                            }
                                            default:{
                                                System.out.println("Saiu do menu das alterações");
                                                dumbvar2 = -1;
                                                break;
                                            }
                                        }
                                    }while(dumbvar2 != -1);
                                    break;
                                }
                                default:{
                                    System.out.println("Saiu do menu das touradas");
                                }
                                try {
                                    os2 = new FileOutputStream(f2);
                                    obOS2 = new ObjectOutputStream(os2);
                                    obOS2.writeObject(capeias);
                                    os2.close();
                                    os3 = new FileOutputStream(f3);
                                    obOS3 = new ObjectOutputStream(os3);
                                    obOS3.writeObject(corridas);
                                    os3.close();
                                    os4 = new FileOutputStream(f4);
                                    obOS4 = new ObjectOutputStream(os4);
                                    obOS4.writeObject(largadas);
                                    os4.close();
                                    os5 = new FileOutputStream(f5);
                                    obOS5 = new ObjectOutputStream(os5);
                                    obOS5.writeObject(espetaculodeRecortes);
                                    os5.close();
                                    os6 = new FileOutputStream(f6);
                                    obOS6 = new ObjectOutputStream(os6);
                                    obOS6.writeObject(touradasACordas);
                                    os6.close();
                                }catch (IOException e){
                                    System.out.println("Dei um erro a Escrever "+e.getMessage());
                                }
                                    sB = -1;
                                }
                        }while (sB != -1) ;
                        //fazer em 2
                        break;
                    }
                    case 3: {
                        //fazer em 3
                        System.out.println(3);
                        break;
                    }
                    default: {
                        System.out.println("Fechou o programa");
                        sWvar = -1;
                    }
                }
            } while (sWvar != -1) ;
        }
}