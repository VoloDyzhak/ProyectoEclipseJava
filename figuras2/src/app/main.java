package app;
import modelos.Rectangulo;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Rectangulo r1 = new Rectangulo(3,2);
	     Rectangulo r2 = new Rectangulo(3,2);
     
     
       double area_r1 = r1.area();
       
       double perimetro = r2.perimetro();
       System.out.println(area_r1);
       System.out.println(perimetro);
	}

}
