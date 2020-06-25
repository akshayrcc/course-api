course-api  
----------
Demonstrates the capabilities of the Spring MVC Web framework through small and simple example of course-api.

In this showcase you'll see the following in action:

* The simplest possible CRUD.
* leveraging @Controller.
* Mapping Requests.
* Obtaining Request Data.
* Using the inbuilt derby database and Spring Data JPA.
* Spring boot.
* Spring CrudRepository.

Designing:
------------
- Identify the resources/entity.
- Check how consumer can access the resource using HTTP.

Resources and basic structure for course-api:
-----------------------------------------------
- Topic, Course, Lesson
 ____________________________________________________
|	    Topic1	 						| Topic2	|
|_______________________________________|___________|
|Course1     		|Course2			|Course3	|
|___________________|___________________|___________|
|Lesson1 | Lesson2	|Lesson2  | Lesson4	|Lesson5	|
|________|__________|_________|_________|___________|


Sample Requests URLs 
---------------------
1. GET  	 /topics
2. GET       /topics/t_id
3. POST		 /topics
4. PUT	 	 /topics/t_id
5. DELETE 	 /topics/t_id
6. GET		 /topics/t_id/courses
7. GET		 /topics/t_id/courses/c_id

Use
----
- Import this project as Spring Boot project.
- Build the same and let the maven download all the dependecies.
- For all the sample request response, check the file \course-api\sample request-response\course-api.postman_collection.json.
- Import this collection file into Postman rest client.
- Test the requests and responses.


