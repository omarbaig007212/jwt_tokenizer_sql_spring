# jwt_tokenizer_sql_spring

Download the code if not,download the .rar and extract open this file in Eclipse or IntelliJ IDEA java.

Download the ADVANCED REST client to test API
 
Download and setup MYSQL with credientials.

imp note! : rename the username and password in the "application.properties" folder with ur MYSQL credentials.

INSTRUCTIONS:

1.clear port 8080 then,run the SpringBootHelloWorldApplication in run mode.

2.go to url: http://localhost:8080/register in method: POST on the "ADVANCED REST client" and enter in the body a json array : {"username":"enter-value","password":"enter-value"}.

3.go to url: http://localhost:8080/authenticate  in method: POST on the "ADVANCED REST client" and enter in the body a json array : {"username":"enter-value","password":"enter-value"}.

4.copy the token generated.

5.go to url: http://localhost:8080/hello in method: GET on the "ADVANCED REST client" and create a new header and name it as Authorization in the value type: Bearer <paste copied token>

6.thank you
