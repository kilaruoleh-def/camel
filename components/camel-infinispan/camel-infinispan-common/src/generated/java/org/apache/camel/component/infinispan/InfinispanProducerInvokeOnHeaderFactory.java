/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.infinispan;

import org.apache.camel.AsyncCallback;
import org.apache.camel.Exchange;
import org.apache.camel.spi.InvokeOnHeaderStrategy;
import org.apache.camel.component.infinispan.InfinispanProducer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class InfinispanProducerInvokeOnHeaderFactory implements InvokeOnHeaderStrategy {

    @Override
    public Object invoke(Object obj, String key, Exchange exchange, AsyncCallback callback) throws Exception {
        org.apache.camel.component.infinispan.InfinispanProducer target = (org.apache.camel.component.infinispan.InfinispanProducer) obj;
        switch (key) {
        case "clear":
        case "CLEAR": target.onClear(exchange.getMessage()); return null;
        case "clearasync":
        case "CLEARASYNC": target.onCLearAsync(exchange.getMessage()); return null;
        case "compute":
        case "COMPUTE": target.onCompute(exchange.getMessage()); return null;
        case "computeasync":
        case "COMPUTEASYNC": target.onComputeAsync(exchange.getMessage()); return null;
        case "containskey":
        case "CONTAINSKEY": target.onContainsKey(exchange.getMessage()); return null;
        case "containsvalue":
        case "CONTAINSVALUE": target.onContainsValue(exchange.getMessage()); return null;
        case "get":
        case "GET": target.onGet(exchange.getMessage()); return null;
        case "getordefault":
        case "GETORDEFAULT": target.onGetOrDefault(exchange.getMessage()); return null;
        case "put":
        case "PUT": target.onPut(exchange.getMessage()); return null;
        case "putall":
        case "PUTALL": target.onPutAll(exchange.getMessage()); return null;
        case "putallasync":
        case "PUTALLASYNC": target.onPutAllAsync(exchange.getMessage()); return null;
        case "putasync":
        case "PUTASYNC": target.onPutAsync(exchange.getMessage()); return null;
        case "putifabsent":
        case "PUTIFABSENT": target.onPutIfAbsent(exchange.getMessage()); return null;
        case "putifabsentasync":
        case "PUTIFABSENTASYNC": target.onPutIfAbsentAsync(exchange.getMessage()); return null;
        case "remove":
        case "REMOVE": target.onRemove(exchange.getMessage()); return null;
        case "removeasync":
        case "REMOVEASYNC": target.onRemoveAsync(exchange.getMessage()); return null;
        case "replace":
        case "REPLACE": target.onReplace(exchange.getMessage()); return null;
        case "replaceasync":
        case "REPLACEASYNC": target.onReplaceAsync(exchange.getMessage()); return null;
        case "size":
        case "SIZE": target.onSize(exchange.getMessage()); return null;
        default: return null;
        }
    }

}
