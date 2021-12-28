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
package org.apache.camel.impl.console;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;

import org.apache.camel.spi.CamelEvent;
import org.apache.camel.spi.annotations.DevConsole;
import org.apache.camel.support.EventNotifierSupport;

@DevConsole("event")
public class EventConsole extends AbstractDevConsole {

    private int capacity = 25;

    private final Queue<CamelEvent> events = new ArrayDeque<>(capacity);
    private final Queue<CamelEvent.ExchangeEvent> exchangeEvents = new ArrayDeque<>(capacity);
    private final ConsoleEventNotifier listener = new ConsoleEventNotifier();

    public EventConsole() {
        super("camel", "event");
    }

    @Override
    protected void doInit() throws Exception {
        getCamelContext().getManagementStrategy().addEventNotifier(listener);
    }

    @Override
    protected void doShutdown() throws Exception {
        getCamelContext().getManagementStrategy().removeEventNotifier(listener);
        events.clear();
    }

    @Override
    protected Object doCall(MediaType mediaType, Map<String, Object> options) {
        // only text is supported
        StringBuilder sb = new StringBuilder();

        if (!events.isEmpty()) {
            sb.append(String.format("Last %s Camel Events:", events.size()));
            for (CamelEvent event : events) {
                sb.append(String.format("\n    %s", event));
            }
            sb.append("\n");
        }
        if (!exchangeEvents.isEmpty()) {
            sb.append("\n");
            sb.append(String.format("Last %s Exchange Events:", exchangeEvents.size()));
            for (CamelEvent.ExchangeEvent event : exchangeEvents) {
                sb.append(String.format("\n    %s", event));
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    private class ConsoleEventNotifier extends EventNotifierSupport {

        @Override
        public void notify(CamelEvent event) throws Exception {
            if (event instanceof CamelEvent.ExchangeEvent) {
                if (exchangeEvents.size() >= capacity) {
                    exchangeEvents.poll();
                }
                exchangeEvents.add((CamelEvent.ExchangeEvent) event);
            } else {
                if (events.size() >= capacity) {
                    events.poll();
                }
                events.offer(event);
            }
        }

    }
}
