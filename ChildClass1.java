public class ChildClass1 extends ParentClass {
    private String variable2;

    public ChildClass1(int variable1, String variable2) {
        super(variable1);
        this.variable2 = variable2;
    }

    public String getVariable2() {
        return variable2;
    }

    public void setVariable2(String variable2) {
        this.variable2 = variable2;
    }

    public void additionalMethod1() {
        System.out.println("Додатковий метод.");
    }
}
