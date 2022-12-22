package com.sitepark.ies.extension.examples.graphql;

import com.sitepark.ies.extensions.graphql.api.annotations.Unsecured;

import graphql.kickstart.tools.GraphQLQueryResolver;

public class Query implements GraphQLQueryResolver {

	@Unsecured
	public String ping() {
		return "pong";
	}

}
