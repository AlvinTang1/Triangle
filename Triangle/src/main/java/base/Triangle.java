package base;
public class Triangle {
 private double sideOne;
 private double sideTwo;
 private double sideThree;
 private double Perimeter;
 private double Area;
 private double p;
 public String toString() {
	 return "The area of the triangle is" + this.getArea() +
			"The perimeter of the triangle is" +this.getPerimeter();
 };

 public double getPerimeter() {
	return Perimeter;
}

public double getArea() {
	return Area;
}

public double getSideOne() {
	return sideOne;
}
public void setSideOne(double sideOne) {
	this.sideOne = sideOne;
}
public double getSideTwo() {
	return sideTwo;
}
public void setSideTwo(double sideTwo) {
	this.sideTwo = sideTwo;
}
public double getSideThree() {
	return sideThree;
}
public void setSideThree(double sideThree) {
	this.sideThree = sideThree;
Perimeter = sideOne + sideTwo + sideThree;
p= Perimeter/2;
Area = Math.sqrt(p*(p-sideOne)*(p-sideTwo)*(p-sideThree));
}}
