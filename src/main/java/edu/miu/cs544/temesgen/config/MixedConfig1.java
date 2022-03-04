package edu.miu.cs544.temesgen.config;

import edu.miu.cs544.temesgen.services.Bike;
import edu.miu.cs544.temesgen.services.Car;
import edu.miu.cs544.temesgen.services.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: Practice02
 * @Author: Temesgen D.
 * @Date: 3/3/22
 */

@Configuration
public class MixedConfig1 {

    @Bean
    public Vehicle vehicleCar() {
        return new Car();
    }

    @Bean
    public Vehicle vehicleBike() {
        return new Bike();
    }
}
