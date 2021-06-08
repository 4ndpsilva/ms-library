package aps.mslibrary.controller;

import aps.mslibrary.dto.BookDTO;
import aps.mslibrary.port.api.BookServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookServicePort servicePort;

    @PostMapping
    public BookDTO save(@RequestBody BookDTO dto){
        return servicePort.save(dto);
    }

    @PutMapping("/{id}")
    public BookDTO update(@PathVariable Long id, @RequestBody BookDTO dto){
        return servicePort.save(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        servicePort.delete(id);
    }

    @GetMapping("/{id}")
    public BookDTO findById(@PathVariable Long id){
        return servicePort.findById(id);
    }

    @GetMapping
    public List<BookDTO> findAll(){
        return servicePort.findAll();
    }
}