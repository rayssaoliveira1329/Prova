package prova;

public class Equipamento{    
    double preço;
    
    public double adicionarImposto(double taxa){
        taxa = (preço * 0.15) + preço;
        return taxa;
    }
    
}
