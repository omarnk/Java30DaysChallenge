package com.solution.car;

public class Car {
    //Primative Data Types exmapples.
    int minSpeed = 0;
    int maxSpeed = 100;
    double weight = 4000;
    boolean isTheCarOn = false;
    char condition = 'A';
// Print Method
public void printVariables(){
   System.out.println(minSpeed);
   System.out.println(maxSpeed);
   System.out.println(weight);
   System.out.println(isTheCarOn);
   System.out.println(condition); 
}

public void changeCondition(){
    condition = 'C';
    minSpeed = maxSpeed;
    maxSpeed = maxSpeed + 1;
}
  public static void main(String[] args) {
      // Car Obj (Instalce of the class).
      //Objects are Reference Data Types.
      Car BMW  = new Car();
      System.out.println("A new Car Details:");
      BMW.printVariables();
      Car DavidCar = BMW;
      System.out.println("David Car Details:");
      DavidCar.changeCondition();
      DavidCar.printVariables();
      
      
      
  }
}
