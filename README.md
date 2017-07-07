# proguard-spring-boot-example
Proguard Obfuscate Spring Boot Maven Plugin Example

For big spring boot projects we can't obfuscate all files because for example may be will break spring autowiring (by default spring autowiring search classes by variable name) and other blocks. So we must check every obfuscation rules by running .jar file. 

Most of the common rules specify in the pom.xml.
