package com.mycompany.desafiosplit;

public class RepresentaDados {
    private String nome;
    private String curso;
    private int ano;
    private String inst;
    
    public RepresentaDados(){
        
    }

    public RepresentaDados(String nome, String curso, int ano, String inst) {
        this.nome = nome;
        this.curso = curso;
        this.ano = ano;
        this.inst = inst;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getInst() {
        return inst;
    }

    public void setInst(String inst) {
        this.inst = inst;
    }

    @Override
    public String toString() {
        //return "RepresentaDados{" + "nome=" + nome + ", curso=" + curso + ", ano=" + ano + ", inst=" + inst + '}';
        
        return String.format("Nome  : %-30s\tCurso : %-30s\nAno   : %d\nInst. : %30s", this.nome, this.curso, this.ano, this.inst);
                
    }

    
    
}
