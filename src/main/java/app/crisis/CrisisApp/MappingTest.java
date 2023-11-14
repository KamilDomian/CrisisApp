package app.crisis.CrisisApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController

public class MappingTest {
    @GetMapping("/test")

    public int getTest(){
        return 1;

}

}







