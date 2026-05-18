package example.cashcard.repositories;

import org.springframework.data.repository.CrudRepository;
import example.cashcard.CashCard;

public interface CashCardRepository extends CrudRepository<CashCard, Long> {
    
}
