package api.endpoints;
import static io.restassured.RestAssured.given;
import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class UserEndpoints {
	
	public static Response createUser(User payload)
	{
	Response response=given()
		.accept(ContentType.JSON)
		.contentType(ContentType.JSON)
		.body(payload)
		
		.when()
		.post(Routes.post_url);
	return response;
	}
	public static Response GetUser(String username)
	{
	Response response=given()
			.accept(ContentType.JSON)
			.contentType(ContentType.JSON)
			.pathParam("username", username)
			
			.when()
			.get(Routes.get_url);
		return response;
		}
	public static Response UpdateUser(String username,User payload)
	{
	Response response=given()
			.accept(ContentType.JSON)
			.contentType(ContentType.JSON)
			.pathParam("username", username)
			.body(payload)
			
			.when()
		
	        .put(Routes.put_url);
		return response;
		}
	public static Response Delete(String username)
	{
	Response response=given()
			.accept(ContentType.JSON)
			
			.pathParam("username", username)
			
			.when()
		
	      .delete(Routes.del_url);
		return response;
		}
}

