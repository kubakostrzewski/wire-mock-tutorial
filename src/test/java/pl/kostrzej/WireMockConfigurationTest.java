package pl.kostrzej;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.testng.annotations.BeforeMethod;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

public class WireMockConfigurationTest {

    private WireMockServer wireMockServer;

    @BeforeMethod
    void configureServerBeforeTest() {
        //specifying mock address and port. If you want to use default settings (localhost:8080) use:
        //this.wireMockServer = new WireMockServer();
        this.wireMockServer = new WireMockServer(options()
            .bindAddress("127.0.0.1")
            .port(9091));


    }

}
