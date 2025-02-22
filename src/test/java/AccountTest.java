import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {

    public String name;
    public boolean result;

    public AccountTest(String name, boolean result) {
        this.result = result;
        this.name = name;
    }

    @Parameterized.Parameters(name = "Тест {index}")
    public static Object[][] getdata() {
        return new Object[][]{
                {"A A", true },
                {"Q QQQQQQPPPPPPPPPPP", true},
                {"Q QQQQQQPPPPPPPPPP", true},
                {"A Al", true },
                {"A Alp", true },
                {"Anna", false },
                {" An na", false },
                {"An na ", false },
                {"", false },
                {"A ", false },
                {" ", false },
                {"Q QQQQQQPPPPPPPPPPPg", false},
                {"Q QQQQQQPPPPPPPPPPggg", false},
        };
    }


    @Test
    public void NameLength3() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        Assert.assertEquals(result, actual);
    }


}
