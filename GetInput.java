package session2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInput {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public String getInput(String message) throws IOException {
		System.out.println(message);
		String tempInput = br.readLine();
		return tempInput;
	}
}
