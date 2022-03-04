package edu.miu.cs544.temesgen.config;

import edu.miu.cs544.temesgen.services.Game;
import edu.miu.cs544.temesgen.services.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ProjectName: Practice02
 * @Author: Temesgen D.
 * @Date: 3/3/22
 */

@Configuration
@Import(SpringConfig2.class)
public class SpringConfig1 {

    @Bean
    public Game game(Vehicle vehicleCar) {
        return new Game(vehicleCar);
    }
}
