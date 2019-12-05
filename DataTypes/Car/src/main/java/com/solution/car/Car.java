package com.solution.car;

public class Car {
    //Primative Data Types exmapples.
    int minSpeed = 0;
    int maxSpeed = 100;
    double weight = 4000;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCarOwner = "Omar";
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4; //miles per gallons
    
    int numberOfPeopleInCar = 1;
    
    //Constructor Method, it is used to create its own custom variables.
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
        
    
    }
// Print Method
public void printVariables(){
   System.out.println(minSpeed);
   System.out.println(maxSpeed);
   System.out.println(weight);
   System.out.println(isTheCarOn);
   System.out.println(condition);
   System.out.println(nameOfCarOwner);
   System.out.println(numberOfPeopleInCar);
}

public void changeCondition(){
    condition = 'C';
    minSpeed = maxSpeed;
    maxSpeed = maxSpeed + 1;
}

public void getIn(){
    //numberOfPeopleInCar = numberOfPeopleInCar + 1;
    numberOfPeopleInCar++;
}

public void getOut(){
    //numberOfPeopleInCar = numberOfPeopleInCar = 1;
    numberOfPeopleInCar--;
}

public double howManyMilesTillOutOfGas(){
    return currentFuel * mpg;
}

public double maxMilesPerFillup(){
    return maxFuel * mpg;
}

  public static void main(String[] args) {
      // Car Obj (Instalce of the class).
      //Objects are Reference Data Types.
      //Car BMW  = new Car();
      //System.out.println("A new Car Details:");
      //BMW.printVariables();
      //Car DavidCar = BMW;
      //System.out.println("David Car Details:");
      //DavidCar.changeCondition();
      //DavidCar.printVariables();
    Car birthdayPresent = new Car(200, 5000.5,true);
    System.out.println("Birthday Car v1: ");
    birthdayPresent.printVariables();
    birthdayPresent.getIn();
    birthdayPresent.getIn();
    birthdayPresent.getIn();
    System.out.println("Miles Left: " + birthdayPresent.howManyMilesTillOutOfGas());
    System.out.println("Max Miles: " + birthdayPresent.maxMilesPerFillup());    
    System.out.println("Birthday Car v2: ");
    birthdayPresent.printVariables();
    birthdayPresent.getOut();
    System.out.println("Birthday Car v3: ");
    birthdayPresent.printVariables();
    //System.out.println("Christmas Car: ");
    //Car christmasPresent = new Car(300, 2000, false);
    //christmasPresent.printVariables();
  }
}
