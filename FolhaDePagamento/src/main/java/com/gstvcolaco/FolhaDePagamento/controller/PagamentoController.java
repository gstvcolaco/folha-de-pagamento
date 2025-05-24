package com.gstvcolaco.FolhaDePagamento.controller;

import com.gstvcolaco.FolhaDePagamento.model.CalculaFolha;
import com.gstvcolaco.FolhaDePagamento.model.Funcionario;
import com.gstvcolaco.FolhaDePagamento.model.HoleriteDTO;
import com.gstvcolaco.FolhaDePagamento.model.Imposto;
import com.gstvcolaco.FolhaDePagamento.repository.FuncionarioRepository;
import com.gstvcolaco.FolhaDePagamento.repository.ImpostoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping({"/folha-de-pagamento"})
public class PagamentoController {
    @Autowired
    FuncionarioRepository fr;
    List<Funcionario> listaFuncionario;

    @Autowired
    ImpostoRepository ir;
    List<Imposto> listaImposto;

    @Autowired
    CalculaFolha cf;

    @GetMapping("/")
    public String listarFuncionario(Model model){
        listaFuncionario = fr.findAll();
        model.addAttribute("listafuncionario", listaFuncionario);
        return "lista-funcionario";
    }
    @GetMapping("/novo-funcionario")
    public String novoFuncionario(Model model){
        Funcionario funcionario = new Funcionario();
        model.addAttribute("funcionario", funcionario);
        return "insere-funcionario";
    }
    @GetMapping("/edita-funcionario")
    public String editaFuncionario(@RequestParam("id") Integer id, Model model){
        Optional<Funcionario> funcionario = fr.findById(id);
        if (funcionario.isPresent()){
            model.addAttribute("funcionario", funcionario.get());
            return "insere-funcionario";
        }
        return "redirect:/folha-de-pagamento/";
    }
    @GetMapping ("/exclui-funcionario")
    public String excluifuncionario(@RequestParam("id") Integer id){
        fr.deleteById(id);
        return "redirect:/folha-de-pagamento/";
    }
    @PostMapping("/salvar-funcionario")
    public String salvarFuncionario(@ModelAttribute("funcionario") Funcionario funcionario){
        fr.save(funcionario);
        return "redirect:/folha-de-pagamento/";
    }

    @GetMapping("/imposto")
    public String listarImposto(Model model){
        listaImposto = ir.findAll();
        model.addAttribute("listaimposto", listaImposto);
        return "lista-imposto";
    }

    @GetMapping("/novo-imposto")
    public String novoImposto(Model model){
        Imposto imposto = new Imposto();
        model.addAttribute("imposto", imposto);
        return "insere-imposto";
    }

    @GetMapping("/edita-imposto")
    public String editaImposto(@RequestParam("id") Integer id, Model model){
        Optional<Imposto> imposto = ir.findById(id);
        if (imposto.isPresent()){
            model.addAttribute("imposto", imposto.get());
            return "insere-imposto";
        }
        return "redirect:/folha-de-pagamento/imposto";
    }

    @GetMapping("/exclui-imposto")
    public String excluiImposto(@RequestParam("id") Integer id){
        ir.deleteById(id);
        return "redirect:/folha-de-pagamento/imposto";
    }

    @PostMapping("/salvar-imposto")
    public String salvarImposto(@ModelAttribute("imposto") Imposto imposto){
        ir.save(imposto);
        return "redirect:/folha-de-pagamento/imposto";
    }
    //Holerite
    @GetMapping("/holerite")
    public String listarHolerite(Model model){
        listaFuncionario = fr.findAll();
        List<HoleriteDTO> holerite = listaFuncionario.stream()
                .map(func -> cf.calculos(func))
                .toList();

        model.addAttribute("holerite", holerite);
        return "lista-holerite";
    }
}


