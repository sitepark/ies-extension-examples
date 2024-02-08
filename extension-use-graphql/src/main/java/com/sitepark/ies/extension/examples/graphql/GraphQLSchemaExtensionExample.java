package com.sitepark.ies.extension.examples.graphql;

import com.sitepark.ies.extensions.graphql.api.GraphQLSchemaExtension;
import com.sitepark.ies.extensions.graphql.api.GraphQLSchemaExtensionConfiguration;
import javax.inject.Inject;

public class GraphQLSchemaExtensionExample implements GraphQLSchemaExtension {

  private final Query query;

  @Inject
  protected GraphQLSchemaExtensionExample(Query query) {
    this.query = query;
  }

  @Override
  public void initialize(GraphQLSchemaExtensionConfiguration config) {
    config
        .schemaResource(GraphQLSchemaExtensionExample.class, "schema.graphqls")
        .resolvers(this.query);
  }
}
