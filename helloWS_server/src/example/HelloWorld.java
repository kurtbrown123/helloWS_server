package example;

/**
 * Created by kurtb on 2/28/14.
 */

// instructions for creating the services.xml are at: http://oak.cs.ucla.edu/cs144/projects/axis/packaging.html
// create aar with:
//   .../helloWS/out/production/helloWS_server$

// service class
public class HelloWorld
{
  public String sayHelloWorldFrom(String from)
  {
      String result = "";
      try
      {
        String hostname = java.net.InetAddress.getLocalHost().getHostName();
        result = "Hello, world, from " + from + " on  " + hostname;
        System.out.println(result);
      }
      catch (java.net.UnknownHostException e)
      {
          System.out.println("exception!");
      }
    return result;
  }
}
