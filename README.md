# Spring Boot Api
This is an example application, where users can be assigned courses they want to learn.

###Requirements
JDK version 1.8 or later, You can install it from following link:<br />
http://www.oracle.com/technetwork/java/javase/downloads/index.html <br />
set JDK path to your system through system properties.

####IDE: IntelliJ IDEA
You can download community edition of it from following link:<br />
https://www.jetbrains.com/idea/download/#section=windows <br />
Follow the pop up window and select the technologies whatever you required. 

#####Gradle
Gradle is an automation building tool. It came into market in 2012. Before this, There are two tools available in the market Maven and ANT. ANT was the first build tool released in 2000. ANT was developed for procedural based languages but to write build script the format is XML which is hierarchical based. Later, Maven was developed but writing complex build script is more harder than ANT. Gradle uses some efficient features of both tools.

####Database: PostgreSQL
It is an object-relational database system. It supports JSON and NoSQL system. MySQL doesn't support NOSQL and JSON indexing. <br />
Set the database username, password and your configured database port to the application.properties file.

###How to Start the Project?
Clone the source repository through Git: <br />
git clone https://github.com/shuvikash/RestApiDevelopment.git <br />

Now, open IntelliJ IDEA IDE and import the project from your cloned directory. Our project has following directory structure. <br />
src-> main-> java-> co.interleap.api <br />
The co.interleap.api package has three folders controllers, models and repositories.

#####Controllers:
Controllers are responsible for controlling the flow of the application execution. When browser requests for a page, a controller is responsible for returning the response for that request. It acts as the co-ordinator between model and view.

#####Model:
Model is responsible for managing the data of the application. It responds to the request from the controller to update itself and also responds to the request from the view. It deals with database.

######Repository:
Repository will take care of everything with databases. It extends an interface CRUD repository. CrudRepository is a Spring data interface and to use it we need to create our interface by extending CrudRepository for a specific type. It has several methods like save, findById, delete etc for handling the database. To use CrudRepository in our api we need to enable JPA repositories by adding dependecy to the build.gradle file.

#####JPA Repository
Generally, for database connectivity we need to write lots of code for intraction with databases whereas by using JPA, the burden of interacting with database reduces significantly. It forms a bridge between Java program and database program.

###Here we will discuss about used annotation in our project:
@RestController: It informs to the Spring framework to render the result back to the caller. <br />
@RequestMapping: It is used to provide routing information. It tells the spring to request should map to the corresponding                  method. <br />
@RequestBody: It indicates a method parameter should be bound to the body of the HTTP request. We are posting the data into               JSON format so it will convert the JSON into user class data. <br />
@Autowired:  It is used for automatic dependency injection. Because of this we don't have to initialize the object of              repository interface to the controller class.

#####Database Mapping:
@Entity : This defines that a class can be mapped to a table.It is mandatory for JPA to use. <br />
@Table: Here we define table name. <br />
@Id: It indicates that member field below is the primary key of this entity. <br />
@GeneratedValue: It is used to increment the specified field. <br />
@Column: It indiactes that following member should mapped to this column of database.

#####Application Entry Point:
@SpringBootApplication: This annotation indicates our entry point to the application.

###How to run the project?
You can run through terminal: <br />
command: gradlew bootRun <br />
or, you can run through IDE by Application.java file because there is main method.

###Project Functionalities:   
This api is developed in spring boot framework and database postgresql which is running on port 8086.<br />
Api manage to add and retrieve different functionalities like Add user, Add course, Fetch all users, Fetch all courses from database.<br />
Api is called by react applicaton which is running on port 8080.<br />
You can find react application in my repository.
