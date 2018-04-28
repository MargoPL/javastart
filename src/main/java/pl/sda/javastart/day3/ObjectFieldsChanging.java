package pl.sda.javastart.day3;

public class ObjectFieldsChanging {
    public static void main(String[] args) {
//        simpleReferences();
        changingObjectInternalsByReferences();

        String text = "napis";

        text = text.substring(1, 4);
        System.out.println(text);
    }

    private static void changingObjectInternalsByReferences() {
        ExperimentalObject reference1 =
                new ExperimentalObject(123);
        ExperimentalObject reference2 = reference1;
        System.out.println(reference1.getAttribute());
        System.out.println(reference2.getAttribute());

        reference1.setAttribute(1);

        System.out.println(reference1.getAttribute());
        System.out.println(reference2.getAttribute());

        ExperimentalObject reference3 = new ExperimentalObject(123);
        ExperimentalObject reference4 = reference3;
        System.out.println(reference3.getAttribute());
        System.out.println(reference4.getAttribute());
        reference4 = new ExperimentalObject(3);
        System.out.println(reference3.getAttribute());
        System.out.println(reference4.getAttribute());
    }

    private static void simpleReferences() {
        Object referenceToObjectX = new Object();
        Object anotherReferenceToTheSameObjectX = referenceToObjectX;
        Object referenceToObjectY = new Object();

        System.out.println(referenceToObjectX);
        System.out.println(anotherReferenceToTheSameObjectX);
        System.out.println(referenceToObjectY);
    }
}
