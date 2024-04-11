package modelos;

/*
 * clase rectangulo extiende de figura
 */
public class Rectangulo extends Figura {
	
	private double base;
	private double altura;
	
/**
 * 
 *   @return 
 * @see modelos.Figura#artea() 
 *  
 * 
 */
	
	public  Rectangulo (double base, double altura) {
		this.base= base;
		this.altura= altura;
		
	}
	/**
	 *  Constructror que recibe como parametros la base y la altura del rectangulo,
	 *  en metros 
	 *  
	 * @param base    la base del rectangulo, en metros 
	 * @param altura  la base del rectangulo en metros
	 * 
	 */
	
	@Override
	public double area() {
		
		return base * altura;
	}

	/**
	 *  @see modelos.Figura#perimetro() 
	 */
	
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		
		double perimetro = 2* base + 2 * altura;
		return perimetro;  	 
	}

}
