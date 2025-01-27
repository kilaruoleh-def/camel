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
package org.apache.camel.component.cxf.spring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.component.cxf.NullFaultListener;
import org.apache.camel.component.cxf.jaxrs.BeanIdAware;
import org.apache.cxf.bus.spring.BusWiringBeanFactoryPostProcessor;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxrs.client.JAXRSClientFactoryBean;
import org.apache.cxf.logging.FaultListener;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringJAXRSClientFactoryBean extends JAXRSClientFactoryBean
        implements ApplicationContextAware, BeanIdAware {
    private String beanId;
    private int loggingSizeLimit;
    private LoggingFeature loggingFeature;

    public SpringJAXRSClientFactoryBean() {
    }

    public boolean isLoggingFeatureEnabled() {
        return loggingFeature != null;
    }

    public void setLoggingFeatureEnabled(boolean loggingFeatureEnabled) {
        if (loggingFeature != null) {
            getFeatures().remove(loggingFeature);
            loggingFeature = null;
        }
        if (loggingFeatureEnabled) {
            if (getLoggingSizeLimit() > 0) {
                loggingFeature = new LoggingFeature();
                loggingFeature.setLimit(getLoggingSizeLimit());
            } else {
                loggingFeature = new LoggingFeature();
            }
            getFeatures().add(loggingFeature);
        }

    }

    public int getLoggingSizeLimit() {
        return loggingSizeLimit;
    }

    public void setLoggingSizeLimit(int loggingSizeLimit) {
        this.loggingSizeLimit = loggingSizeLimit;
        if (loggingFeature != null) {
            getFeatures().remove(loggingFeature);
            if (loggingSizeLimit > 0) {
                loggingFeature = new LoggingFeature();
                loggingFeature.setLimit(getLoggingSizeLimit());
            } else {
                loggingFeature = new LoggingFeature();
            }
            getFeatures().add(loggingFeature);
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        if (bus == null) {
            setBus(BusWiringBeanFactoryPostProcessor.addDefaultBus(ctx));
        }
    }

    @Override
    public String getBeanId() {
        return beanId;
    }

    @Override
    public void setBeanId(String id) {
        beanId = id;
    }

    // add this method for testing
    List<String> getSchemaLocations() {
        return schemaLocations;
    }

    public void setSkipFaultLogging(boolean skipFaultLogging) {
        if (skipFaultLogging) {
            if (this.getProperties() == null) {
                this.setProperties(new HashMap<String, Object>());
            }
            this.getProperties().put(FaultListener.class.getName(), new NullFaultListener());
        }
    }

    @Override
    public void setProperties(Map<String, Object> properties) {
        if (this.getProperties() != null && properties != null) {
            this.getProperties().putAll(properties);
        } else {
            super.setProperties(properties);
        }
    }
}
