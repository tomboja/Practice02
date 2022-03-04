package edu.miu.cs544.temesgen;

import edu.miu.cs544.temesgen.config.MixedConfig2;
import edu.miu.cs544.temesgen.config.SpringConfig1;
import edu.miu.cs544.temesgen.services.Game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: Practice02
 * @Author: Temesgen D.
 * @Date: 3/3/22
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting...");
        // Multiple xml configurations one importing the other
//        ApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");

        // Mixed configuration xml importing java config
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("mixedConfig1.xml");

        // Multiple java config based configuration
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig1.class);

        // Mixed configuration java config importing xml config
        ApplicationContext context = new AnnotationConfigApplicationContext(MixedConfig2.class);
        Game game = context.getBean(Game.class);
        game.play();

        System.out.println("Ending...");
    }
}
