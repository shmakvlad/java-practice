package JFB;


public class VloClassElectrocar {

    private int id;
    private String name;
    private static String surname;

    public VloClassElectrocar(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Lets get ridiculous");
        Energy energy = new Energy();
        energy.energy = 99;
        energy.charge();

        double CONST = 99.9;
        final int olo = 111;

        class MethodClass {
            private int id;

            public MethodClass(int id) {
                this.id = id;
            }

            public void someMethod() {
                System.out.println("Const " + CONST);
                System.out.println("Final " + olo);
                System.out.println(name);
                System.out.println("MethodClass class id: " + id);
                System.out.println("Main class id: "+ getId());
            }
        }
        MethodClass mc = new MethodClass(11);
        mc.someMethod();
    }

    private class Motor {
        public void startMotor() {
            System.out.println("Motor for car " + id + " is running");
        }
    }

    public static class Energy {
        public int energy;
        public void charge() {
            System.out.println("Energy " + energy);
        }
    }
}
