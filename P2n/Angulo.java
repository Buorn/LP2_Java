import java.lang.Math;

public class Angulo {
	//Atributos
	private double angulo;
	private double radiano;
	private double seno;
	private double cosseno;
	private double tangente;
	private double cotangente;
	//Metodos
	public void cvtAngulo(double angulo){
		this.setRadiano(angulo*Math.PI/180);
	}
	public void fSeno(double angulo){
		this.setSeno(Math.sin(angulo));
	}
	public void fCosseno(double angulo){
		this.setCosseno(Math.cos(angulo));
	}
	public void fTangente(double angulo){
		this.setTangente(Math.tan(angulo));
	}
	public void fCotangente(){
		this.setCotangente(1/this.getTangente());
	}
	public void status(){
		System.out.printf("Angulo em rad: %.2f\n", getRadiano());
		System.out.printf("Seno: %.2f\n", this.getSeno());
		System.out.printf("Cosseno: %.2f\n", this.getCosseno());
		System.out.printf("Tangente: %.2f\n", this.getTangente());
		System.out.printf("Cotangente: %.2f\n", this.getCotangente());
		System.out.println("-------------------------------------");
	}
	//Getters e Setters
	public double getAngulo() {
		return angulo;
	}

	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}

	public double getRadiano() {
		return radiano;
	}

	public void setRadiano(double radiano) {
		this.radiano = radiano;
	}

	public double getSeno() {
		return seno;
	}

	public void setSeno(double seno) {
		this.seno = seno;
	}

	public double getCosseno() {
		return cosseno;
	}

	public void setCosseno(double cosseno) {
		this.cosseno = cosseno;
	}

	public double getTangente() {
		return tangente;
	}

	public void setTangente(double tangente) {
		this.tangente = tangente;
	}

	public double getCotangente() {
		return cotangente;
	}

	public void setCotangente(double cotangente) {
		this.cotangente = cotangente;
	}

}
