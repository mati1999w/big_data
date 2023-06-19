import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://mindicador.cl/api");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Parsear la respuesta JSON utilizando la librería Gson
            Gson gson = new Gson();
            Indicators indicators = gson.fromJson(response.toString(), Indicators.class);

            // Mostrar los datos en la consola
            System.out.println("UF: " + indicators.uf.valor);
            System.out.println("IVP: " + indicators.ivp.valor);
            System.out.println("Dólar observado: " + indicators.dolar.valor);
            System.out.println("Euro: " + indicators.euro.valor);
            System.out.println("IPC: " + indicators.ipc.valor);
            System.out.println("UTM: " + indicators.utm.valor);
            System.out.println("Imacec: " + indicators.imacec.valor);
            System.out.println("TPM: " + indicators.tpm.valor);
            System.out.println("Libra de Cobre: " + indicators.libra_cobre.valor);
            System.out.println("Tasa de desempleo: " + indicators.tasa_desempleo.valor);
            System.out.println("Bitcoin: " + indicators.bitcoin.valor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Clase auxiliar para representar la estructura de datos de los indicadores
    private static class Indicators {
        private UF uf;
        private IVP ivp;
        private Dolar dolar;
        private Euro euro;
        private IPC ipc;
        private UTM utm;
        private Imacec imacec;
        private TPM tpm;
        private LibraCobre libra_cobre;
        private TasaDesempleo tasa_desempleo;
        private Bitcoin bitcoin;
    }

    private static class UF {
        private String codigo;
        private String nombre;
        private String unidad_medida;
        private String fecha;
        private double valor;
    }

    private static class IVP {
        private String codigo;
        private String nombre;
        private String unidad_medida;
        private String fecha;
        private double valor;
    }

    private static class Dolar {
        private String codigo;
        private String nombre;
        private String unidad_medida;
        private String fecha;
        private double valor;
    }

    private static class Euro {
        private String codigo;
        private String nombre;
        private String unidad_medida;
        private String fecha;
        private double valor;
    }

    private static class IPC {
        private String codigo;
        private String nombre;
        private String unidad_medida;
        private String fecha;
        private double valor;
    }

    private static class UTM {
        private String codigo;
        private String nombre;
        private String unidad_medida;
        private String fecha;
        private double valor;
    }

    private static class Imacec {
        private String codigo;
        private String nombre;
        private String unidad_medida;
        private String fecha;
        private double valor;
    }

    private static class TPM {
        private String codigo;
        private String nombre;
        private String unidad_medida;
        private String fecha;
        private double valor;
    }

    private static class LibraCobre {
        private String codigo;
        private String nombre;
        private String unidad_medida;
        private String fecha;
        private double valor;
    }

    private static class TasaDesempleo {
        private String codigo;
        private String nombre;
        private String unidad_medida;
        private String fecha;
        private double valor;
    }

    private static class Bitcoin {
        private String codigo;
        private String nombre;
        private String unidad_medida;
        private String fecha;
        private double valor;
    }
}
