package restAssuredTestcases;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
//import io.restassured.matcher.RestAssuredMatchers;


public class StarWars_RestAssuredAPI {
	
	
	@Test
	public void StarWar_RestAssured_ListOfAllCharacters(){
		
		given().
		when().
			get("https://swapi.dev/api/people/").
			then().
				assertThat().
				
				statusCode(200);
	}
		
	@Test
	
	public void StarWar_RestAssured_details_of_a_specified_StarWarsCharacter(){
		
		given().
		when().
			get("https://swapi.dev/api/people/1/").
			then().
				assertThat().
				
				statusCode(200);
	}
	
@Test
	
	public void StarWar_RestAssured_details_of_a_planet(){
		
		given().
		when().
			get("https://swapi.dev/api/planet/3/").
			then().
				assertThat().
				
				statusCode(200);
	}
				
			
		
	}

	

