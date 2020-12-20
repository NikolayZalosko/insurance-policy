EIS Test Task
=========

Prerequisites
-------------

* [Java Development Kit (JDK) 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Maven 3](https://maven.apache.org/download.cgi)

Build and Run
-------------

1. Run in the command line:
	```
	mvn spring-boot:run
	```

2. Open `http://localhost:8080/api/v1/policies` in a web browser.
Use Accept header for different response formats:
- 'Accept: application/json' for JSON
- 'Accept: application/xml' for XML

Data model in UML format can be found in data_model folder