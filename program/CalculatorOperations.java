package program;

public class CalculatorOperations {
	private double p;
	private double q;
	private double r;
	public double getP() {
		return p;
	}
	public void setP(double p) {
		this.p = p;
	}
	public double getQ() {
		return q;
	}
	public void setQ(double q) {
		this.q = q;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double add(double p,double q) {
		return p+q;
	}
	public double add(double p,double q,double r) {
		return p+q+r;
	}
	public double sub(double p,double q) {
		return p-q;
	}
	public double sub(double p,double q,double r) {
		return p-q-r;
	}
	public double mul(double p,double q) {
		return p*q;
		
	}
	public double mul(double p,double q,double r) {
		return p*q*r;
		
	}
	public double div(double p,double q) {
		return p/q;
	}
	public double div(double p,double q,double r) {
		return p/q/r;
	}

}
