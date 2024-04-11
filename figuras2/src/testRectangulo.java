import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import modelos.Rectangulo;

class testRectangulo {

static Rectangulo r1;
static Rectangulo r2;

@BeforeAll
static void setup(){
	r1 = new Rectangulo(3,2);
	r2 = new Rectangulo(3, 2);
}

@Test
void areaR1(){
	double arreaEsperada = 1;
	double areaObtenida = r1.area();
	assertEquals(arreaEsperada,areaObtenida);
	
}
void areaR2(){
	double arreaEsperada = 1;
	double areaObtenida = r2.area();
	assertEquals(arreaEsperada,areaObtenida);
	
}
void perimetroR1(){
	double perimetroEsperado = 1;
	double perometroObtenido = r1.perimetro();
	assertEquals(perimetroEsperado,perometroObtenido);
	
}

void perimetroR2(){
	double perimetroEsperado = 1;
	double perometroObtenido = r2.perimetro();
	assertEquals(perimetroEsperado,perometroObtenido);
	
}


}
