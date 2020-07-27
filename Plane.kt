package com.example.problemsolving.facadedesignpattern

import com.example.problemsolving.facadedesignpattern.Vehicle

class Plane : Vehicle {

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