package com.example.problemsolving.factorymethodpattern


fun main(){

    val vehicleFactory = VehicleFactory()
    val plane = vehicleFactory.getVehicle("Plane")
    val  car = vehicleFactory.getVehicle("Car")

    plane.setNumberOfPassengers(100)
    plane.setNumberOfWheels(20)
    plane.hasGas(false)

    car.setNumberOfPassengers(100)
    car.setNumberOfWheels(20)
    car.hasGas(true)






}