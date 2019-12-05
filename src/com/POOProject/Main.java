package com.POOProject;

import com.myinputs.Ler;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static Local findLocalByName(String s,ArrayList<Local> locais) {
        for(Local local : locais) if (local.getLocalidade().equals(s)){
            return local;
        }
        return null;
    }
    public static Tourada findTouradaByName(String s,ArrayList<Tourada> touradas) {
        for(Tourada tourada : touradas) if (tourada.getNomeEvento().equals(s)){
            return tourada;
        }
        return null;
    }
    public static void main(String[] args) {
        FileInputStream is;
        ObjectInputStream obIP;
        FileOutputStream os;
        ObjectOutputStream obOS;
        int pos = 0;String s;
         ArrayList<Local> locais = new ArrayList<Local>();
         ArrayList<Tourada> touradas = new ArrayList<Tourada>();
        // ArrayList<NotDefinedYet> NotDefinedYet = new ArrayList<NotDefinedYet>();
        // ArrayList<NotDefinedYet> NotDefinedYet = new ArrayList<NotDefinedYet>();
        // ArrayList<NotDefinedYet> NotDefinedYet = new ArrayList<NotDefinedYet>();
        // ArrayList<NotDefinedYet> NotDefinedYet = new ArrayList<NotDefinedYet>();
        File f1 = new File("fichEventos.dat");
        try {
            is = new FileInputStream(f1);
            obIP = new ObjectInputStream(is);
           /* NotDefinedYet = (ArrayList<NotDefinedYet>)*/ obIP.readObject();
            is.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        int sWvar = 0,sB = 0;
        do {
            System.out.println("Pressione 1 para ir para o Menu das Regioes Dos Eventos");
            System.out.println("Pressione 2 para ir para o Menu das Touradas");
            System.out.println("Pressione 3 para ir para o Menu dos Participantes");
            System.out.println("Pressione 4 para Consultar por Datas os Eventos");
            /*System.out.println("Pressione 5 para ...");
            System.out.println("Pressione 6 para ...");
            System.out.println("Pressione 7 para ...");
            System.out.println("Pressione 8 para ...");
            System.out.println("Pressione 9 para ...");*/
            System.out.println("Pressione -1 para encerrar");
            sWvar = Ler.umInt();
            switch(sWvar){
                case 1:{
                    do{
                        sB = Ler.umInt();
                        System.out.println("Pressione 1 para Adicionar 1 novo local");
                        System.out.println("Pressione 2 para remover 1 local pelo nome");
                        System.out.println("Pressione 3 para Vizualizar 1 local");
                        System.out.println("Pressione 4 para Mostar todos os locais");
                        System.out.println("Pressione 5 para pesquisar uma tourada pelo local");
                        switch (sB){
                            case 1:{
                                System.out.println("Nome do Novo local");
                                s = Ler.umaString();
                                if (findLocalByName(s,locais) != null){
                                    System.out.println("Ja existe "+s);
                                    break;
                                }
                                locais.add(pos,new Local (s));
                                locais.sort(Local.compareLocalbyNome);
                                System.out.println("Adicionou "+s);
                                pos++;
                                break;
                            }
                            case 2:{
                                System.out.println("Nome do Novo local");
                                s = Ler.umaString();
                                Local classeARemover = findLocalByName(s,locais);
                                if ( classeARemover != null){
                                    locais.remove(classeARemover);
                                    System.out.println("Removeu "+s);
                                    break;
                                }
                                else System.out.println("Nao existe Esse Local");
                                break;
                            }
                            case 3:{
                                System.out.println("Qual local quer ver?");
                                s = Ler.umaString();
                                Local classeAVer = findLocalByName(s,locais);
                                if (classeAVer != null){
                                    System.out.println(classeAVer);
                                    break;
                                }
                                else System.out.println("Nao existe Esse Local");
                                break;
                            }
                            case 4:{
                                System.out.println(locais);
                                break;
                            }
                            case 5:{
                                System.out.println("Qual local quer procurar a tourada?");
                                s = Ler.umaString();/*
                                Local classeAVer = findLocalByName(s,locais);
                                if(classeAVer != null && touradas.isEmpty() == false){
                                   for(Tourada touradaAProcura : touradas)
                                    if(touradaAProcura.getNomeEvento().equals(classeAVer.getLocalidade())) {
                                        System.out.println(touradaAProcura);
                                        break; // ainda nao esta feita talvez ter que alterar as sub classes de tourada
                                    }

                                }*/
                            }
                        }
                    }while(sB != -1);
                    //fazer em 1
                    break;
                }
                case 2:{
                    //fazer em 2
                    System.out.println(2);
                    break;
                }
                case 3:{
                    //fazer em 3
                    System.out.println(3);
                    break;
                }
                case 4:{
                    //fazer em 4
                    System.out.println(4);
                    break;
                }
               /* case 5:{
                    //fazer em 5
                    System.out.println(5);
                    break;
                }
                case 6:{
                    //fazer em 6
                    System.out.println(6);
                    break;
                }
                case 7:{
                    //fazer em 7
                    System.out.println(7);
                    break;
                }
                case 8:{
                    //fazer em 8
                    System.out.println(8);
                    break;
                }
                case 9: {
                    //fazer em 9
                    System.out.println(9);
                    break;
                }

                */
                default:{
                    System.out.println("Fechou o programa");
                    sWvar = -1;
                }
            }
        }while (sWvar != -1);
    }
}
