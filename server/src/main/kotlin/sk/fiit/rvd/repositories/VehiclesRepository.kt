package sk.fiit.rvd.repositories

import org.springframework.data.jpa.repository.JpaRepository
import sk.fiit.rvd.entities.Vehicle
import java.util.UUID

interface VehiclesRepository: JpaRepository<Vehicle, UUID> {
    fun getVehicleByBrand(brand: String): List<Vehicle>
}