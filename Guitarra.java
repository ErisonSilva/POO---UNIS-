package unidade_1;

////declaração da classe

      private string numeriSerie, fabricante, modelo, tiopo, madeira;
      private double preço;
  
////criação do construtor da classe guitarra

  public Guitarra(
              string numeroSerie, string fabricante,
              string modelo, string tipo,
              string madeira, double preço) 
         {     
         this.numeroSerie = numeroSerie;
         this.fabricante = fabricante;
         this.modelo = modelo;
         this.tipo = tipo;
         this.madeira = madeira;
         this.preço = preço;
         }
         
  public string getNumeroSerie(){
      return numeroSerie;
      }
  public void setNumeriSerie(string numeriSerie){
      this.numeroSerie = numeroSerie;
      }
  public string getFabricante(){
      return fabricante;
      }
  public void setFabricante(string fabricante){
      this.fabricante - fabricante;
      }
  public string getModelo(){
      return modelo;
      }
  public void setModelo(string modelo){
      this.modelo = modelo;
      {
  public string getTipo(){
      return tipo;
      }
  public void setTipo(string tipo){
      this.tipo = tipo;
      }
  public string madeira(){
      return madeira;
      }
  public void setmadeira(string madeira){
      this.madeira = madeira;
      }
  public duble getpreço(){
      return preço;
      }
  public void setpreço(double preço){
      this.preço = preço;
      }
////metodo main()       
      
  public static void main(string[] args){
  
      Guitarra minhaGuitarra = new Guitarra("09080706", "Yamaha", "telecaster", "eletrica", "mogno", 2900);
     
  system.out.println(minhaGuitarra.getNumeroSerie());
  system.out.println(minhaGuitarra.getMadeira());
  system.out.println(minhaGuitarra.getPreço());
  system.out.println(minhaGuitarra.getTipo());
  }
  
 }
     
      
      
      
      
      
      
      
