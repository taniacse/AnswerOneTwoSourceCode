package com.example.problemsolving.facadedesignpattern


fun main(){

    val vehicleFactory = VehicleFactory()
    vehicleFactory.makeCar(4,5,true)
    vehicleFactory.makePlane(10,100,false)

    val  car = vehicleFactory.car
    val plane = vehicleFactory.plane


    println("Car property passenger:${car.passenger} wheels: ${car.wheels} Gas: ${car.hasGas}")
    println("Plane property passenger:${plane.passenger} wheels: ${plane.wheels} Gas: ${plane.hasGas}")

}