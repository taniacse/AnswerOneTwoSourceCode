package com.example.problemsolving.factorymethodpattern

class Plane : VehicleInterface {

    var wheels = 0
    var passenger = 0
    var hasGas = false



    override fun setNumberOfWheels(wheel: Int) {
       this.wheels = wheel
    }

    override fun setNumberOfPassengers(passenger: Int) {
       this.passenger = passenger
    }

    override fun hasGas(gas: Boolean) {
       this.hasGas = gas
    }

}