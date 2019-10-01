package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class SpotifyAccountServiceTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private AuthenticationService authenticationService;

    private SpotifyAccountService subject;

    @Before
    public void setUp() throws Exception {

        // will be executed before each test
        subject =  new SpotifyAccountService(authenticationService);
    }

    @Test
    public void whenUsernameAndPasswordInvalidThenExceptionThrown() {
        // Arrange

        String username = "john@test.com";
        String password = "uihuih465";

        // given , when, then, study Mockito
        BDDMockito.given(authenticationService.authenticate(Mockito.anyString(),
                Mockito.anyString()))
                .willReturn(false);
        expectedException.expect(SpotifyAccountNotValidException.class);

        // Act
        subject.verify(username, password);
        BDDMockito.verify(authenticationService).authenticate(username, password);
    }

    @Test
    public void whenUsernameAndPasswordValidThenAccountReturned(){

        // Arrange
        String username = "john@test.com";
        String password = "uihuih465";

        SpotifyAccount expectedAccount = new SpotifyAccount(username, password);

        // given , when, then, study Mockito
        BDDMockito.given(authenticationService.authenticate(Mockito.anyString(),
                Mockito.anyString()))
                .willReturn(true);

        // Act
        SpotifyAccount result = subject.verify(username, password);

        //Assert
        Assertions.assertThat(result).isEqualTo(expectedAccount);
    }

    @After
    public void tearDown() throws Exception {

    }
}
