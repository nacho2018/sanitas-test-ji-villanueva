package com.sanitas.operations.sv_operations.components;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties("operands-service")
public class Configuration {
    private String operand1;
    private String operand2;
}
