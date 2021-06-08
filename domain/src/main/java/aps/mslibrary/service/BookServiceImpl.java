package aps.mslibrary.service;

import aps.mslibrary.dto.BookDTO;
import aps.mslibrary.port.api.BookServicePort;
import aps.mslibrary.port.spi.BookPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class BookServiceImpl implements BookServicePort {
    private final BookPersistencePort persistence;

    @Override
    public BookDTO save(BookDTO dto) {
        return persistence.save(dto);
    }

    @Override
    public void delete(Long id) {
        persistence.delete(id);
    }

    @Override
    public BookDTO update(BookDTO dto) {
        return persistence.update(dto);
    }

    @Override
    public BookDTO findById(Long id) {
        return persistence.findById(id);
    }

    @Override
    public List<BookDTO> findAll() {
        return persistence.findAll();
    }
}