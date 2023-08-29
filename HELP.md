# Run your Spring Boot application. 
 You can use tools like Postman to test the authentication and access control.
Here are the key endpoints to test:

* POST /authenticate: Authenticate by providing a JSON request body with username and password. It will return a JWT token.
* GET /admin: Accessible only to users with the "ADMIN" role and a valid JWT token.
* GET /manager: Accessible only to users with the "MANAGER" role and a valid JWT token.
 Remember to replace "your-secret-key" with your actual secret key in the JwtTokenUtil class.

This example demonstrates a basic JWT-based authentication and role-based access control setup in a Spring Boot application. In a production environment, you should consider additional security measures such as using strong password encoders, securing your secret key, and properly handling exceptions.