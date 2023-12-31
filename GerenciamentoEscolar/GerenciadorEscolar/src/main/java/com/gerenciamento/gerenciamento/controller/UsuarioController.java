package com.gerenciamento.gerenciamento.controller;

import com.gerenciamento.gerenciamento.Service.UsuarioService;
import com.gerenciamento.gerenciamento.model.Usuario;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.Collection;

@RestController
@RequestMapping("/usuario")
@AllArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;

    @PostMapping
    public void inserir(@RequestBody Usuario usuario) {
        usuarioService.salvar(usuario);
    }

    @GetMapping("/{id}")
    public Usuario buscarUsuario(@PathVariable Integer id){
        return usuarioService.buscarUsuario(id);
    }

    @GetMapping
    public Collection buscarTodos(){
        return usuarioService.buscarTodos();
    }

    @DeleteMapping
    public void remover(@RequestParam Integer id)  {
        usuarioService.remover(id);
    }

    @PutMapping
    public void atualizar(@RequestBody Usuario usuario) {
        usuarioService.salvar(usuario);
    }
}