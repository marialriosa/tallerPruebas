import clases.Comuna;
import clases.SecretariaPlaneacion;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class SecretariaPlaneacionTest {

    @Test
    public void testCalcularPresupuesto() {
        // Configuración de datos de prueba
        Comuna comunaMock = mock(Comuna.class);
        when(comunaMock.contarBarrios()).thenReturn(3);
        when(comunaMock.contarNiñosEnComuna()).thenReturn(20);

        // Creación de la instancia de SecretaríaPlaneacion
        SecretariaPlaneacion secretaria = new SecretariaPlaneacion(1, "Ciudad");

        // Llamada al método a probar
        double presupuesto = secretaria.calcularPresupuesto();

        // Verificación del resultado
        assertEquals(152400.0, presupuesto, 0.01);
    }

    @Test
    public void testRepartirPresupuesto() {
        // Configuración de datos de prueba
        Comuna comunaMock = mock(Comuna.class);
        when(comunaMock.contarBarrios()).thenReturn(3);
        when(comunaMock.contarNiñosEnComuna()).thenReturn(20);

        // Creación de la instancia de SecretaríaPlaneacion
        SecretariaPlaneacion secretaria = new SecretariaPlaneacion(1, "Ciudad");

        // Llamada al método a probar
        secretaria.repartirPresupuesto();

        // Verificación del resultado
        // Aquí verificaríamos que se repartió el presupuesto correctamente, si fuera posible
    }
}
