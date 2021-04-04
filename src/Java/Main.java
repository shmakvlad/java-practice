package Java;



public class Main {
    public static void main(String[] args) {
//        Practic ENUM
        AnimEnum crocodile = AnimEnum.CROCODILE;
        System.out.println(crocodile);
        crocodile.getTranslation();
        switch (crocodile){
            case CAT:
                System.out.println("I am a cat");
                break;
            case DOG:
                System.out.println("I am a dog");
                break;
            case FROG:
                System.out.println("I am a frog");
                break;
            case CROCODILE:
                System.out.println("I am a crocodile");
                break;
        }
        System.out.println();

        AnimEnum frog = AnimEnum.valueOf("CAT");
        System.out.println(frog);
        frog.getTranslation();
        System.out.println(frog.name());
        System.out.println(frog.ordinal());
        System.out.println();


//        Practic Nested Classes
        VloClassElectrocar electrocar = new VloClassElectrocar(1,"Prius");
        electrocar.start();

        System.out.println();
        VloClassElectrocar.Energy ve = new VloClassElectrocar.Energy();
        ve.energy = 1001;
        ve.charge();
    }
}
