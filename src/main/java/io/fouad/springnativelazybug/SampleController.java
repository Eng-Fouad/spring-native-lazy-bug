package io.fouad.springnativelazybug;

import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class SampleController {

    private final SampleServiceInterface sampleServiceInterface;

    @Lazy
    public SampleController(SampleServiceInterface sampleService) {
        this.sampleServiceInterface = sampleService;
    }

    @PostMapping("/hello-world")
    @ResponseStatus(HttpStatus.OK)
    public String helloWorld() {
        return sampleServiceInterface.getHelloWorld();
    }
}