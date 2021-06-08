package aps.mslibrary.adapter;

import aps.mslibrary.dto.BookDTO;
import aps.mslibrary.entity.Book;
import aps.mslibrary.mapper.BookMapper;
import aps.mslibrary.port.spi.BookPersistencePort;
import aps.mslibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookJpaAdapter implements BookPersistencePort {
    @Autowired
    private BookRepository repository;

    @Override
    public BookDTO save(final BookDTO dto) {
        final Book entity = BookMapper.INSTANCE.toEntity(dto);
        final Book entitySaved = repository.save(entity);
        return BookMapper.INSTANCE.toDTO(entitySaved);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public BookDTO update(BookDTO dto) {
        return save(dto);
    }

    @Override
    public BookDTO findById(Long id) {
        final Optional<Book> opEntity = repository.findById(id);
        return opEntity.isPresent() ? BookMapper.INSTANCE.toDTO(opEntity.get()) : null;
    }

    @Override
    public List<BookDTO> findAll() {
        final List<Book> entities = repository.findAll();
        return BookMapper.INSTANCE.toListDTO(entities);
    }
}