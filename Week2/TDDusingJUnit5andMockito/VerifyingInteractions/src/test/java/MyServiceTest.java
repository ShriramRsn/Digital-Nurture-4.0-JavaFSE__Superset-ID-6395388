import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class MyServiceTest {
    @Test
    public void testVerifyInteractionWithArguments() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.fetchData();
        verify(mockApi).getData("user123");
    }
}