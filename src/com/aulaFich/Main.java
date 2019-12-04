package com.aulaFich;

import com.myinputs.Ler;

public class Main {

    public static void main(String[] args) {
        int sWvar = 0;
        do {
            System.out.println("Pressione 1 para ...");
            System.out.println("Pressione 2 para ...");
            System.out.println("Pressione 3 para ...");
            System.out.println("Pressione 4 para ...");
            System.out.println("Pressione 5 para ...");
            System.out.println("Pressione 6 para ...");
            System.out.println("Pressione 7 para ...");
            System.out.println("Pressione 8 para ...");
            System.out.println("Pressione 9 para ...");
            System.out.println("Pressione -1 para encerrar");
            sWvar = Ler.umInt();
            switch(sWvar){
                case 1:{
                    System.out.println(1);
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
                case 5:{
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
                default:{
                    System.out.println("Fechou o programa");
                    sWvar = -1;
                }
            }
        }while (sWvar != -1);
    }
}
