package com.campusdual.classroom;

public class FuelTank {

  protected int actualFuel = 10;

  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.actualFuel + " litros.");
  }

  public int getActualFuel() {
    return this.actualFuel;
  }

  public void setActualFuel(int newValue){
    if (newValue >= 0){
      this.actualFuel = newValue;
    } else {
      System.out.println("Valor de combustible no válido");
    }
  }
}
