package sp.senac.br.teste.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sp.senac.br.teste.entity.Usuario;
import sp.senac.br.teste.repositories.UsuarioRepository;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void salvar(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public Iterable<Usuario> listarTodos() {
        Iterable<Usuario> usuarios = usuarioRepository.findAll();

        return usuarios;
    }
}
