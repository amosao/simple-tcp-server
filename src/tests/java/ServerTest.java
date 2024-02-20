import br.com.ajdev.server.TcpMessage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;


public class ServerTest {

    @Test
    public void givenMessageClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        TcpMessage client = new TcpMessage();
        client.startConnection("127.0.0.1", 7878);

        String response = client.sendMessage("Hello Server");
        Assertions.assertEquals("Hello Client", response);
    }
}
