

import java.util.Scanner;

public class PotentialEnergy {
    public PotentialEnergy(){
        height = 1;
        mass = 1;
        energy = height * mass * g;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PotentialEnergy potentialEnergy = new PotentialEnergy();
        System.out.println("Введите высоту:");
        potentialEnergy.setHeight(scan.nextDouble());
        System.out.println("Введите массу:");
        potentialEnergy.setMass(scan.nextDouble());
        potentialEnergy.calculateEnergy();
        potentialEnergy.showEnergy();
        scan.close();
    }
    public double calculateEnergy() {
        energy = height * mass * g;
        return energy;
    }
    public void showEnergy(){
        System.out.println("Высота: "+height);
        System.out.println("Масса: "+mass);
        System.out.println("Энергия: "+energy);
    }
    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    private double energy;
    private double height;
    private double mass;
    private static final double g = 9.81;
}
