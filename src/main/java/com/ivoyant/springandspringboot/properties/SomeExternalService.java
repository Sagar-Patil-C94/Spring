package com.ivoyant.springandspringboot.properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Getter
public class SomeExternalService {
    @Value("${google.service.url}")
    private String someExternalURL;
}
