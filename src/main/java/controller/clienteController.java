package controller;

import com.sun.tools.javac.Main;
import model.DTO.ClienteResponseDTO;
import model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("consigpro")
public class clienteController {

    @Autowired
    private ClienteRepository clienteRepository; // Instanciando objeto para passar dados para Interfaces

    // ====================== || ======================
    //                  GET ALL CLIENTES
    // ====================== || ======================
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping // ENDPOIT (GET) - CONSULTAR TODOS OS ITENS
    public List<ClienteResponseDTO> getAll(){
        List<ClienteResponseDTO> clienteList = clienteRepository.findAll().stream().map(ClienteResponseDTO::new).toList();
        try {
            return clienteList;
        }
        catch(Exception e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "\nOcorreu um erro: ", e + "\n");
        }
        return clienteList;
    }









}
