Bennu MyBatis-Commons
===================

[![Maven Central](https://img.shields.io/maven-central/v/cl.bennu/mybatis-commons?label=Maven%20Central&logo=sonatype)](https://search.maven.org/artifact/cl.bennu/mybatis-commons)
[![License](https://img.shields.io/github/license/bennu/mybatis-commons?label=License&logo=opensourceinitiative)](https://opensource.org/license/mit-0)
[![Contributor Covenant](https://img.shields.io/badge/Contributor%20Covenant-2.1-4baaaa.svg)](CODE_OF_CONDUCT.md)
[![Supported JVM Versions](https://img.shields.io/badge/JVM-17--21-brightgreen.svg?label=JVM&logo=openjdk)](https://adoptium.net/es/temurin/releases/)


Bennu MyBatis-Commons, a package of Java utility classes for
classes that are repeated in our mybatis projects.

The code is tested using the latest revision of the JDK for supported
LTS releases: 17 and 21.

```xml
<dependency>
    <groupId>cl.bennu</groupId>
    <artifactId>mybatis-commons</artifactId>
    <version>1.1.2</version>
</dependency>
```

Building
--------

Building requires a Java JDK and [Apache Maven](https://maven.apache.org/).
The required Java version is found in the `pom.xml` as the `maven.compiler.source` property.

From a command shell, run `mvn` without arguments to invoke the default Maven goal to run all tests and checks.

License
-------

This code is licensed under the [MIT License](https://opensource.org/license/mit).

Dependencies
------------

- commons 1.5.1
- mybatis 3.5.19