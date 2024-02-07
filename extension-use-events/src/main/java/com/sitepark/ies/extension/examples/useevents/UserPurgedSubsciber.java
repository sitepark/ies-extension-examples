package com.sitepark.ies.extension.examples.useevents;

import com.sitepark.ies.extension.api.annotations.Subscribe;
import com.sitepark.ies.extension.api.events.UserPurged;
import com.sitepark.ies.extension.api.port.EventBusSubscriber;
import javax.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserPurgedSubsciber {

  private static final Logger LOGGER = LogManager.getLogger();

  private final EventBusSubscriber subscriber;

  @Inject
  protected UserPurgedSubsciber(EventBusSubscriber subscriber) {
    this.subscriber = subscriber;
  }

  public void subscribe() {
    this.subscriber.register(this);
  }

  public void unsubscribe() {
    this.subscriber.unregister(this);
  }

  @Subscribe
  public void handle(UserPurged event) {
    if (LOGGER.isInfoEnabled()) {
      LOGGER.info("handle purge {}", event.getId());
    }
  }
}
