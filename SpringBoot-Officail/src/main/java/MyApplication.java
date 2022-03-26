import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author：Yang Lingbo
 * Date:2022/3/26 16:43
 * Description:
 */
@RestController
@EnableAutoConfiguration
public class MyApplication {
    @RequestMapping("/")
    String Home(){
        return "hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args);
    }
}
