package test; /**
 *
 */

import test.ClienteServiceTest;
import test.ProdutoDAOTest;
import test.ProdutoServiceTest;
import test.VendaDAOTest;
import test.ClienteDaoTest;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDaoTest.class,
        ProdutoServiceTest.class, ProdutoDAOTest.class,
        VendaDAOTest.class})
public class AllTests {

}
