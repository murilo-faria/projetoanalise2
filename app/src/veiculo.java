public class veiculo {

     private String placa;
    private String nome;
    private String cor;
    private Integer ano;
    private Integer modelo;
    private Integer id;
    private Fabricante fabricante;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public Integer getModelo() {
        return modelo;
    }
    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Fabricante getFabricante() {
        return fabricante;
    }
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
   
    public void  imprimircarro(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Placa: " + this.placa);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("ID: " + this.id);     
        System.out.println("Fabricante: " + fabricante.getNome());
        System.out.println("CNPJ: " + fabricante.getCnpj());
        System.out.println("Cidade: " + fabricante.getCidade());
        System.out.println("-------------------------");
    }
   
    
    

}
