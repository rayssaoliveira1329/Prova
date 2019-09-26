package prova;

public class TestaEquipamento{
    public static void main(String[] args){
        
        Equipamento e1 = new Equipamento();
        e1.preço = 29.99;
        
        System.out.println(""+e1.adicionarImposto(29.99));
    }
    
}
