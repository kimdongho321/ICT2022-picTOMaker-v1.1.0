package kr.co.picTO.repo;

import kr.co.picTO.member.domain.local.BaseLocalUser;
import kr.co.picTO.member.domain.oauth2.BaseAuthRole;
import kr.co.picTO.member.domain.BaseLocalUserRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BaseLocalUserRepoTest {

    private static final String TEST_EMAIL = "naru5135@naver.com";
    private static final String TEST_PWD = "askldjflkas";
    private static final String TEST_NAME = "강준모";
    private static final String TEST_NICKNAME = "레이들로";
    private static final String TEST_PIC = "";

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseLocalUserRepoTest.class);

    @Autowired
    TestEntityManager testEntityManager;

    @Autowired
    BaseLocalUserRepo localUserRepo;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Test
    void findByEmail() {
        BaseLocalUser blu = BaseLocalUser.builder()
                .email(TEST_EMAIL)
                .password(passwordEncoder.encode(TEST_PWD))
                .name(TEST_NAME)
                .nickName(TEST_NICKNAME)
                .profile_image_url(TEST_PIC)
                .provider(BaseAuthRole.LOCAL.getKey())
                .build();

        testEntityManager.persist(blu);

        assertEquals("BLU findByEmail : ", blu, localUserRepo.findByEmail(TEST_EMAIL).get());
        LOGGER.info("BLU LOG : " + blu);
    }
}
