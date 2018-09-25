# KAS Technical Test
The idea is to build an API WebClient Rest which takes the results 
from a WebAPI Server. This API Server is running on Solr environment,
which means that WebClient API must query following its particular 
query definitions.

## Webclient API Entries

**Port**: The API is listening at localhost:**9696**
(defined at ***application.propierties***)
* **kasapi/result**: returns the first 10 results taken from the resource.
Query parameters are ***page*** and ***rows***; if they are not
explicitly specified, page=0 and rows=10 by default. Then query 
would be ***kasapi/result?page=0&rows=10***
* **kasapi/result/{id}**: returns the unique result which matches with
the parameter argument id. It is supposed to be unique id.
* **kasapi/result/name/{name}**: returns the unique result which matches with
the parameter argument name. It is supposed to be unique name.
* **kasapi/result/query/{query}**: returns the set of records which match
with the Solr query passed as a argument parameter. 
eg) ***kasapi/result/query/name:lloguer-mitja-per-superficie***

**Actuator Metrics**
* **actuator/metrics/**: various metrics information of the application.
* **actuator/metrics/{metricName}**: specific metric to show.
eg) ***actuator/metrics/system.cpu.usage***
* **actuator/httptrace**: Displays HTTP trace info for the last 
100 HTTP request/response.


## Webclient API Design
The WebClient API takes its source from the remote resource WebServer.
WebClient is a read only API which does not need to persist any
data, so we would not need any persistence application, discarding
then any on fly database.

This API should be built using Spring Boot framework and trying to 
take the advantage of a reactive environment as WebFlux framework
supports for Spring. As it was said before, there is no need of
persistence, so JPA and on fly DataBases as H2 will be discarded.

Then, the structure of the REST application would be:
```
SERVICE Layer (Interface)

which exposes the available read operations.
Its private implementation makes use of a reactive webclient
```

```
DTO specification
used for parsing the resource results.

```

```
CONTROLLER 
for handling API requests.

```

```
EXCEPTION 
custum exception detailing
```

### Prerequisites
In order to build and run this Spring Boot application, 
first you should have installed:
* **Java Development Kit** - *JDK >= 1.8.0_6X* - 
[Oracle Java](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
* **Maven Build Tool** - *version >= 3.3.X* - 
[Apache Maven](https://maven.apache.org/download.cgi)

### Build Management
* Command to compile and run the application: **mvn spring-boot:run**
* Command to compile and generate binaries: **mvn clean install**
* Command to run tests: **mvn test**

##### Runnable JAR
* In order to build a runnable JAR file with all dependencies included, 
type: **mvn clean package**. The file **~/target/kas-1.0.jar** will 
be generated.
* For running the application: **java -jar ~/target/kas-1.0.jar**. 