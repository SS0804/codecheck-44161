package codecheck;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {

		List<String> paramList = new ArrayList<String>();

		for (int i = 0; i < args.length; i++) {
			paramList.add(args[i]);
		}

	}
}
