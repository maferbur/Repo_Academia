import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UsuarioServicioTest {

    private UsuarioServicio usuarioServicio;
    @BeforeEach
    public void setUp(){
        usuarioServicio = new UsuarioServicio();
        usuarioServicio.crearUsuario(0L, "Primer Usuario");
        usuarioServicio.crearUsuario(1L, "Segundo Usuario");

    }

    @DisplayName("SON iguales")
    @Test
    public void test1(){
        UsuarioDto esperado = new UsuarioDto(1L, "osito panda");
        final UsuarioDto resultado = usuarioServicio.crearUsuario(1L, "osito panda");
        Assertions.assertEquals(esperado, resultado);
        Assertions.assertEquals(esperado.id, resultado.id);
        Assertions.assertEquals(esperado.nombre, resultado.nombre, "los nombres son diferentes");
    }

    @DisplayName("NO son iguales")
    @Test
    public void test2(){
        UsuarioDto esperado = new UsuarioDto(1L, "griszzly");
        final UsuarioDto resultado = usuarioServicio.crearUsuario(1L, "panda");
        Assertions.assertNotEquals(esperado, resultado);
        Assertions.assertNotEquals(esperado.id, resultado.id);
        Assertions.assertNotEquals(esperado.nombre, resultado.nombre, "No son diferentes");
    }

    @DisplayName("EXISTE")
    @Test
    public void test3(){
        UsuarioDto esperado = new UsuarioDto(1L, "griszzly");
        final UsuarioDto resultado =
                usuarioServicio.obtenerUsuario(1L);
        Assertions.assertEquals(null, resultado);

    }

    @DisplayName("4")
    @Test
    public void test4(){
        UsuarioDto esperado = new UsuarioDto(1L, "nombre");
        final UsuarioDto resultado =
                usuarioServicio.obtenerUsuario(0L);
        Assertions.assertEquals(esperado, resultado);

    }

}
