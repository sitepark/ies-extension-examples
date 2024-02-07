package com.sitepark.ies.extension.examples.graphql;

import com.sitepark.ies.extension.api.ConfigurationContext;
import com.sitepark.ies.extension.api.Extension;
import com.sitepark.ies.extension.api.annotations.ConfigureFactory;
import javax.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GraphqlExtension implements Extension {

  private static final Logger LOGGER = LogManager.getLogger();

  @Inject
  protected GraphqlExtension() {}

  @ConfigureFactory
  public static void configureInjection(ConfigurationContext configurationContext) {
    if (LOGGER.isInfoEnabled()) {
      LOGGER.info("configure {}", GraphqlExtension.class.getSimpleName());
    }
  }

  @Override
  public void initialize() {
    if (LOGGER.isInfoEnabled()) {
      LOGGER.info("initialize {}", this.getClass().getSimpleName());
    }
  }
}
