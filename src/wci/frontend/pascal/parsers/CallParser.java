package wci.frontend.pascal.parsers;

import java.util.ArrayList;
import java.util.EnumSet;

import wci.frontend.*;
import wci.frontend.pascal.*;
import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;
import wci.intermediate.icodeimpl.*;
import wci.intermediate.typeimpl.*;

import static wci.frontend.pascal.PascalTokenType.*;
import static wci.frontend.pascal.PascalErrorCode.*;
import static wci.intermediate.symtabimpl.SymTabKeyImpl.*;
import static wci.intermediate.symtabimpl.DefinitionImpl.*;
import static wci.intermediate.symtabimpl.RoutineCodeImpl.*;
import static wci.intermediate.icodeimpl.ICodeNodeTypeImpl.*;
import static wci.intermediate.icodeimpl.ICodeKeyImpl.*;
import static wci.intermediate.typeimpl.TypeFormImpl.*;

/**
 * <h1>CallParser</h1>
 * 
 * <p>Parse a called to a procedure or function.</p>
 */
public class CallParser extends StatementParser {

    /**
     * Constructor.
     * @param parent the parent parser.
     */
    public CallParser(PascalParserTD parent)
    {
        super(parent);
    }

    /**
     * Parse a call to declared procedure or function.
     * @param token the initial token.
     * @return the root node of the generated parse tree.
     * @throws Exception if an error occurred.
     */
    public ICodeNode parse(Token token)
        throws Exception
    {
        SymTabEntry pfId = symTabStack.lookup(token.getText().toLowerCase());
        
    }
}
