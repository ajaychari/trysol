import java.util.Map;

public class envPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("USERNAME"));
		System.out.println(System.getenv("USERNAME"));
		Map<String, String> envar=System.getenv();
		System.out.println(envar.size());
		//display all environment variables
		for(String varname :envar.keySet())
		{
			System.out.println(varname+"------------->"+envar.get(varname));
		}

	}

}
