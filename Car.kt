package com.example.problemsolving.factorymethodpattern

class Car : VehicleInterface {

    var wheels = 0
    var passenger = 0
    var hasGas = false
    override fun setNumberOfWheels(wheels: Int) {
        this.wheels = wheels
    }

    override fun setNumberOfPassengers(passengers: Int) {
        this.passenger = passengers
    }

    override fun hasGas(gas: Boolean) {
       this.hasGas = gas
    }

}