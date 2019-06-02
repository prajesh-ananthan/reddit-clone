package io.reddit;

import io.reddit.config.SpringItProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableConfigurationProperties(SpringItProperties.class)
public class RedditCloneApplication {

  @Autowired
  private SpringItProperties springItProperties;

  public static void main(String[] args) {
    SpringApplication.run(RedditCloneApplication.class, args);
  }

  @Bean
  @Profile("dev")
    CommandLineRunner runner() {
    return args -> {
//      System.out.println("Welcome message is " + springItProperties.getWelcomeMessage());
      System.out.println("Hello dev");
    };
  }

}

