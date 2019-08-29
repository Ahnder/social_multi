package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.Multiplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationServiceImpl implements MultiplicationService {

    private RandomGenerateService randomGenerateService;

    @Autowired
    public MultiplicationServiceImpl(RandomGenerateService randomGenerateService) {
        this.randomGenerateService = randomGenerateService;
    }

    @Override
    public Multiplication createRandomMultiplication() {
        int factorA = randomGenerateService.generateRandomFactor();
        int factorB = randomGenerateService.generateRandomFactor();
        return new Multiplication(factorA, factorB);
    }

}
