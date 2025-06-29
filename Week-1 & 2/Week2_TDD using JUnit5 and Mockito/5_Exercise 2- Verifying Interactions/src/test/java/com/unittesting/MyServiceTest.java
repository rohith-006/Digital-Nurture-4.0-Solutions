package com.unittesting;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class); // Step 1: Create mock

        MyService service = new MyService(mockApi);  // Inject mock
        service.fetchData();                         // Step 2: Call method

        verify(mockApi).getData();                   // Step 3: Verify interaction
    }
}
