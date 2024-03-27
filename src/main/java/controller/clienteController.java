package controller;

import com.sun.tools.javac.Main;
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
    private ClienteRepository clienteRepositoryc; // Instanciando objeto para passar dados para Interfaces

    // ====================== || ======================
    //                  GET ALL CLIENTES
    // ====================== || ======================
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping // ENDPOIT (GET) - CONSULTAR TODOS OS ITENS
    public List<FoodResponseDTO> getAll(){
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        try {
            return foodList;
        }
        catch(Exception e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Ocorreu um erro: ", e);
        }
        return foodList;
    }








}
