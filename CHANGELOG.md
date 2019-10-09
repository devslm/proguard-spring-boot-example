# Changelog

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
