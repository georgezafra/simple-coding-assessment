# simple-coding-assessment
levelsBeyond - 
simple-restful-api
This was put together in Intellij. I used a maven project with spring boot to wire dependency injection. The deoendency injection is using constructor based dependencies using interfaces. The project is compose of a repository layer that connects to an in-memory database using Jda and H2 database. At startup the databse gets populated with three notes. There is also a domain class Note that defines the notes to be managed by the api. This repository layer is then injected to the Service Layer that implements all CRUD methods. The method in the sevice layer called findNoteByBody is incomplete. Finally there is a Controller layer that defines all endpoints and handles all http requests. The endpoint GET /api/notes?query=something, is not working. It is never executed and is always defaulting to GET /api/notes. I still need to resolve this issue. The project is configured to run in a tomcat server container. The file pom.xml contains a dependency to -webmvc that is not necessary and i forgot to delete.
Angular-Restful-Client
This was put together in eclipse. I did not include the tomcat server as part of the upload to gitnub.
The code is just an .jsp with some html and a function in angular to connect to the github api
I still neeed to find the correct URI in thegithub api to retrieve the list of issues in the angular repo of the last seven days
