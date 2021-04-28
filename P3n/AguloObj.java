public final class AnguloObj {
    private double arcoRad;

    public AnguloObj(double angulo){
        this.arcoRad = this.converteAngulo(angulo);
    }

    public double getArcoRad(){
        return this.arcoRad;
    }

    public void setArcoRad(double angulo){
        this.arcoRad = angulo;
    }

    public double converteAngulo(double angulo){
        return Math.toRadians(angulo);
    }

    public double funcaoSeno(){
        return Math.sin(this.getArcoRad());
    }

    public double funcaoCosseno(){
        return Math.cos(this.getArcoRad());
    }

    public double funcaoTangente(){
        return Math.tan(this.getArcoRad());
    }
    
    public double funcaoCotangente(){
        return (1.0/Math.tan(this.getArcoRad())); 
    }

    @Override
    public String toString(){
        return "Arco: " + String.format("%.2f", this.getArcoRad()) + 
        "\nSeno: " + String.format("%.2f",this.funcaoSeno()) + 
        "\nCosseno: " + String.format("%.2f",this.funcaoCosseno()) + 
        "\nTangente: " + String.format("%.2f", this.funcaoTangente()) + 
        "\nCotangente: " + String.format("%.2f", this.funcaoCotangente()) + "\n" + 
        "-----------------------------------------------------";
    }
}
