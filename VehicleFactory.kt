package com.example.problemsolving.facadedesignpattern

class VehicleFactory {


    var car = Car()
    var plane = Plane()


    fun makeCar(wheels: Int, passengers: Int, gas: Boolean) {
        car.setNumberOfWheels(wheels)
        car.setNumberOfPassengers(passengers)
        car.hasGas(gas)
    }

    fun makePlane(wheels: Int, passengers: Int, gas: Boolean) {
        plane.setNumberOfWheels(wheels)
        plane.setNumberOfPassengers(passengers)
        plane.hasGas(gas)

    }


}