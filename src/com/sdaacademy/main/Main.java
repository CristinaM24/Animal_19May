package com.sdaacademy.main;

import com.sdaacademy.model.*; // import all public class from respective package
import java.util.Scanner; // import the class given

import static com.sdaacademy.model.Animal.*;
// import all static methods from Animal class from package
import static com.sdaacademy.model.Animal.getNrAnimale;
//
    public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int nrPicioare = scanner.nextInt();
            System.out.println(getNrAnimale());
            Animal animal = new Animal( "terestru", 4, true);
            System.out.println(Animal.getNrAnimale());
            Animal animal2= new Animal(  "acvatic", 4, false);
            System.out.println(Animal.getNrAnimale());
            animal2.merge();
            final int x;
            x=2;
        }
}
