package br.com.ellyon.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Setar que esse arquivo é um controlador.
@RequestMapping // Annotation para criar rotas
public class NinjaController {

    @GetMapping("boasVindas") // Criar rota, ex.: localhost:8080/boasVindas
    public String boasVindas(){
        return "Essa é a minha primeira mensagem nessa rota!";
    }
}
