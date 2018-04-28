package pl.sda.javastart.weekend1.day1;

public class CatsMain {

    public static void main(String[] args) {
        createCatsArrayWithIndexesAdding();
        createCatsArrayWithInicialization();

    }

    private static void createCatsArrayWithInicialization() {
        Cat firstCat = new Cat();
        Cat secondCat = new Cat();
        Cat thirdCat = new Cat();

        firstCat.setName("Mruczek");
        Cat[] cats = new Cat[]{firstCat, secondCat, thirdCat};

        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }
    }

    private static void createCatsArrayWithIndexesAdding() {
        Cat firstCat = new Cat();
        Cat secondCat = new Cat();
        Cat thirdCat = new Cat();

        firstCat.setName("Mruczek");

        Cat[] cats = new Cat[3];
        cats[0] = firstCat;
        cats[1] = secondCat;
        cats[2] = thirdCat;

        for (Cat catty : cats) {
            System.out.println(catty.getName());
        }

    }


}
