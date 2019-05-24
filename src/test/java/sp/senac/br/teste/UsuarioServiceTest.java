package sp.senac.br.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sp.senac.br.teste.entity.Usuario;
import sp.senac.br.teste.repositories.UsuarioRepository;
import sp.senac.br.teste.service.UsuarioService;

import java.util.Collection;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuarioServiceTest {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioService usuarioService;

    @Before
    public void preparaTeste(){
        for (int i = 0; i< 20; i++) {
            Usuario usuario = new Usuario("Ari" + (i+1), "ari@ari", "kh100hchareharriscado", "ADMIN");
            usuarioRepository.save(usuario);
        }
    }

    @Test
    public void listarTodosUsuariosTeste() {
        Assert.assertEquals(20, ((Collection<?>)usuarioService.listarTodos()).size());
    }
}
