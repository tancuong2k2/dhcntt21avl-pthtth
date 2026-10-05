package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiClientTcpServer {
	private static final int PORT = 5000;
	private static final int MAX_CLIENTS = 20;

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(MAX_CLIENTS);

		try (ServerSocket server = new ServerSocket(PORT)) {
			System.out.println("Multi-client server on port " + PORT);

			while (true) {
				Socket socket = server.accept();
				pool.submit(() -> {
					String client = String.valueOf(socket.getRemoteSocketAddress());
					System.out.println("Connected: " + client);
					try (socket) {
						MultiClientTcpServer.serve(socket);
					} catch (Exception e) {
						// TODO: handle exception
						System.err.println("Client " + client + " failed: " + e.getMessage());
					} finally {
						System.out.println("Disconnected: " + client);
					}
				});
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Server error: " + e.getMessage());
		} finally {
			pool.shutdown();
		}
	}

	static void serve(Socket socket) throws IOException {
		try (BufferedReader in = new BufferedReader(
				new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
				PrintWriter out = new PrintWriter(
						new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true)) {
			String request;
			while ((request = in.readLine()) != null) {
				String response = process(request);
				out.println(response);
				if (request.equalsIgnoreCase("QUIT"))
					break;
			}
		}
	}

	static String process(String request) {
		String trimmed = request.trim();
		if (trimmed.equalsIgnoreCase("PING"))
			return "OK PONG";
		if (trimmed.equalsIgnoreCase("TIME")) {
			return "OK " + LocalDateTime.now();
		}
		if (trimmed.equalsIgnoreCase("QUIT"))
			return "OK BYE";
		if (trimmed.regionMatches(true, 0, "UPPER ", 0, 6)) {
			return "OK " + trimmed.substring(6).toUpperCase(Locale.ROOT);
		}
		return "ERR UNKNOWN_COMMAND";
	}
}
