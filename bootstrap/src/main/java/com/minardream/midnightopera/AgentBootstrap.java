/*
 * Copyright 2021 the original author or authors.
 * SPDX-License-Identifier: Apache-2.0.
 */

package com.minardream.midnightopera;

import io.opentelemetry.javaagent.OpenTelemetryAgent;

import java.lang.instrument.Instrumentation;

/**
 * Premain-Class for the Midnight Opera Java agent.
 *
 * @author zmapleshine
 * @date 2021/7/17 23:50
 */
public class AgentBootstrap {

    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println();
        System.out.println(":: Midnight Opera ver " + AgentBootstrap.class.getPackage().getImplementationVersion() + " ::");
        System.out.println(":: Website : https://github.com/zmapleshine/Midnight-Opera");
        System.out.println(":: OpenTelemetry Java Instrumentation (v1.4.0-alpha) : https://github.com/open-telemetry/opentelemetry-java-instrumentation");
        System.out.println();
        OpenTelemetryAgent.premain(agentArgs, inst);
    }

    public static void agentmain(String agentArgs, Instrumentation inst) {
        OpenTelemetryAgent.agentmain(agentArgs, inst);
    }
}
