package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.repository.dto.AddressDTORepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AddressDTORepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private AddressDTORepository addressDTORepository;

    @Test
    public void whenFindByName_thenReturnEmployee() {
        // given

    }
}
