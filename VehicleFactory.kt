package com.example.problemsolving.factorymethodpattern

class VehicleFactory {

    val plane = Plane()
    val car = Car()

    fun getVehicle(type :String): VehicleInterface {

        return if (type=="Plane")
            plane
        else
            car


    }

}