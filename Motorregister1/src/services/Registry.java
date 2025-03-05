package services;

import models.Vehicle;

class Registry {
    private Vehicle[] vehicles;
    private int count;

    public Registry(int maxVehicles) {
        vehicles = new Vehicle[maxVehicles];
        count = 0;
    }

    public void addVehicle(Vehicle v) {
        if (count < vehicles.length) {
            vehicles[count] = v;
            count++;
        } else {
            System.out.println("Registeret er fuldt, kan ikke tilføje flere køretøjer.");
        }
    }

    public void listVehicles() {
        for (int i = 0; i < count; i++) {
            vehicles[i].printInfo();
            System.out.println();
        }
    }
}


