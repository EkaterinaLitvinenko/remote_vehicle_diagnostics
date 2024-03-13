package sk.fiit.rvd.controllers.v1

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import sk.fiit.rvd.entities.Vehicle
import sk.fiit.rvd.repositories.VehiclesRepository

@RestController
class TestController {
    @Autowired
    lateinit var vehiclesRepository: VehiclesRepository

    @GetMapping("/test/{brand}")
    fun blog(@PathVariable brand: String): List<Vehicle> {
        return vehiclesRepository.getVehicleByBrand(brand)
    }
}