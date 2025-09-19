import java.util.Scanner;
public class Circle {
    private double r;
    public Circle(double r) {
        this.r = r;
    }
    public Circle() {
        this.r = 1.0;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public void input(Scanner sc) {
        System.out.print("Nhap ban kinh r: ");
        r = sc.nextDouble();
    }
    public void output() {
        System.out.println("Thong tin hinh tron:");
        System.out.println("Ban kinh: " + r);
    }
    public double area() {
        return Math.PI * r * r;
    }
    public double circumference() {
        return 2 * Math.PI * r;
    }
}
