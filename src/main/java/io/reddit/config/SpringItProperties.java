package io.reddit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Prajesh.Ananthan on 25/5/2019.
 *
 * @author Prajesh Ananthan, BIG Loyalty Sdn. Bhd
 */

/**
 *
 * Simple Hello World Message
 *
 */

@ConfigurationProperties("springit")
public class SpringItProperties {

  private String welcomeMessage = "Hello World";

  public String getWelcomeMessage() {
    return welcomeMessage;
  }

  public void setWelcomeMessage(String welcomeMessage) {
    this.welcomeMessage = welcomeMessage;
  }
}
