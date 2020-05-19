
public class Carro {
 //reaproveitamento entre construtores
	private int ano;
	private String modelo;
    private double preco;
    
    //Constructor exigindo 3 parametros
    public Carro(int ano, String modelo, double preco){
        //this.ano = ano;
       // this.modelo = modelo;
        //this.preco = preco;
    	
    	// delimitações de valores
    	
    	if(ano >= 1891){
            this.ano = ano;
        }else{
            System.out.println("O ano informado está inválido. Por isso usaremos 2017!");
            this.ano = 2017;
        }

        if( modelo != null ){
            this.modelo = modelo;
        }else{
            System.out.println("O modelo não foi informado. Por isso usaremos Gol!");
            this.modelo = "Gol";
        }

        if(preco > 0){
            this.preco = preco;
        }else{
            System.out.println("O preço não é válido. Por isso usaremos 40000.0!");
            this.preco = 40000.0;
        }        
    }
    
    // Construtor exigindo 2 parametros
    
    public Carro(String modelo, double preco){
       // this.ano = 2017;
        //this.modelo = modelo;
       // this.preco = preco;
    	
    	//para reaproveitar os delimitadores do construtor anterior
    	//chamada de 3 parametroa dotando 2017 como de default (regra adotada quando ano não inserido)
    	this(2017,modelo,preco);
    	
   }
    
    //Getter e Setter
	
    public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
