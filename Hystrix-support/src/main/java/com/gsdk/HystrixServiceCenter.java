package java.com.gsdk;

//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.client.discovery.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.*;
import org.springframework.boot.builder.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

@SpringBootApplication
@EnableDiscoveryClient
//@RestController
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
@EnableDiscoveryClient
public class HystrixServiceCenter {

    //        volatile int abc = 0;

    @RequestMapping("/")
    public String home() {
        HystrixCommandGroupKey groupKey = HystrixCommandGroupKey.Factory.asKey("ExampleGroup");
        HystrixCommand<String> hystrixCommand = new HystrixCommand<String>(groupKey) {
            @Override
            protected String run() throws Exception {
                return "hi";
            }
        };
        System.out.printf("exec command ... result = %s", hystrixCommand.execute());
        return "Hello world";
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name){
        return "Hello me";
    }
    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixServiceCenter.class).web(true).run(args);
    }
}
