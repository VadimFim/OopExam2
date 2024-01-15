public class ParentClass {
    private int variable1;

    public ParentClass(int variable1) {
        this.variable1 = variable1;
    }

    public final void preventOverrideMethod() {
        System.out.println("Метод не перевизначиться.");
    }

    public int getVariable1() {
        return variable1;
    }

    public void setVariable1(int variable1) {
        this.variable1 = variable1;
    }
}
