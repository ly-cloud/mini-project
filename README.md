#The Mini Project
For CDS Technical Challenge

A simple Spring Boot web application with one endpoint.

##Build
1) Clone repository, ensure Maven is installed
2) Build the project using Maven with command `mvn clean install`
3) Run it with command `mvn spring-boot:run`
4) Test the endpoint:
    * GET request to http://localhost:8080/player/all

##Notes
* Java version 1.8 (in pom.xml)
* Lightweight H2 database was used, to check the JSON response against the database,
the H2 console can be access at http://localhost:8080/h2-console
    * JDBC URL: `jdbc:h2:./data`
    * User Name: `admin`
    * Password: `password`
* The .csv file being read into the database is in the resources folder
    * ./src/main/resources/players.csv
    * Can modify the existing data or append to it, restart the app and see the changes
    from the endpoint. Schema is fixed however.
* Included unit tests will run in Build Step 2
    * Or explicitly with command `mvn test`