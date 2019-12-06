package com.POOProject;

import com.myinputs.Ler;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static Local findLocalByName(String s, ArrayList<Local> locais) {
        for (Local local : locais)
            if (local.getLocalidade().equals(s)) {
                return local;
            }
        return null;
    }

    public static Tourada findTouradaByName(String s, ArrayList<Tourada> touradas) {
        for (Tourada tourada : touradas)
            if (tourada.getNomeEvento().equals(s)) {
                return tourada;
            }
        return null;
    }

    public static void main(String[] args) {
        FileInputStream is1, is2, is3, is4;
        ObjectInputStream obIP1, obIP2, obIP3, obIP4;
        FileOutputStream os1, os2, os3, os4;
        ObjectOutputStream obOS1, obOS2, obOS3, obOS4;
        int pos = 0;
        String s, s1,s2;
        ArrayList<Local> locais = new ArrayList<Local>();
        ArrayList<Tourada> touradas = new ArrayList<Tourada>();
        ArrayList<Tourada> touradas2 = new ArrayList<Tourada>();
        ArrayList<Capeias> capeias = new ArrayList<Capeias>();
        ArrayList<EspectaculoDeRecortes> espetaculodeRecortes = new ArrayList<EspectaculoDeRecortes>();
        ArrayList<Corridas> corridas = new ArrayList<Corridas>();
        ArrayList<Largadas> largadas = new ArrayList<Largadas>();
        ArrayList<TouradasACorda> touradasACordas = new ArrayList<TouradasACorda>();
        // ArrayList<NotDefinedYet> NotDefinedYet = new ArrayList<NotDefinedYet>();
        // ArrayList<NotDefinedYet> NotDefinedYet = new ArrayList<NotDefinedYet>();
        // ArrayList<NotDefinedYet> NotDefinedYet = new ArrayList<NotDefinedYet>();
        // ArrayList<NotDefinedYet> NotDefinedYet = new ArrayList<NotDefinedYet>();
        File f1 = new File("fichLocais.dat");
        File f2 = new File("fichTouradas.dat");
        File f3 = new File("fichidk.dat");
        File f4 = new File("fichidk2.dat");
        try {
            is1 = new FileInputStream(f1);
            obIP1 = new ObjectInputStream(is1);
            locais = (ArrayList<Local>) obIP1.readObject();
            is1.close();
            is2 = new FileInputStream(f2);
            obIP2 = new ObjectInputStream(is2);
            touradas = (ArrayList<Tourada>) obIP2.readObject();
            is2.close();
            is3 = new FileInputStream(f3);
            obIP3 = new ObjectInputStream(is3);
            //NDF = (ArrayList<Tourada>) obIP2.readObject();
            is3.close();
            is4 = new FileInputStream(f4);
            obIP4 = new ObjectInputStream(is4);
            // NDF = (ArrayList<NDF>) obIP2.readObject();
            is4.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        int sWvar = 0, sB = 0;
        do {
            System.out.println("Pressione 1 para ir para o Menu das Regioes Dos Eventos");
            System.out.println("Pressione 2 para ir para o Menu das Touradas");
            System.out.println("Pressione 3 para ir para o Menu dos Participantes");
            System.out.println("Pressione 4 para Consultar por Datas os Eventos");
            System.out.println("Pressione -1 para encerrar");
            sWvar = Ler.umInt();
            switch (sWvar) {
                case 1: {
                    do {
                        sB = Ler.umInt();
                        System.out.println("Pressione 1 para Adicionar 1 novo local");
                        System.out.println("Pressione 2 para remover 1 local pelo nome");
                        System.out.println("Pressione 3 para Vizualizar 1 local");
                        System.out.println("Pressione 4 para Mostar todos os locais");
                        System.out.println("Pressione 5 para pesquisar uma tourada pelo local");
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
                                locais.add(pos, new Local(s, s1));
                                locais.sort(Local.compareLocalbyNome);
                                System.out.println("Adicionou " + s + " no pais " + s1);
                                pos++;
                                break;
                            }
                            case 2: {
                                System.out.println("Nome do local a remover?");
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
                                    System.out.println("Estas sao as touradas dessa Localidade: "+touradas2.toString());
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
                    }while (sB != -1) ;
                        //fazer em 1
                        break;
                    }
                    case 2: {
                        do {
                            sB = Ler.umInt();
                            System.out.println("Pressione 1 para Adicionar 1 nova tourada");
                            System.out.println("Pressione 2 para remover 1 local pelo nome");
                            System.out.println("Pressione 3 para Vizualizar 1 local");
                            System.out.println("Pressione 4 para Mostar todos os locais");
                            System.out.println("Pressione 5 para pesquisar uma tourada pelo local");
                            switch (sB) {
                                case 1: {
                                    System.out.println("Nome da Nova tourada");
                                    s = Ler.umaString();
                                    if (findTouradaByName(s, touradas) != null) {
                                        System.out.println("Ja existe " + s);
                                        break;
                                    }
                                    do {
                                        System.out.println("Qual tipo de Tourada?");
                                        s1 = Ler.umaString();
                                    }while(!s1.equals("Corrida") || !s1.equals("Largada") || !s1.equals("Espetaculo de Recortes") || !s1.equals("Touradas a Corda") || !s1.equals("Capeias"));
                                    if (s1.equals("Capeia")){
                                        System.out.println("Intruduza uma assistencia");
                                        System.out.println("Uma data");
                                        System.out.println("Um nome para a tourada");
                                        Tourada t = new Tourada(Ler.umInt(),Ler.umaString(),Ler.umaString());
                                        System.out.println("Qual local?");
                                        s2 = Ler.umaString();
                                        Local l = findLocalByName(s2,locais);
                                        while(l == null){
                                            System.out.println("Esse local nao existe");
                                            System.out.println("Introduza outro");
                                            s2 = Ler.umaString();
                                            l = findLocalByName(s2,locais);
                                        }
                                        capeias.add(pos,new Capeias(t,l));
                                        capeias.sort(Capeias.compareLocalbyNome);
                                        System.out.println("Adicionou a tourada " +t.getNomeEvento());
                                        pos++;
                                    }
                                    if (s1.equals("Touradas a Corda")){
                                        System.out.println("Intruduza uma assistencia");
                                        System.out.println("Uma data");
                                        System.out.println("Um nome para a tourada");
                                        Tourada t = new Tourada(Ler.umInt(),Ler.umaString(),Ler.umaString());
                                        System.out.println("Qual local?");
                                        s2 = Ler.umaString();
                                        Local l = findLocalByName(s2,locais);
                                        while(l == null){
                                            System.out.println("Esse local nao existe");
                                            System.out.println("Introduza outro");
                                            s2 = Ler.umaString();
                                            l = findLocalByName(s2,locais);
                                        }
                                        touradasACordas.add(pos,new TouradasACorda(t,l));
                                        touradasACordas.sort(TouradasACorda.compareLocalbyNome);
                                        System.out.println("Adicionou a tourada " +t.getNomeEvento());
                                        pos++;
                                    }
                                    if (s1.equals("Espetaculo de Recortes")){
                                        System.out.println("Intruduza uma assistencia");
                                        System.out.println("Uma data");
                                        System.out.println("Um nome para a tourada");
                                        Tourada t = new Tourada(Ler.umInt(),Ler.umaString(),Ler.umaString());
                                        System.out.println("Qual local?");
                                        s2 = Ler.umaString();
                                        Local l = findLocalByName(s2,locais);
                                        while(l == null){
                                            System.out.println("Esse local nao existe");
                                            System.out.println("Introduza outro");
                                            s2 = Ler.umaString();
                                            l = findLocalByName(s2,locais);
                                        }
                                        espetaculodeRecortes.add(pos,new EspectaculoDeRecortes(t,l));
                                        espetaculodeRecortes.sort(EspectaculoDeRecortes.compareLocalbyNome);
                                        System.out.println("Adicionou a tourada " +t.getNomeEvento());
                                        pos++;
                                    }
                                    if (s1.equals("Corridas")){
                                        System.out.println("Intruduza uma assistencia");
                                        System.out.println("Uma data");
                                        System.out.println("Um nome para a tourada");
                                        Tourada t = new Tourada(Ler.umInt(),Ler.umaString(),Ler.umaString());
                                        System.out.println("Qual local?");
                                        s2 = Ler.umaString();
                                        Local l = findLocalByName(s2,locais);
                                        while(l == null){
                                            System.out.println("Esse local nao existe");
                                            System.out.println("Introduza outro");
                                            s2 = Ler.umaString();
                                            l = findLocalByName(s2,locais);
                                        }
                                        corridas.add(pos,new Corridas(t,l));
                                        Corridas.sort(Corridas.compareLocalbyNome);
                                        System.out.println("Adicionou a tourada " +t.getNomeEvento());
                                        pos++;
                                    }
                                    if (s1.equals("Largada")){
                                        System.out.println("Intruduza uma assistencia");
                                        System.out.println("Uma data");
                                        System.out.println("Um nome para a tourada");
                                        Tourada t = new Tourada(Ler.umInt(),Ler.umaString(),Ler.umaString());
                                        System.out.println("Qual local?");
                                        s2 = Ler.umaString();
                                        Local l = findLocalByName(s2,locais);
                                        while(l == null){
                                            System.out.println("Esse local nao existe");
                                            System.out.println("Introduza outro");
                                            s2 = Ler.umaString();
                                            l = findLocalByName(s2,locais);
                                        }
                                        largadas.add(pos,new Largadas(t,l));
                                        largadas.sort(Largadas.compareLocalbyNome);
                                        System.out.println("Adicionou a tourada " +t.getNomeEvento());
                                        pos++;
                                    }
                                    // ignore se nao for o luis
                                    // Adptar as outras 4 classes para o modelo Capeia
                                    // Ainda falta dar output para o ficheiro que contem structs de touradas
                                    // falta enfiar os cavaleiros / GFA nestes grupos
                                    // Luis se possivel insereos nas classes que eu ponho no main
                                    // ignore se nao for o luis
                                    break;
                                }
                                case 2: {
                                    System.out.println("Nome do local a remover?");
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
                                default:{
                                    System.out.println("Saiu do menu das localidades");
                                    try{
                                        os2 = new FileOutputStream(f2);
                                        obOS2 = new ObjectOutputStream(os2);
                                        obOS2.writeObject(touradas);
                                        os2.close();
                                    }catch(IOException e){
                                        System.out.println(e.getMessage());
                                    }
                                    sB = -1;
                                }
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
                    case 4: {
                        //fazer em 4
                        System.out.println(4);
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