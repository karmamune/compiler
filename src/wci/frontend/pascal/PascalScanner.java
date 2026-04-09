package wci.frontend.pascal;

import wci.frontend.*;
import static wci.frontend.Source.EOF;

/**
 * <h1>PascalScanner</h1>
 * 
 * <p>The Pascal scanner.</p>
 */
public class PascalScanner extends Scanner {

    /**
     * Constructor.
     * @param source the source to be used with this scanner.
     */
    public PascalScanner(Source source)
    {
        super(source);
    }


    protected Token extractToken()
        throws Exception
    {   
        Token token;
        char currentChar = currentChar();

        if (currentChar == EOF) {
            token = new EofToken(source);
        }
        else {
            token = new Token(source);
        }

        return token;
    }
}
