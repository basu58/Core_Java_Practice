package com.basu.n;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Time {
  int CountingMinutesI(String str) {
      String[] horas = str.split("-");
  
    int minutosIniciais = geraMinutos(horas[0]);
    int minutosFinais = geraMinutos(horas[1]);
  
    int resposta = 0;
    if (minutosIniciais < minutosFinais) {
         resposta = minutosFinais - minutosIniciais;
    }
    else {
         resposta = (24*60) - minutosIniciais + minutosFinais;
    }
  
    return resposta;
  
  }
 
  int geraMinutos(String tempo) {
    int minutos = 0;
  
    String[] horaMinuto = tempo.split(":");
  
    if (horaMinuto[1].endsWith("am")) {
        minutos += 60 * Integer.parseInt(horaMinuto[0]);
    }
    else {
        minutos += (60 * 12) + 60 * Integer.parseInt(horaMinuto[0]);
    }
  
    minutos += Integer.parseInt(horaMinuto[1].substring(0,2));
 
    return minutos;
  }
 
  public static void main (String[] args) {
    // keep this function call here   
    Scanner  s = new Scanner(System.in);
    Time c = new Time();
    System.out.print(c.CountingMinutesI(s.nextLine()));
  } 
 
}  