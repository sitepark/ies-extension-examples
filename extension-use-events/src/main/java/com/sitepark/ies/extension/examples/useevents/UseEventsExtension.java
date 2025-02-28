package com.sitepark.ies.extension.examples.useevents;

import com.sitepark.ies.extension.api.ConfigurationContext;
import com.sitepark.ies.extension.api.Extension;
import com.sitepark.ies.extension.api.annotations.ConfigureFactory;
import javax.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UseEventsExtension implements Extension {

  private static final Logger LOGGER = LogManager.getLogger();

  private final UserPurgedSubsciber userPurgeSubscriber;

  @Inject
  protected UseEventsExtension(UserPurgedSubsciber userPurgeSubscriber) {
    this.userPurgeSubscriber = userPurgeSubscriber;
  }

  @ConfigureFactory
  public static void configureInjection(ConfigurationContext configurationContext) {
    if (LOGGER.isInfoEnabled()) {
      LOGGER.info("configure {}", UseEventsExtension.class.getSimpleName());
    }
  }

  @Override
  public void initialize() {
    if (LOGGER.isInfoEnabled()) {
      LOGGER.info("initialize {}", this.getClass().getSimpleName());
    }
    this.userPurgeSubscriber.subscribe();
  }

  @Override
  public void destroy() {
    if (LOGGER.isInfoEnabled()) {
      LOGGER.info("destroy {}", this.getClass().getSimpleName());
    }
    this.userPurgeSubscriber.unsubscribe();
  }
}
