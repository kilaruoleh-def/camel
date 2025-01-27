/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.processor.aggregate.jdbc;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;
import org.apache.camel.test.spring.junit5.CamelSpringTestSupport;
import org.springframework.context.support.AbstractApplicationContext;

public abstract class AbstractClusteredJdbcAggregationTestSupport extends CamelSpringTestSupport {

    ClusteredJdbcAggregationRepository repo;
    ClusteredJdbcAggregationRepository repobis;

    @Override
    public void postProcessTest() throws Exception {
        super.postProcessTest();

        repo = applicationContext.getBean("repo5", ClusteredJdbcAggregationRepository.class);
        repobis = applicationContext.getBean("repo6", ClusteredJdbcAggregationRepository.class);
        configureJdbcAggregationRepository();
    }

    void configureJdbcAggregationRepository() {
    }

    long getCompletionInterval() {
        return 5000;
    }

    @Override
    protected AbstractApplicationContext createApplicationContext() {
        return newAppContext(
                "JdbcSpringDataSource.xml", "JdbcSpringDataSource.xml");
    }

    public static class MyAggregationStrategy implements AggregationStrategy {

        @Override
        public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
            if (oldExchange == null) {
                return newExchange;
            }
            String body1 = oldExchange.getIn().getBody(String.class);
            String body2 = newExchange.getIn().getBody(String.class);

            oldExchange.getIn().setBody(body1 + body2);
            return oldExchange;
        }
    }
}
