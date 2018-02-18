[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-%3E%3D1.5-green.svg)](https://projects.spring.io/spring-boot/)
[![Proguard Maven Plugin](https://img.shields.io/badge/Proguard%20Maven%20Plugin-%3E%3D5.3-blue.svg)](https://sourceforge.net/projects/proguard/)

# proguard-spring-boot-example
Proguard Obfuscate Spring Boot Maven Plugin Example

For big spring boot projects we can't obfuscate all files because for example may be will break spring autowiring (by default spring autowiring search classes by variable name) and other blocks. So we must check every obfuscation rules by running .jar file. 

Most of the common rules specify in the pom.xml.

# Decompiling files by Intellij
We must unzip .jar and put package files in the project/target directory. Then we can open target directory in intellij project-structure window and open class. This will be real decompiled class.
