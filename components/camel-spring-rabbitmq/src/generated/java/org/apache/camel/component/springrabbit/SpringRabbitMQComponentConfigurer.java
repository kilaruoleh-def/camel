/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.springrabbit;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SpringRabbitMQComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SpringRabbitMQComponent target = (SpringRabbitMQComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "amqpadmin":
        case "amqpAdmin": target.setAmqpAdmin(property(camelContext, org.springframework.amqp.core.AmqpAdmin.class, value)); return true;
        case "autodeclare":
        case "autoDeclare": target.setAutoDeclare(property(camelContext, boolean.class, value)); return true;
        case "autostartup":
        case "autoStartup": target.setAutoStartup(property(camelContext, boolean.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": target.setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "connectionfactory":
        case "connectionFactory": target.setConnectionFactory(property(camelContext, org.springframework.amqp.rabbit.connection.ConnectionFactory.class, value)); return true;
        case "deadletterexchange":
        case "deadLetterExchange": target.setDeadLetterExchange(property(camelContext, java.lang.String.class, value)); return true;
        case "deadletterexchangetype":
        case "deadLetterExchangeType": target.setDeadLetterExchangeType(property(camelContext, java.lang.String.class, value)); return true;
        case "deadletterqueue":
        case "deadLetterQueue": target.setDeadLetterQueue(property(camelContext, java.lang.String.class, value)); return true;
        case "deadletterroutingkey":
        case "deadLetterRoutingKey": target.setDeadLetterRoutingKey(property(camelContext, java.lang.String.class, value)); return true;
        case "errorhandler":
        case "errorHandler": target.setErrorHandler(property(camelContext, org.springframework.util.ErrorHandler.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "ignoredeclarationexceptions":
        case "ignoreDeclarationExceptions": target.setIgnoreDeclarationExceptions(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "listenercontainerfactory":
        case "listenerContainerFactory": target.setListenerContainerFactory(property(camelContext, org.apache.camel.component.springrabbit.ListenerContainerFactory.class, value)); return true;
        case "maxconcurrentconsumers":
        case "maxConcurrentConsumers": target.setMaxConcurrentConsumers(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maximumretryattempts":
        case "maximumRetryAttempts": target.setMaximumRetryAttempts(property(camelContext, int.class, value)); return true;
        case "messageconverter":
        case "messageConverter": target.setMessageConverter(property(camelContext, org.springframework.amqp.support.converter.MessageConverter.class, value)); return true;
        case "messagelistenercontainertype":
        case "messageListenerContainerType": target.setMessageListenerContainerType(property(camelContext, java.lang.String.class, value)); return true;
        case "messagepropertiesconverter":
        case "messagePropertiesConverter": target.setMessagePropertiesConverter(property(camelContext, org.apache.camel.component.springrabbit.MessagePropertiesConverter.class, value)); return true;
        case "prefetchcount":
        case "prefetchCount": target.setPrefetchCount(property(camelContext, int.class, value)); return true;
        case "rejectanddontrequeue":
        case "rejectAndDontRequeue": target.setRejectAndDontRequeue(property(camelContext, boolean.class, value)); return true;
        case "replytimeout":
        case "replyTimeout": target.setReplyTimeout(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "retry": target.setRetry(property(camelContext, org.springframework.retry.interceptor.RetryOperationsInterceptor.class, value)); return true;
        case "retrydelay":
        case "retryDelay": target.setRetryDelay(property(camelContext, int.class, value)); return true;
        case "shutdowntimeout":
        case "shutdownTimeout": target.setShutdownTimeout(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "testconnectiononstartup":
        case "testConnectionOnStartup": target.setTestConnectionOnStartup(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public String[] getAutowiredNames() {
        return new String[]{"amqpAdmin","connectionFactory"};
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "amqpadmin":
        case "amqpAdmin": return org.springframework.amqp.core.AmqpAdmin.class;
        case "autodeclare":
        case "autoDeclare": return boolean.class;
        case "autostartup":
        case "autoStartup": return boolean.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "concurrentconsumers":
        case "concurrentConsumers": return int.class;
        case "connectionfactory":
        case "connectionFactory": return org.springframework.amqp.rabbit.connection.ConnectionFactory.class;
        case "deadletterexchange":
        case "deadLetterExchange": return java.lang.String.class;
        case "deadletterexchangetype":
        case "deadLetterExchangeType": return java.lang.String.class;
        case "deadletterqueue":
        case "deadLetterQueue": return java.lang.String.class;
        case "deadletterroutingkey":
        case "deadLetterRoutingKey": return java.lang.String.class;
        case "errorhandler":
        case "errorHandler": return org.springframework.util.ErrorHandler.class;
        case "headerfilterstrategy":
        case "headerFilterStrategy": return org.apache.camel.spi.HeaderFilterStrategy.class;
        case "ignoredeclarationexceptions":
        case "ignoreDeclarationExceptions": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "listenercontainerfactory":
        case "listenerContainerFactory": return org.apache.camel.component.springrabbit.ListenerContainerFactory.class;
        case "maxconcurrentconsumers":
        case "maxConcurrentConsumers": return java.lang.Integer.class;
        case "maximumretryattempts":
        case "maximumRetryAttempts": return int.class;
        case "messageconverter":
        case "messageConverter": return org.springframework.amqp.support.converter.MessageConverter.class;
        case "messagelistenercontainertype":
        case "messageListenerContainerType": return java.lang.String.class;
        case "messagepropertiesconverter":
        case "messagePropertiesConverter": return org.apache.camel.component.springrabbit.MessagePropertiesConverter.class;
        case "prefetchcount":
        case "prefetchCount": return int.class;
        case "rejectanddontrequeue":
        case "rejectAndDontRequeue": return boolean.class;
        case "replytimeout":
        case "replyTimeout": return long.class;
        case "retry": return org.springframework.retry.interceptor.RetryOperationsInterceptor.class;
        case "retrydelay":
        case "retryDelay": return int.class;
        case "shutdowntimeout":
        case "shutdownTimeout": return long.class;
        case "testconnectiononstartup":
        case "testConnectionOnStartup": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SpringRabbitMQComponent target = (SpringRabbitMQComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "amqpadmin":
        case "amqpAdmin": return target.getAmqpAdmin();
        case "autodeclare":
        case "autoDeclare": return target.isAutoDeclare();
        case "autostartup":
        case "autoStartup": return target.isAutoStartup();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "concurrentconsumers":
        case "concurrentConsumers": return target.getConcurrentConsumers();
        case "connectionfactory":
        case "connectionFactory": return target.getConnectionFactory();
        case "deadletterexchange":
        case "deadLetterExchange": return target.getDeadLetterExchange();
        case "deadletterexchangetype":
        case "deadLetterExchangeType": return target.getDeadLetterExchangeType();
        case "deadletterqueue":
        case "deadLetterQueue": return target.getDeadLetterQueue();
        case "deadletterroutingkey":
        case "deadLetterRoutingKey": return target.getDeadLetterRoutingKey();
        case "errorhandler":
        case "errorHandler": return target.getErrorHandler();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "ignoredeclarationexceptions":
        case "ignoreDeclarationExceptions": return target.isIgnoreDeclarationExceptions();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "listenercontainerfactory":
        case "listenerContainerFactory": return target.getListenerContainerFactory();
        case "maxconcurrentconsumers":
        case "maxConcurrentConsumers": return target.getMaxConcurrentConsumers();
        case "maximumretryattempts":
        case "maximumRetryAttempts": return target.getMaximumRetryAttempts();
        case "messageconverter":
        case "messageConverter": return target.getMessageConverter();
        case "messagelistenercontainertype":
        case "messageListenerContainerType": return target.getMessageListenerContainerType();
        case "messagepropertiesconverter":
        case "messagePropertiesConverter": return target.getMessagePropertiesConverter();
        case "prefetchcount":
        case "prefetchCount": return target.getPrefetchCount();
        case "rejectanddontrequeue":
        case "rejectAndDontRequeue": return target.isRejectAndDontRequeue();
        case "replytimeout":
        case "replyTimeout": return target.getReplyTimeout();
        case "retry": return target.getRetry();
        case "retrydelay":
        case "retryDelay": return target.getRetryDelay();
        case "shutdowntimeout":
        case "shutdownTimeout": return target.getShutdownTimeout();
        case "testconnectiononstartup":
        case "testConnectionOnStartup": return target.isTestConnectionOnStartup();
        default: return null;
        }
    }
}

