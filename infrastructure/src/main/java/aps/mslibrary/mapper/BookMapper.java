package aps.mslibrary.mapper;

import aps.mslibrary.dto.BookDTO;
import aps.mslibrary.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDTO toDTO(final Book entity);

    Book toEntity(final BookDTO dto);

    List<BookDTO> toListDTO(final List<Book> entities);

    List<Book> toListEntity(final List<Book> listDTO);
}