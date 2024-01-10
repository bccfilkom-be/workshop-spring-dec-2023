package bcc.workshop1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CheckHealthController {

    @Autowired
    private CheckHealthService service;

    @GetMapping("/check")
    public String check(){
        this.service.testing();
        return "Hello World";
    }

    @GetMapping("/uri/{id}")
    public String uri(
            @PathVariable("id") Long id
    ){
        return "mendapatkan uri " + id;
    }

    @GetMapping("/query")
    public String query(
           @RequestParam("query1") String query1
    ){
        return "get query 1 " + query1;
    }

    @PostMapping("/buku")
    public String postBuku(@RequestBody Buku buku){
        return "mendapatkan buku " + buku;
    }
}
