package pl.sda.javastart.weekend2.day3;

public class ObjectsFieldChanging {
    public static void main(String[] args) {
        simpleReferences();
        changingObjectInternalsByReferences();
    }

    private static void changingObjectInternalsByReferences(){
        ExperimentalObject reference1 = new ExperimentalObject(123);
        ExperimentalObject reference2 = reference1;
        System.out.println(reference1.getAttribute());
        System.out.println(reference2.getAttribute());

    }

    private static void simpleReferences() {
        Object referenceToObjectX = new Object();
        Object anotherReferenceToObjectX = referenceToObjectX;
        Object referenceToObjectY = new Object();

        System.out.println(referenceToObjectX);
        System.out.println(anotherReferenceToObjectX);
        System.out.println(referenceToObjectY);
    }
}
