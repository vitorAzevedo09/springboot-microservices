package academy.devdojo.youtube.core.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Configuration
@ConfigurationProperties(prefix = "jwt.config")
@Getter
@Setter
@ToString
public class JwtConfiguration {

  private String loginUrl = "/login/**";
  @NestedConfigurationProperty
  private Header Header = new Header();
  private int expiration = 3600;
  private String privateKey = "Lgwi5JWd9dXRbfnLxNHBAQOyZMMJE9Rk";
  private String type = "encrypted";

  @Getter
  @Setter
  public static class Header {
    private String name = "Authorization";
    private String prefix = "Bearer ";
  }

}
