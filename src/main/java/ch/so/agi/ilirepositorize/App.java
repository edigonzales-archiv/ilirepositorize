package ch.so.agi.ilirepositorize;

import java.io.IOException;

import ch.interlis.ili2c.Ili2cException;
import ch.interlis.iox.IoxException;

public class App {
    public static void main(String[] args) throws Ili2cException, IoxException, IOException {
        Repositorizer repositorizer = new Repositorizer();
        repositorizer.build("/Users/stefan/tmp/ilimodels.xml", "src/test/data/");
    }
}
