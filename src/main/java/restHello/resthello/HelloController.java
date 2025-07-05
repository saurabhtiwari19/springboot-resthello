package restHello.resthello;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @RequestMapping("/restHello/{name}")
    String hello(@PathVariable String name) {
        return "Hello!  " + name;
    }

}
