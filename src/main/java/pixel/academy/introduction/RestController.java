package pixel.academy.introduction;

import org.springframework.web.bind.annotation.GetMapping;
@org.springframework.web.bind.annotation.RestController

public class RestController {

    @GetMapping("/start")
    public String getStart() {
        return "Ion Schimbator";
    }

}
