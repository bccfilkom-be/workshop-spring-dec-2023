package bcc.workshop1;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Transactional
@RequestMapping("/buku") // /buku/create /buku/get
public class BukuController {

    @Autowired
    private BukuRepository repository;

    @PostMapping("/create")
    public Buku insertBuku(@RequestBody Buku buku){
        return this.repository.save(buku);
    }

    @GetMapping("/{id}")
    public Buku getBukuById(@PathVariable("id") Long id){
        return this.repository.getBukuById(id);
    }
}
