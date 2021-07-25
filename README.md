# Midnight Opera

[![Build Status](https://travis-ci.com/zmapleshine/Midnight-Opera.svg?branch=main)](https://travis-ci.com/zmapleshine/Midnight-Opera)
![Language](https://img.shields.io/badge/language-Java-orange.svg)
![Language](https://img.shields.io/hexpm/l/plug)

[中文说明](README_ZH.md)

Develop  [openelemetry-java-instrumentation](https://github.com/open-telemetry/opentelemetry-java-instrumentation)
project in a lightweight way. Use maven to build it.

# About

Midnight Opera uses maven to build opentelemetry-java-instrumentation, which can be viewed as transplanting from gradle
build tool to maven. Developers can build their own features base on it.

# Getting Started

Build this project is very simple, using the following command:(you must install maven tool before that)

```shell
maven clean package
```

You can find the artifact in the target directory of packing module, the file name usually named as "
midnight-opera-x.x.x.jar". It is important to note that packing module does not contain all the instrumentation provided
in opentelemetry-java-instrumentation. In fact, it is a scaffolding for developers to import instrumentation modules on
demand.

# Motivation

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

# Contributing

See [COUNTRIBUTING.MD](CONTRIBUTING.md)

This project is still in experimental phase and there is no guarantee that all features such as muzzle still exist after
transplanting.
