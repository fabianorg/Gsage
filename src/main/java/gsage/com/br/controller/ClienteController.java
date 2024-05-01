package gsage.com.br.controller;

import gsage.com.br.model.Cliente;
import gsage.com.br.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteController {

    @Autowired(required = true)
    private ClienteRepository cr;

    @RequestMapping(value="/listarCliente", method = RequestMethod.GET)
    public ModelAndView form() {
        ModelAndView mv = new ModelAndView("formulario");
        Iterable<Cliente> contratos = cr.findAll();
        mv.addObject("contratos", contratos);
        return mv;
    }

    @RequestMapping(value="/cadastrarCliente", method = RequestMethod.POST)
    public String form(Cliente cliente) {
        cr.save(cliente);
        return "redirect:/cadastrarContrato";
    }

    @RequestMapping(value="/deletarContrato")
    public String deletarContrato(long id) {
        Cliente cliente = cr.findById(id);
        cr.delete(cliente);
        return "redirect:/cadastrarContrato";
    }

}
