package com.mycompany.desafiosplit;

public class DesafioSplit {
    public static void main(String[] args) {
        
        String pandinha = "Jamily; TI; 2019; Senai";
        separaString(pandinha);
    }
    
    public static void separaString(String caracter){
        int cont = 0;
        String aux = "";
        RepresentaDados dados = new RepresentaDados();
        String[] recebe = new String[4];
        
        for (int i = 0; i < caracter.length(); i++) {
            
            //verifica se é diferente de ";"
            caracter+= ";";
            
           if (caracter.charAt(i) !=  ';') {
              aux += caracter.charAt(i);
            }else{
               recebe[cont] = aux;
               cont++;
               aux = "";
           }
        }
            dados.setNome(recebe[0]);
            dados.setCurso(recebe[1]);
            int ano = Integer.parseInt(recebe[2].trim());
            dados.setAno(ano);
            dados.setInst(recebe[3]);
            System.out.println(dados.toString());  
        
    }
}
