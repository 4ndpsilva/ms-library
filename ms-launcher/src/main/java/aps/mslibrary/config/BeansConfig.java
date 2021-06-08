package aps.mslibrary.config;

import aps.mslibrary.adapter.BookJpaAdapter;
import aps.mslibrary.port.api.BookServicePort;
import aps.mslibrary.port.spi.BookPersistencePort;
import aps.mslibrary.service.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    @Bean
    public BookPersistencePort bookPersistence(){
        return new BookJpaAdapter();
    }

    @Bean
    public BookServicePort bookService(){
        return new BookServiceImpl(bookPersistence());
    }
}