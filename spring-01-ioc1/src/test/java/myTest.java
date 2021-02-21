import com.peter.dao.UserDaoImpl;
import com.peter.dao.UserDaoMysqlImpl;
import com.peter.service.UserService;
import com.peter.service.UserServiceImpl;
import org.junit.Test;

public class myTest {
    @Test
    public void getUserTest(){
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUser(new UserDaoMysqlImpl());
        userService.getUser();
    }

}