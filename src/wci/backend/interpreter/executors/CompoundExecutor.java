package wci.backend.interpreter.executors;

import java.util.ArrayList;

import wci.intermediate.*;
import wci.backend.interpreter.*;

/**
 * <h1>CompoundExecutor</h1>
 * 
 * <p>Execute a compound statement.</p>
 */
public class CompoundExecutor extends StatementExecutor {

    /**
     * Constructor.
     * @param parent the parent executor.
     */
    public CompoundExecutor(Executor parent)
    {
        super(parent);
    }

    public Object execute(ICodeNode node)
    {
        // Loop over the children of the COMPOUND node and execute each child.
        StatementExecutor statementExecutor = new StatementExecutor(this);
        ArrayList<ICodeNode> children = node.getChildren();
        for (ICodeNode child : children) {
            statementExecutor.execute(child);
        }

        return null;
    }
}
