# JSON Web Token (JWT)
 JWT is a compact, self-contained means of representing and transmitting information between two parties, typically a client and a server, as a JSON object. JWTs are used for secure transmission of claims between these parties and can be digitally signed and optionally encrypted. They are commonly used for authentication and authorization in web applications and APIs.

Here's how JWT works and how it's used for authentication:

1. Header: Contains metadata about the type of token and the cryptographic algorithm used to sign it.
   Example:

   {
   "alg": "HS256",
   "typ": "JWT"
   }

2. Payload: Contains claims. Claims are statements about an entity (typically, the user) and additional data. There are three types of claims:
Registered claims: These are predefined claims like iss (issuer), sub (subject), aud (audience), exp (expiration time), and nbf (not before).
Public claims: These are user-defined claims that can be added to the payload.
Private claims: These are custom claims agreed upon by parties using the token.
Example:

{
"sub": "1234567890",
"name": "John Doe",
"admin": true
}

3.Signature: To create the signature part you have to take the encoded header, the encoded payload, a secret, and the algorithm specified in the header, and sign that.


### JWT is file format to store data in key-value format
### Jwt structure in to 3 parts 
### 1.Header 2.Data 3.signature (base64 encode)

### working 
1. make login request 
2. if credentials validated 
3. Create Bearer Token and pass
4. to make request pass the same token validate 
5. if validated send data


