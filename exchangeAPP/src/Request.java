import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request {
    private String coinBase = "";

    public Request(String coinBase) {
        this.coinBase = coinBase;
    }

    public CoinAPI gettingRequest() throws IOException, InterruptedException {

        String urlRequest = "https://v6.exchangerate-api.com/v6/d156fa0a2f2191b4cb159e51/latest/" + this.coinBase;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlRequest))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String jsonText = response.body();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Coin coinRecord = gson.fromJson(jsonText, Coin.class);

        return new CoinAPI(coinRecord);
    }
}