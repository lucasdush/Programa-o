package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Diretor diretor = new Diretor("Lucas Xavier", "846546512", "1147741111", Sexo.MASCULINO, 5000, "17/11/1990", "01/08/2014");
        Gerente gerente = new Gerente("Julenilson", "3473985465", "7787895555", Sexo.MASCULINO, 7000, "26/02/1991", "05/10/2015");
        Motoboy motoboy = new Motoboy("Eliane", "832037422", "0900909090", Sexo.FEMININO, 9000, "08/09/1982", "01/09/2014", "OUJ7945");


        System.out.println(diretor.toString());
        System.out.println(gerente.toString());
        System.out.println(motoboy.toString());


        gerente.admitir(motoboy);
    }
}