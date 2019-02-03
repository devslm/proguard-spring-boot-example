[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.1.2-green.svg)](https://projects.spring.io/spring-boot/)
[![Spring Boot](https://img.shields.io/badge/JDK-11-green.svg)](https://projects.spring.io/spring-boot/)
[![Proguard Maven Plugin](https://img.shields.io/badge/Proguard%20Maven%20Plugin-6.1.0beta2-blue.svg)](https://sourceforge.net/projects/proguard/)

## proguard-spring-boot-example
Proguard Obfuscate Spring Boot Maven Plugin Example

For big spring boot projects we can't obfuscate all files because for example may be will break spring autowiring 
(by default spring autowiring search classes by variable name) and other blocks. So we must check every obfuscation 
rules by running .jar file. 

Most of the common rules specify in the pom.xml.

## Decompiling files by Intellij
We must unzip .jar and put package files in the project/target directory. Then we can open target directory in intellij 
project-structure window and open class. This will be real decompiled class.

## Supporting JDK
**Currently supported JDK 1.8 and JDK 11 (may be also JDK 9 and JDK 10 - I not tested them)!**

JDK after 1.8 (9, 10, 11 and etc.) now using modular structure, so they don't contain files 
**rt.jar** and **jce.jar**.

I remove all libraries from the **libs** section in pom (empty block **<libs></libs>**). If your application want
them you can add system libraries manually, for example:
```
<libs>
    <lib>${java.home}/lib/rt.jar</lib>
    <lib>${java.home}/lib/jce.jar</lib>
</libs>
```
For JDK 11 you can try to add all modules from **<jdk-path>/jmods** directory to the **libs** section in maven pom.

## How it works
Obfuscation step must go before packaging **.jar** so in pom file you can see right order of steps.

We use **proguard-maven-plugin**. In configuration you can pass any options from the original **proguard project**,
but some options may cause failure so recheck any changes. See [proguard documentation](https://www.guardsquare.com/en/products/proguard/manual/examples#application)
for all available options and descriptions.

## Troubleshooting
  - If application can't start try remove some classes/packages from obfuscation (option **-keep**)
  - We use option **-dontoptimize**, but you can try to use optimization but recheck required after every changes
  - If maven build failed check your JDK version (**currently supports only JDK 1.8 and JDK 11**). See also error 
    output, may be you compiling under JDK 11 and not removed libraries from the **libs** block so **proguard**
    can't find **rt.jar** and others.
  - Some options from the **proguard project** may not work properly, recheck any new option

#### Used banner font
[https://devops.datenkollektiv.de/banner.txt/index.html](https://devops.datenkollektiv.de/banner.txt/index.html)

Font: larry3d
