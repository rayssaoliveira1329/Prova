package prova;

public class Triangulo{
    double base;
    double altura;
    double area;
    
    public void calcularArea(){
        area = (base * altura) / 2;
        System.out.println(area);
    }
}
