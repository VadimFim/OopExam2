public class MainClasss {
    public static void main(String[] args) {
        ParentClass parentObject = new ParentClass(10);
        parentObject.preventOverrideMethod();

        ChildClass1 childObject1 = new ChildClass1(20, "Hello");
        childObject1.preventOverrideMethod();
        childObject1.additionalMethod1();

        ChildClass2 childObject2 = new ChildClass2(30, 3.14);
        childObject2.preventOverrideMethod();
        childObject2.additionalMethod2();

        GrandchildClass1 grandchildObject1 = new GrandchildClass1(40, "World");
        grandchildObject1.preventOverrideMethod();
        grandchildObject1.additionalMethod3();

        GrandchildClass2 grandchildObject2 = new GrandchildClass2(50, 2.71);
        grandchildObject2.preventOverrideMethod();
        grandchildObject2.additionalMethod4();
    }
}
