package academy.devdojo.youtube.auth.security.config;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.RequiredArgsConstructor;

@EnableWebSecurity
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class SecurityCredentialsConfig {
}
