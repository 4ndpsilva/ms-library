package aps.mslibrary.port.api;

import aps.mslibrary.dto.BookDTO;

import java.util.List;

public interface BookServicePort {
    BookDTO save(final BookDTO dto);

    void delete(final Long id);

    BookDTO update(final BookDTO dto);

    BookDTO findById(final Long id);

    List<BookDTO> findAll();
}