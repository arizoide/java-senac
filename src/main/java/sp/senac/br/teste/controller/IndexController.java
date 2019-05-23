package sp.senac.br.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import sp.senac.br.teste.entity.Usuario;
import sp.senac.br.teste.repositories.UsuarioRepository;

@Controller
public class IndexController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("/index");

        populaBanco();

        return mv;
    }

    private void populaBanco() {
        for (int i = 0; i< 20; i++) {
            Usuario usuario = new Usuario("Ari" + (i+1), "ari@ari", "kh100hchareharriscado", "ADMIN");
            usuarioRepository.save(usuario);
        }
    }
}