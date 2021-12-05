/*
 * Copyright 2021 the original author or authors.
 * SPDX-License-Identifier: Apache-2.0.
 */

package com.minardream.mintopa;

import io.opentelemetry.javaagent.OpenTelemetryAgent;

import java.lang.instrument.Instrumentation;

/**
 * Premain-Class for the Mintopa Java agent.
 *
 * @author zmapleshine
 * @date 2021/7/17 23:50
 */
public class AgentBootstrap {

    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println();
        System.out.println(":: Mintopa ver " + AgentBootstrap.class.getPackage().getImplementationVersion() + " ::");
        System.out.println(":: Website : https://github.com/zmapleshine/Mintopa");
        System.out.println(":: OpenTelemetry Java Instrumentation (v1.9.1-alpha) : https://github.com/open-telemetry/opentelemetry-java-instrumentation");
        System.out.println();
        OpenTelemetryAgent.premain(agentArgs, inst);
    }

    public static void agentmain(String agentArgs, Instrumentation inst) {
        OpenTelemetryAgent.agentmain(agentArgs, inst);
    }
}
