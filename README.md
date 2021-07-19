# Midnight Opera

[![Build Status](https://travis-ci.com/zmapleshine/Midnight-Opera.svg?branch=main)](https://travis-ci.com/zmapleshine/Midnight-Opera)
![Language](https://img.shields.io/badge/language-Java-orange.svg)
![Language](https://img.shields.io/hexpm/l/plug)

Develop "openelemetry-java-instrumentation" project in a lightweight way.
Use maven to build it.

# What

Midnight Opera uses maven to build opentelemetry-java-instrumentation, which can be viewed as transplanting from gradle
build tool to maven. Developers can build their own features base on it.

# Why

It has three main purposes:

1. Less hardware resource consumption. openTelemetry-java-instrumentation is a huge project, and it's usually good to
   use the project directly to add custom features. Before that, we would import the project into our IDE, but in the
   meantime,IDE builds up a lot of indexing information during this process, which requires a lot of memory overhead and
   CPU resources.

2. Decoupling. Usually we develop custom distribution packages based on OpenTelemetry, but OpenTelemetry is also in a
   continuous iterative state, which can lead to code merging problems.This project doesn't modify its source code (of
   course, this has nothing to do with Maven).

3. Affinity. Using Maven to build Java projects is still normal today. Although Gradle is excellent and many famous
   projects have been gradually migrated from Maven to Gradle, there is a significant learning cost. For average
   developers,spending a lot of effort on learning build tools is obviously not a priority.

# How

The construction of the project is very simple, using the following command:

```shell
maven clean package
```

You can find the artifact in the target directory of javaagent module, the file name usually ends up with "final.jar".
It is important to note that javaagent module does not contain all the instrumentation provided in
opentelemetry-java-instrumentation. In fact, it is a scaffolding for developers to import instrumentation modules on
demand.

This project is still in experimental phase and there is no guarantee that all features such as muzzle still exist after
transplanting.
