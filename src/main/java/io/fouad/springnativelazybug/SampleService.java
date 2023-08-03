package io.fouad.springnativelazybug;

import org.springframework.stereotype.Service;

@Service
public class SampleService implements SampleServiceInterface{

    @AttachedCode(123)
    public String getHelloWorld() {
        throw new RuntimeException();
    }
}