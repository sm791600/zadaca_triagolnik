
public class Vlez {
private double a,b,c;

public double getA() {
	return a;
}
public void setA(double a) {
	this.a = a;
}
public double getB() {
	return b;
}
public double getC() {
	return c;
}
public void setB(double b) {
	this.b=b;
}
public void setC(double c) {
	this.c=c;
}

public boolean rezultat() {
	return (c<a+b && b<a+c && a<b+c);
}
}
