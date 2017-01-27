package eriol.spark;

import static spark.Spark.get;
import static spark.Spark.port;

public class HelloWorldResource {
	public static void main(String[] args) {
		port(8088);
		get("/helloworld", (req, res) -> "Hello " + req.queryParams("name"));
	}	
}
