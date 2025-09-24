public class App {
    public static void main(String[] args) throws Exception {
        
        veiculo onix = new veiculo();
        onix.setPlaca("ABC1234");           
        onix.setNome("Onix");
        onix.setCor("Prata");
        onix.setAno(2020);
        onix.setModelo(2020);
        onix.setId(1);



        veiculo polo = new veiculo();
        polo.setPlaca("XYZ5678");
        polo.setNome("Polo");
        polo.setCor("Preto");
        polo.setAno(2019);
        polo.setModelo(2019);   
        polo.setId(2);



        Fabricante chevrolet = new Fabricante();
        chevrolet.setId(1);
        chevrolet.setNome("Chevrolet");
        chevrolet.setCnpj("12.345.678/0001-90");
        chevrolet.setCidade("São Paulo");

        Fabricante volkswagen = new Fabricante();
        volkswagen.setId(2);
        volkswagen.setNome("Volkswagen");
        volkswagen.setCnpj("98.765.432/0001-10");
        volkswagen.setCidade("Curitiba");

        onix.imprimircarro();
        polo.imprimircarro();
    }
}
