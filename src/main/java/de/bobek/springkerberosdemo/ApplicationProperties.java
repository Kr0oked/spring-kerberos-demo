package de.bobek.springkerberosdemo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
@ConfigurationProperties("app")
@Getter
@Setter
public class ApplicationProperties {

    @NotNull
    private String servicePrincipal;

    @NotNull
    private Resource keytab;

    @NotNull
    private String realm;

    @NotNull
    private String kdc;

    @NotNull
    private Boolean debug = true;
}
