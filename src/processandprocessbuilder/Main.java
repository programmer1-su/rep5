package processandprocessbuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		ProcessBuilder builder = new ProcessBuilder("ls");
		try {
			Process process = builder.start();
			InputStreamReader in = new InputStreamReader(process.getInputStream());
			BufferedReader br = new BufferedReader(in);
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			process.destroy();//停止する実行中のプロセス
			process.destroyForcibly();//停止する実行中のプロセス[process.destroy()より強い]
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
