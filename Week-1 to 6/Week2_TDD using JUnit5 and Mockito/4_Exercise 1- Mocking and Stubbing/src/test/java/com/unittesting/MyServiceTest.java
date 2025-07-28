package com.unittesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Use the mock in service
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Step 4: Verify and assert
        assertEquals("Mock Data", result);
        verify(mockApi).getData();  // Optional: verify interaction
    }
}
