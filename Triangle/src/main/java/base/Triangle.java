package base;
public class Triangle {
 double sideOne;
 double sideTwo;
 double sideThree;
 double Perimeter;
 double Area;
 double p;
 public String toString() {
	 return "The area of the triangle is" + this.getArea() +
			"The perimeter of the triangle is" +this.getPerimeter();
 };
 public Triangle(double sideOne, double sideTwo, double sideThree){
 sideOne =sideOne;
 sideTwo=sideTwo;
 sideThree=sideThree;
		 }
 public double getPerimeter() {
	return Perimeter;
}
public void setPerimeter(double perimeter) {
	Perimeter = perimeter;
}
public double getArea() {
	return Area;
}
public void setArea(double area) {
	Area = area;}
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
new Triangle(sideOne, sideTwo, sideThree);{
	sideOne = 2;
	sideTwo= 2;
	sideThree= 2;};}
}
