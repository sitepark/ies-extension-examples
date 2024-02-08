package com.sitepark.ies.extension.examples.graphql;

import graphql.kickstart.tools.GraphQLQueryResolver;

public class Query implements GraphQLQueryResolver {

  public String ping() {
    return "pong";
  }
}
