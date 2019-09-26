package prova;

public class TestaProduto{
    
    public static void main(String[] args){
    
        Data data1 = new Data();
        data1.dia = 15;
        data1.mes = 9;
        data1.ano = 2019;
        
        Produto p1 = new Produto();
        p1.nome = "chinelo";
        p1.peso = 250;
        p1.dataDeFabricacao = data1;
        
        data1.imprimir();
        
    }
}
