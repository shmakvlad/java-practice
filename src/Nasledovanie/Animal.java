package Nasledovanie;


import Serialization.Serialization;

import java.io.Serializable;

public class Animal implements Serializable {

        String name;
        String color;
        static int poroda;

        public int publ;
        private int priv;
        protected int protect;
        int var;
        static protected int change;

        public Animal(){
            name = "No name";
        }

        public Animal(String name){
            this.name = name;
        }

        public void Walk(String place){
            System.out.println("We are walking here: " + place);
            publ = 1;
            priv = 1;
            protect = 1;
            var = 1;
        }

        public void sleep(){
            System.out.println("Animal Zzzzz");
        }

        private void sleepPrivate(){
            System.out.println("Zzzzz");
        }

        protected void sleepProtected(){
            System.out.println("Zzzzz");
            sleepPrivate();
        }

        void sleeping(){
            System.out.println("Zzzzz");
        }

        public void saySmth(){
            System.out.println("Hello !");
        }

        public String toString(){
            return name;
        }
}


