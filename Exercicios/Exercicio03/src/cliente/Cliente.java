
package cliente;


public class Cliente {
    // atributos-variáveis
    private String nome;
    private int idade;
    private double renda;
    
    //métodos
    public void setNome(String nome){
        this.nome = nome;
    }    
    public String getNome(){
        return nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;        
    }
    public int getIdade(){
        return idade;
    }
    
    public void setRenda(double renda){
        this.renda = renda;
    }
    public double getRenda(){
        return renda;
    }
    
    
    //verificadores
    public String classificarIdade(){
        String idadeVerificada;        
        if(this.idade >= 18){
            idadeVerificada = "O cliente é maior de idade";
        }else{
            idadeVerificada = "O cliente é menor de idade";
        }
        return idadeVerificada;
    }
    
    public String classificarRenda(){
        String rendaVerificada;
        if(this.renda >= 15000){
            rendaVerificada = "O cliente é rico";
        }else{
            rendaVerificada = "O cliente é pobre";
        }
        return rendaVerificada;
    }
    
    
    
}
