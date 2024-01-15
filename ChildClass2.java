public class ChildClass2 extends ParentClass {
    private double variable3;

    public ChildClass2(int variable1, double variable3) {
        super(variable1);
        this.variable3 = variable3;
    }

    public double getVariable3() {
        return variable3;
    }

    public void setVariable3(double variable3) {
        this.variable3 = variable3;
    }

    public void additionalMethod2() {
        System.out.println("Додатковий метод.");
    }
}
