import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GeneraConsulta {
    public DatosDivisa datosDolar(){
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/05f333215c60a047cb733a28/latest/USD"))
                .build();


        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), DatosDivisa.class);
        } catch (Exception e) {
            throw new RuntimeException("Divisa no encontrada, revise la información e inténtelo nuevamente");
        }

    }
}
