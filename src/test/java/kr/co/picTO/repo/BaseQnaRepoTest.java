package kr.co.picTO.repo;

import kr.co.picTO.community.domain.BaseUserQnaRepo;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BaseQnaRepoTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseQnaRepoTest.class);

    @Autowired
    TestEntityManager testEntityManager;

    @Autowired
    BaseUserQnaRepo userQnaRepo;
}
