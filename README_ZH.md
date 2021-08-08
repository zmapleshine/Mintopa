# Mintopa

[![Build Status](https://travis-ci.com/zmapleshine/Mintopa.svg?branch=main)](https://travis-ci.com/zmapleshine/Mintopa)
![Language](https://img.shields.io/badge/language-Java-orange.svg)
![Language](https://img.shields.io/hexpm/l/plug)

使用轻量级的方式开发 [openelemetry-java-instrumentation](https://github.com/open-telemetry/opentelemetry-java-instrumentation) 项目。

# 关于

Mintopa 使用 Maven 来构建 "opentelemetry-java-instrumentation"（以下简称 otel）。 它也可以看做是从 Gradle 构建工具到 Maven 构建工具的移植。
开发者可以基于该项目来开发构建自己的功能。

# 如何开始

构建这个项目非常简单，使用以下命令（需事先安装 Maven 构建工具）：

```shell
maven clean package
```

你会在 packing 模块的 target 目录中找到打包后的 Jar 包，通常文件名是 "mintopa-x.x.x.jar" 这样的格式。 需要特别注意的是，该项目并不包含 otel 中提供的所有组件的仪器(
instrumentation)。 事实上，本项目只是个脚手架，开发人员可以按需导入 otel 提供的仪器。

# 创立动机

本项目主要有三个目的：

1. 本项目和 otel 这种庞大的项目相比，开发过程中具有更少的硬件资源消耗。 通常，我们直接基于 otel 来开发自己的功能是没问题的。 在此之前，我们需要将整项目导入到我们的 IDE（集成开发环境）中。在这个过程中， IDE
   需要消耗大量的内存和 CPU 资源来建立大量的索引信息。


2. 解耦合。通常我们基于 otel 来开发一个自定义的包，但 otel 也是处于一个持续迭代开发的状态，这也会导致代码合并的问题。 而本项目，不会去修改 otel 的源代码。（当然，这个与本项目为什么使用 Maven 构建无关）


3. 友好，亲和。当今使用 Maven 构建 Java 项目仍然是主流，尽管 Gradle 非常的优秀，很多项目也逐步地将项目构建方式从 Maven 迁移到了 Gradle，但是这也显著带来了很大的学习成本。 对于大多数 Java
   后端开发者来说，花费大量的精力去学习构建工具，显然不是优先考虑的事情。

# 贡献指南

参考 [CONTRIBUTING.MD](CONTRIBUTING.md)

本项目仍处于试验阶段，不保证所有来自 otel 项目的功能特性均完好地移植过来，比如像 "muzzle" 这样的特性目前因缺少相应的 Maven 插件而并未移植过来。