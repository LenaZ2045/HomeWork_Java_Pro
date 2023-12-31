package com.telran.org.homework_23_11_2023;

public class Auto {

    private final int vehicleNumber;
    private final String vehicleColor;
    private final String vehicleBrand;
    private final int vehicleMileage;
    private final int vehiclePrice;

    public String getVehicleColor() {
        return vehicleColor;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public int getVehicleMileage() {
        return vehicleMileage;
    }

    public int getVehiclePrice() {
        return vehiclePrice;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "vehicleNumber=" + vehicleNumber +
                ", vehicleColor='" + vehicleColor + '\'' +
                ", vehicleBrand='" + vehicleBrand + '\'' +
                ", vehicleMileage=" + vehicleMileage +
                ", vehiclePrice=" + vehiclePrice +
                '}';
    }

    public Auto(int vehicleNumber, String vehicleColor, String vehicleBrand, int vehicleMileage, int vehiclePrice) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleColor = vehicleColor;
        this.vehicleBrand = vehicleBrand;
        this.vehicleMileage = vehicleMileage;
        this.vehiclePrice = vehiclePrice;
    }
}
