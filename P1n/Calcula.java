import static java.lang.Math.sqrt;

public class Calcula {
	//Atributos
    	private double a;
 	private double b;
    	private double c;
    	private double areaCirculo;
    	private double areaRetangulo;
    	private double areaTriangulo;
	private String nome;
	private double result;
        private final double PI = 3.1416f;
                                         
        //Metodos
        public void areaCirculo(double a){
        	this.setAreaCirculo(PI*a*a);
        }
        public void areaRetangulo(double a, double b){
        	this.setAreaRetangulo(a*b);
        }
        public void areaTriangulo(double a, double b, double c){
        	double p =(a+b+c)/2;
                this.setAreaTriangulo(sqrt(p*(p-a)*(p-b)*(p-c)));
        }
        public void tipoTriangulo(double a, double b, double c){
            	if((a == b)&&(b == c)){
                	System.out.println("Triangulo Equilatero");
                }else if((a != b)&&(b != c)){
                	System.out.println("Triangulo Escaleno");
                }else if((a != b)||(b != c)||(b != c)){
                	System.out.println("Trianngulo Isoceles");
                }
        }
                                            
        public void status(){
        //	System.out.println("Area do " + this.getNome() + ": " + this.getResult());
       		System.out.printf("Area do %s: %.2f \n", this.getNome(), this.getResult());
	 }

        //Getters and Setters
        public double getA() {
        	return a;
        }
        public void setA(double a) {
        	this.a = a;
        }
       	public double getB() {
        	return b;
        }
        public void setB(double b) {
        	this.b = b;
        }
        public double getC() {
        	return c;
	}
        public void setC(double c) {
        	this.c = c;
        }
	public String getNome() {
               return nome;
        }
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getResult() {
		return result;
	} 
	public void setResult(double result) {
		this.result = result;
	}
	public double getAreaCirculo() {
		return areaCirculo;
	}
	public void setAreaCirculo(double areaCirculo) {
		this.areaCirculo = areaCirculo;
	}
	
	public double getAreaRetangulo() {
		return areaRetangulo;
	}
	public void setAreaRetangulo(double areaRetangulo) {
		this.areaRetangulo = areaRetangulo;
	}
	public double getAreaTriangulo() {
		return areaTriangulo;
	}	
	public void setAreaTriangulo(double areaTriangulo) {
		this.areaTriangulo = areaTriangulo;
	}
}
