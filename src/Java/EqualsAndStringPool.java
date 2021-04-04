package Java;


public class EqualsAndStringPool {
    public static void main(String[] args) {
        Animals animal1 = new Animals(1);
        Animals animal2 = new Animals(1);
        System.out.println(animal1.equals(animal2));
        System.out.println(animal1 == animal2);

        System.out.println();
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

    }
}

class Animals{
    private int id;

    public Animals(int id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Animals animal = (Animals) obj;
        return this.id == animal.id;
    }
}
