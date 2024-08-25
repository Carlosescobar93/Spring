package tallerWeb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tallerWeb.model.Producto;

@Controller
public class ProductoController {
   static Producto producto = new Producto();
     @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
    }
   @GetMapping("/producto")
   public String Formulario(Model model){
    model.addAttribute("producto", producto);
    return "/paginas/formulario";
   }
   @PostMapping("/recibir")
   public String recibir(@ModelAttribute("producto" )Producto producto, Model model){
    System.out.println(producto);
    String str = "Consulta del producto: "+producto.getDescripcion();
    model.addAttribute("producto", producto);
    model.addAttribute("titulo", str);  
    return "/paginas/consulta";
   }
    @ModelAttribute("categorias")
    public List<String> listaCategorias(){
        List<String> categorias = new ArrayList<>();
        categorias.add("Procesadores");
        categorias.add("Video");
        categorias.add("Telefonia");
        categorias.add("Almacenamiento");
        categorias.add("Perifericos");
        categorias.add("Portatiles");
        categorias.add("Sonido");
        categorias.add("Comunicacion");
        categorias.add("videojuegos");
        categorias.add("Accesorios");
        return  categorias;
    } 
}
