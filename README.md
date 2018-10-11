# Oauth-Implicit

## IDE And Tools
* I used Intellij IDE to develop this sample application.
* I created a skeleton of the project from [Spring Boot's bootstrap site](https://start.spring.io/)
* Specified Gradle as my build system and selected web, security and security-oauth2 for my dependencies.

## App Dependencies
* Spring Boot starter web, starter security, test and security-oauth2 for handling HTTP requests, HTTP security, test and OAUTH 2 support respectively.
* JAXB to add support for Java 10.
* `json` for crafting JSON responses to  HTTP requests.
* `auth0-spring-security-api` for securing our API with Auth0.

## App Setup
* Create an Auth0 account.
* Create an API with audience `https://localhost:8080/api`. Give the API any name you want.
* In your Auth0 API, add a scope with name `Read:messages` and description `Read messages`
* Create an Auth0 application, give it a name of your choose. While creating the application set the **Allowed Callback URLs** to `http://localhost:8080`.

## Running the app.
* Get the domain of your Auth0 app and set it in your environment, `export DOMAIN=<DOMAIN-HERE>`
* Get the client Id of your Auth0 app and set it in your environment, `export CLIENT_ID=<CLIENT_ID-HERE>`
* Get the Auth0 API audience and set it in your environment, `export AUDIENCE=<AUDIENCE-HERE>`
* Set your issuer `export ISSUER=https://<Your-Domain-here>`
* Before running the app, set your issuer and API audience in the `application.yml` file of the Spring Boot application.
* Run the app from your terminal, like so `./gradlew bootRun`

## Testing the application
* Access the app by visiting `http://localhost:8080` in your browser.
* Login with the login button, once logged in, you can make API calls by clicking on the ping button or view your profile by clicking on the profile button and once you are done, logout with logout button.
