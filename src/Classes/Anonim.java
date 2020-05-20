package Classes;

import java.util.ArrayList;

class User implements AbleToCall{
    public void sayHay(){
        System.out.println("Hello !");
    }

    @Override
    public void callMe() {
        System.out.println("I am calling you...");
    }
}

class Animals implements AbleToCall{

    @Override
    public void callMe() {
        System.out.println("I am calling Animals...");
    }
}

interface AbleToCall{
    public void callMe();
}

public class Anonim {
    public static void main(String[] args) {
        User user = new User();
        user.sayHay();
        user.callMe();

        User user2 = new User(){
            public void sayHay(){
                System.out.println("Hello, I am an crocodile.");
            }
        };
        user2.sayHay();
        user2.callMe();

        Animals anim = new Animals();
        anim.callMe();

         User user3 = new User(){
             @Override
             public void callMe() {
                 super.callMe();
                 System.out.println("world");
             }

             @Override
             public void sayHay() {
                 super.sayHay();
                 System.out.println("dont worry be happy");
             }
         };
        System.out.print("user3: ");
        user3.callMe();
        user3.sayHay();

        System.out.println();
        AbleToCall usercall = new User();
        usercall.callMe();
        AbleToCall animlacall = new Animals();
        animlacall.callMe();

        AbleToCall atc = new AbleToCall() {
            @Override
            public void callMe() {
                System.out.println("I anonimni class");
            }
        };
        atc.callMe();

        System.out.println();
        System.out.println();
        ArrayList<AbleToCall> list = new ArrayList<>();

        list.add(usercall);
        list.add(anim);
        list.add(user);
        list.add(animlacall);
        list.add(user3);
        list.add(atc);
        list.add(user2);

        for (AbleToCall call : list){
            call.callMe();
        }

        System.out.println();
        System.out.println();

        AbleToCall able = new AbleToCall() {
            @Override
            public void callMe() {
                System.out.println("able");
            }
        };
        able.callMe();

        AbleToCall asd = new User(){
            @Override
            public void callMe() {
                System.out.println("ole ole");
            }
        };
        asd.callMe();

        AbleToCall animals = new Animals(){
            @Override
            public void callMe() {
                System.out.println("hello world");
            }
        };
        animals.callMe();

    }

}
