package coffee.synyx.frontpage;

import coffee.synyx.frontpage.plugin.api.FrontpagePluginInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.plugin.core.config.EnablePluginRegistries;


/**
 * The CoffeeNet Frontpage Server.
 *
 * @author  Tobias Schneider - schneider@synyx.de
 */
@SpringBootApplication
@EnablePluginRegistries(FrontpagePluginInterface.class)
public class FrontpageServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(FrontpageServerApplication.class, args);
    }
}
