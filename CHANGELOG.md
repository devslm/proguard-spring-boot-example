# Changelog

## [2.2.0] - 2021-08-05
#### Added:
  - Docker compose file to test all supported JDKs (9, 11, 14)
  - Integration test to test context startup
  - Spring @Configuration file example
  - Jackson object mapper example (added proguard options to keep Jackson annotations)
  - ExampleObjectMapperDto class with @JsonProperty annotations to show Jackson mapper example

### Changed
  - JDK 11 compiler
  - Spring boot version increased to 2.5.3
  - Proguard version increased to 7.0.0
  - Proguard maven plugin version increased to 2.3.1
  - Lombok version increased to 1.18.20
  - Update README


## [2.1.0] - 2019-10-09
#### Added:
  - Global lombok config
  - Logs via lombok @Slf4j for example

### Changed
  - Spring boot version increased to 2.1.9
  - Proguard version increased to 6.2.0
  - Proguard maven plugin version increased to 2.1.1
  - Lombok version increased to 1.18.10
  - Rename package and dto from suffix data to dto
  - Code refactoring
  - Update README


## [2.0.0] - 2019-02-03
#### Added:
  - Default JDK 11 compiler

### Changed
  - Spring boot version increased to 2.1.2
  - Update README


## [1.1.0] - 2019-02-02
#### Added:
  - All packages obfuscate except **main** method in main **Application** class
  - Add lombok support

### Changed
  - Proguard version increased to 6.1.0beta2 with support JDK up to 11 (but **currently only JDK 1.8 supported**)
  - Spring boot version increased to 1.5.18
  - Dependencies version moved to properties section in maven pom file
  - Some refactoring
  - Add CHANGELOG
  - Update README
