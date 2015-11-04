package exeptiontutor;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import com.sun.tools.javac.util.BasicDiagnosticFormatter;

import java.io.PrintStream;
import java.sql.SQLOutput;

/**
 * Created by GEO on 28.02.15.
 */
public class MyExeprion extends Exception {

    @Override
    public void printStackTrace(PrintStream s) {
        System.err.println("It`s my first exeption!!!");
    }
}
