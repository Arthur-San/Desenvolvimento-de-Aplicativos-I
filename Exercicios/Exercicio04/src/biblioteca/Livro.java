
package biblioteca;


public class Livro {
    String titulo;
    String autor;
    int ano;    
    private int data;
    private int aluguel = 2;

    public Livro(String titulo, String autor, int ano, int data) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.data = data;
    }

    public Livro()
    {
    
    }
    
    public double getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    public int getAluguel() {
        return aluguel;
    }
    public void setAluguel(int aluguel) {
        this.aluguel = aluguel;
    }  
    
    //verifica a quantidades de dias a ser alugado e retorna o valor do aluguel
    public int calcDiasAlugado()
    {
        if(this.data > 0){
            data = aluguel * data;
        }
        return data;
    }
    @Override
    public String toString(){
        return 
                "********SAÍDA DE DADOS********" + "\n"
                + "Título: " + this.titulo + "\n"
                + "Autor: " + this.autor + "\n"
                + "Ano: " + this.ano + "\n"
                + "Dias a ser alugado: " +  this.data + "\n"
                + "Aluguel: R$" + this.aluguel + "\n";
    }
}
